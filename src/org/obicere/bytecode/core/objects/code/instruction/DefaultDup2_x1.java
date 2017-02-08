package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.Dup2_x1;
import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class DefaultDup2_x1 extends AbstractInstruction implements Dup2_x1 {

    public static final String MNEMONIC = "dup2_x1";

    public static final Dup2_x1 INSTANCE = new DefaultDup2_x1();

    private DefaultDup2_x1() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return InstructionReader.OPCODE_DUP2_X1;
    }
}
