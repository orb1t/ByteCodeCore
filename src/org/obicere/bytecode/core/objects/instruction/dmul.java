package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dmul extends Instruction {

    private static final String MNEMONIC = "dmul";
    private static final int    OPCODE   = 0x6b;

    public dmul() {
        super(MNEMONIC, OPCODE);
    }
}
