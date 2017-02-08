package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lnegReader implements Reader<DefaultLNeg> {

    @Override
    public DefaultLNeg read(final ByteCodeReader input) throws IOException {
        return DefaultLNeg.INSTANCE;
    }
}