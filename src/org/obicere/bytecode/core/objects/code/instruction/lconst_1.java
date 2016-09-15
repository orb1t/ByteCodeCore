package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class lconst_1 extends Instruction {

    public static final String IDENTIFIER = "lconst_1";

    public static final lconst_1 INSTANCE = new lconst_1();

    private lconst_1() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_LCONST_1;
    }
}