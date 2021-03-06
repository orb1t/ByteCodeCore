package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpLe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpLe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpLeReader implements Reader<If_ICmpLe> {

    @Override
    public If_ICmpLe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpLe(input.readLabel(index));
    }
}