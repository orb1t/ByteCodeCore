package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDup2_x2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
*/
public class dup2_x2Reader implements Reader<DefaultDup2_x2> {

    @Override
    public DefaultDup2_x2 read(final ByteCodeReader input) throws IOException {
        return DefaultDup2_x2.INSTANCE;
    }
}