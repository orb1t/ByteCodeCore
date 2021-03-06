package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.FloatElementValue;
import org.javacore.constant.ConstantFloat;
import org.obicere.bytecode.core.objects.annotation.DefaultFloatElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FloatElementValueReader implements Reader<FloatElementValue> {
    @Override
    public FloatElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantFloat value = input.readConstant();
        return new DefaultFloatElementValue(value.getValue());
    }
}
