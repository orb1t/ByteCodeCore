package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class lshl extends Instruction {

    private static final String MNEMONIC = "lshl";
    private static final int    OPCODE   = 0x79;

    public lshl() {
        super(MNEMONIC, OPCODE);
    }
}
