package org.obicere.bytecode.core.objects.code.instruction;

import org.obicere.bytecode.core.reader.code.instruction.InstructionReader;

/**
 * @author Obicere
 */
public class d2i extends Instruction {

    public static final String IDENTIFIER = "d2i";

    public static final d2i INSTANCE = new d2i();

    private d2i() {
    }

    @Override
    public String getMnemonic() {
        return IDENTIFIER;
    }

    @Override
    public byte getOpcode() {
        return InstructionReader.OPCODE_D2I;
    }
}