package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attributes;
import org.javacore.attribute.LocalVariableTypeTableAttribute;
import org.javacore.code.LocalVariable;

/**
 * @author Obicere
 */
public class DefaultLocalVariableTypeTableAttribute extends AbstractAttribute implements LocalVariableTypeTableAttribute {

    private final LocalVariable[] localVariableTypeTable;

    public DefaultLocalVariableTypeTableAttribute(final LocalVariable[] localVariableTypeTable) {
        super(Attributes.LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE_NAME);
        if (localVariableTypeTable == null) {
            throw new NullPointerException("local variable type table must be non-null");
        }

        this.localVariableTypeTable = localVariableTypeTable;
    }

    @Override
    public LocalVariable[] getTable() {
        return localVariableTypeTable;
    }

    @Override
    public int getAttributeLength() {
        return 0;
    }
}
