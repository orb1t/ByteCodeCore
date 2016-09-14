package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.astore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_2Reader implements Reader<astore_2> {

    @Override
    public astore_2 read(final ByteCodeReader input) throws IOException {
        return astore_2.INSTANCE;
    }
}
