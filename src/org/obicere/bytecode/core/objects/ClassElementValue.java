package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;
import org.obicere.bytecode.viewer.util.ByteCodeUtils;

/**
 * @author Obicere
 */
public class ClassElementValue extends ElementValue {

    private static final int TAG = 'B';

    private final int classInfoIndex;

    public ClassElementValue(final int classInfoIndex) {
        super(TAG);
        this.classInfoIndex = classInfoIndex;
    }

    public int getClassInfoIndex() {
        return classInfoIndex;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        final ConstantPool constantPool = builder.getConstantPool();
        final String type = ByteCodeUtils.getQualifiedName(constantPool.getAsString(classInfoIndex));
        builder.tab();
        builder.add(type + ".");
        builder.addKeyword("class");
    }
}
