package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_1Reader implements Reader<DefaultFConst_1> {

    @Override
    public DefaultFConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultFConst_1.INSTANCE;
    }
}