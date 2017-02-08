package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LReturn;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultLReturn extends AbstractInstruction implements LReturn {

    public static final String MNEMONIC = "lreturn";

    public static final LReturn INSTANCE = new DefaultLReturn();

    private DefaultLReturn() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_LRETURN;
    }
}
