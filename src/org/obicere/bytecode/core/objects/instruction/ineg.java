package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class ineg extends Instruction {

    private static final String MNEMONIC = "ineg";
    private static final int    OPCODE   = 0x74;

    public ineg() {
        super(MNEMONIC, OPCODE);
    }
}
