package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.SuperTypeTarget;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SuperTypeTargetReader implements Reader<SuperTypeTarget> {
    @Override
    public SuperTypeTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int superTypeTarget = input.readUnsignedShort();
        return new SuperTypeTarget(targetType, superTypeTarget);
    }
}
