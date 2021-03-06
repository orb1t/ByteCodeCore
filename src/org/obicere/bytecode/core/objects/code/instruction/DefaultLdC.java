package org.obicere.bytecode.core.objects.code.instruction;

import org.javacore.code.instruction.LdC;
import org.javacore.constant.Constant;
import org.javacore.code.instruction.Instructions;

/**
 * @author Obicere
 */
public class DefaultLdC extends AbstractInstruction implements LdC {

    public static final String MNEMONIC = "ldc";

    private final Constant constant;

    public DefaultLdC(final Constant constant) {
        this.constant = constant;
    }

    @Override
    public Constant getConstant() {
        return constant;
    }

    @Override
    public String getMnemonic() {
        return MNEMONIC;
    }

    @Override
    public int getOpCode() {
        return Instructions.OPCODE_LDC;
    }
}
