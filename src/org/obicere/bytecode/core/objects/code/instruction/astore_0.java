package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class astore_0 extends Instruction {

    public static final String IDENTIFIER = "astore_0";

    public static final astore_0 INSTANCE = new astore_0();

    private astore_0() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_ASTORE_0;
    }
}