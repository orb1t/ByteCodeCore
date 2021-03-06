package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ArrayElementValue;
import org.javacore.annotation.ElementValue;
import org.javacore.annotation.ElementValues;

/**
 * @author Obicere
 */
public class DefaultArrayElementValue extends AbstractElementValue implements ArrayElementValue {

    private final ElementValue[] values;

    public DefaultArrayElementValue(final ElementValue[] values) {
        super(ElementValues.TAG_ARRAY);
        if (values == null) {
            throw new NullPointerException("values must be non-null");
        }

        this.values = values;
    }

    public ElementValue[] getValues() {
        return values;
    }
}
