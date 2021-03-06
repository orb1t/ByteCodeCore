package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.D2F;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultD2F extends AbstractInstruction implements D2F {

    public static final String MNEMONIC = "d2f";

    public static final D2F INSTANCE = new DefaultD2F();

    private DefaultD2F() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_D2F;
    }
}
