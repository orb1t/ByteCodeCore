package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class faload extends Instruction {

    private static final String MNEMONIC = "faload";
    private static final int    OPCODE   = 0x30;

    public faload() {
        super(MNEMONIC, OPCODE);
    }
}
