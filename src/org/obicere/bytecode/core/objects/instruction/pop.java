package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class pop extends Instruction {

    public static final String IDENTIFIER = "pop";
    private static final int    OPCODE   = 0x57;

    public pop() {
        super(IDENTIFIER, OPCODE);
    }
}
