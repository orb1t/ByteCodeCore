package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LUShR;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLUShR extends AbstractInstruction implements LUShR {

    public static final String MNEMONIC = "lushr";

    public static final LUShR INSTANCE = new DefaultLUShR();

    private DefaultLUShR() {
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LUSHR;
    }
}
