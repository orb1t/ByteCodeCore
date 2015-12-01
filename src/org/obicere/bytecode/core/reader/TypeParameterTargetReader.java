package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.TypeParameterTarget;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeParameterTargetReader implements Reader<TypeParameterTarget> {

    @Override
    public TypeParameterTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int typeParameterIndex = input.readUnsignedByte();
        return new TypeParameterTarget(targetType, typeParameterIndex);
    }
}
