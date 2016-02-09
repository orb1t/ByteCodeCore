package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class dup_x2 extends Instruction {

    public static final String IDENTIFIER = "dup_x2";
    private static final int    OPCODE   = 0x5b;

    public dup_x2() {
        super(IDENTIFIER, OPCODE);
    }
}
