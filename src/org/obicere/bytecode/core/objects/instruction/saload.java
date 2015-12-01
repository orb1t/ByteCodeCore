package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class saload extends Instruction {

    private static final String MNEMONIC = "saload";
    private static final int    OPCODE   = 0x35;

    public saload() {
        super(MNEMONIC, OPCODE);
    }
}
