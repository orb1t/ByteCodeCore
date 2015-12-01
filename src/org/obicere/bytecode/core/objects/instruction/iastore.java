package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class iastore extends Instruction {

    private static final String MNEMONIC = "iastore";
    private static final int    OPCODE   = 0x4f;

    public iastore() {
        super(MNEMONIC, OPCODE);
    }
}
