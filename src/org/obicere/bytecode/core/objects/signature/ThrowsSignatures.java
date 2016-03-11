package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.ByteCodeElement;

import java.util.LinkedList;

/**
 */
public class ThrowsSignatures extends ByteCodeElement {

    public static final String IDENTIFIER = "ThrowsSignatures";

    private final ThrowsSignature[] signatures;

    public ThrowsSignatures(final ThrowsSignature[] signatures) {
        this.signatures = signatures;
    }

    public static ThrowsSignatures parse(final QueueString string) {
        final LinkedList<ThrowsSignature> throwsList = new LinkedList<>();
        while (string.hasNext()) {
            final ThrowsSignature throwsSignature = ThrowsSignature.parse(string);
            if (throwsSignature == null) {
                return null;
            }
            throwsList.add(throwsSignature);
        }
        final ThrowsSignature[] throwsSignatures = throwsList.toArray(new ThrowsSignature[throwsList.size()]);
        return new ThrowsSignatures(throwsSignatures);
    }

    public ThrowsSignature[] getSignatures() {
        return signatures;
    }

    public int size() {
        return signatures.length;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}