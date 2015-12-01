package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dreturn extends Instruction {

    private static final String MNEMONIC = "dreturn";
    private static final int    OPCODE   = 0xaf;

    public dreturn() {
        super(MNEMONIC, OPCODE);
    }
}
