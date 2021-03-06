package org.obicere.bytecode.core.objects.type;

import org.javacore.type.IntegralType;

/**
 * @author Obicere
 */
public final class IntType implements IntegralType {

    private static final IntType TYPE = new IntType();

    private IntType() {

    }

    public static IntType getInstance() {
        return TYPE;
    }

    @Override
    public String getName() {
        return "int";
    }

    @Override
    public String getSimpleName() {
        return "int";
    }

    @Override
    public String getCanonicalName() {
        return "int";
    }
}
