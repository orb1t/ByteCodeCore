package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class baload extends Instruction {

    private static final String MNEMONIC = "baload";
    private static final int    OPCODE   = 0x33;

    public baload() {
        super(MNEMONIC, OPCODE);
    }
}
