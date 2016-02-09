package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class bipush extends Instruction {

    public static final String IDENTIFIER = "bipush";
    private static final int    OPCODE   = 0x10;

    private final int value;

    public bipush(final int value) {
        super(IDENTIFIER, OPCODE);
        this.value = value;
    }

    public int getByte() {
        return value;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        super.model(builder);
        builder.tab();
        builder.add((byte) value);
    }
}
