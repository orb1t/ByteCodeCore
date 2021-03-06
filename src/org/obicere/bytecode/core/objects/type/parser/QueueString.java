package org.obicere.bytecode.core.objects.type.parser;

/**
 */
public class QueueString {

    private final char[] content;

    private volatile int index;

    public QueueString(final String content) {
        this.content = content.toCharArray();
    }

    public QueueString(final QueueString queue) {
        this.index = queue.index;
        this.content = queue.content;
    }

    public QueueString save() {
        return new QueueString(this);
    }

    public void restoreTo(final QueueString string) {
        if (content != string.content) {
            throw new IllegalArgumentException("queue strings do not share the same content");
        }
        this.index = string.index;
    }

    public char next() {
        if(index >= content.length) {
            return '\0';
        }
        return content[index++];
    }

    public char peek() {
        if(index >= content.length) {
            return '\0';
        }
        return content[index];
    }

    public boolean hasNext() {
        return index < content.length;
    }

    public boolean hasNext(final char symbol) {
        if(!hasNext()){
            return false;
        }
        final int storeIndex = index;

        boolean found = false;
        while (hasNext()) {
            if (next() == symbol) {
                found = true;
                break;
            }
        }

        index = storeIndex;
        return found;
    }

    public void reset() {
        index = 0;
    }

    public String nextIdentifier() {
        if (!hasNext()) {
            return null;
        }
        char next = peek();
        if (!Character.isJavaIdentifierPart(next)) {
            return null;
        }
        final StringBuilder identifier = new StringBuilder();
        while (Character.isJavaIdentifierPart(next)) {
            identifier.append(next());
            if (!hasNext()) {
                return null;
            }
            next = peek();
        }
        if (next != '.' && next != '<' && next != ':' && next != '/' && next != ';') {
            return null;
        }
        return identifier.toString();
    }

    @Override
    public String toString() {
        if(index >= content.length) {
            return "";
        }
        final int count = content.length - index;
        final char[] string = new char[count];
        System.arraycopy(content, index, string, 0, count);
        return new String(string);
    }

}
