package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.objects.signature.FieldSignature;
import org.obicere.bytecode.core.objects.signature.JavaTypeSignature;
import org.obicere.bytecode.core.objects.signature.MethodSignature;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 */
public abstract class AbstractConstantMethodRef extends Constant {

    private final int classIndex;
    private final int nameAndTypeIndex;

    public AbstractConstantMethodRef(final int tag, final int classIndex, final int nameAndTypeIndex) {
        super(tag);
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return constantPool.getAsString(classIndex) + ";" + constantPool.getAsString(nameAndTypeIndex);
    }

    @Override
    public void modelValue(final DocumentBuilder builder) {
        final ConstantPool constantPool = builder.getConstantPool();

        final String rawName = constantPool.getAsString(getClassIndex());
        final FieldSignature parsed = SignatureAttribute.parseField(rawName);
        final FieldSignature classSignature;

        if (parsed == null) {
            classSignature = SignatureAttribute.parseField("L" + rawName + ";");
        } else {
            classSignature = parsed;
        }

        final ConstantNameAndType nameAndType = (ConstantNameAndType) constantPool.get(getNameAndTypeIndex());
        final String name = constantPool.getAsString(nameAndType.getNameIndex());
        final String descriptor = constantPool.getAsString(nameAndType.getDescriptorIndex());

        final boolean isConstructor = name.equals("<init>");
        final boolean isStatic = name.equals("<clinit>");

        final MethodSignature methodSignature = SignatureAttribute.parseMethod(descriptor);

        builder.indent();
        builder.newLine();

        if (!isConstructor && !isStatic) {
            methodSignature.modelReturnType(builder);
            builder.pad(1);
        }

        if (isStatic) {
            builder.addKeyword("static");
        } else if (isConstructor) {
            builder.addKeyword("new ");
            classSignature.model(builder);
            //builder.add(className);
        } else {

            classSignature.model(builder);
            builder.add("#");
            builder.add(name);
        }

        final JavaTypeSignature[] types = methodSignature.getParameters();
        // if there are less than 4 types, we can just inline and it
        // puts it all on one line and looks a bit better I think
        // TODO: toggleable
        final boolean inline = types.length < 4;

        builder.add("(");
        if (!inline) {
            builder.indent();
        }

        boolean first = true;
        for (final JavaTypeSignature type : types) {
            if (!first) {
                builder.comma();
            }
            if (!inline) {
                builder.newLine();
            }
            type.model(builder);
            first = false;
        }

        // close the parameters
        if (!inline) {
            builder.unindent();
        }

        // only break the () if there was a parameter
        if (!inline && types.length > 0) {
            builder.newLine();
        }
        builder.add(") ");

        // close the method
        builder.unindent();
    }
}
