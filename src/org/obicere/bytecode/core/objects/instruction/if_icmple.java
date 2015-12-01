package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.core.objects.CodeAttribute;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class if_icmple extends Instruction {

    private static final String MNEMONIC = "if_icmple";
    private static final int    OPCODE   = 0xa4;

    private final int branchbyte1;
    private final int branchbyte2;

    public if_icmple(final int branchbyte1, final int branchbyte2) {
        super(MNEMONIC, OPCODE);
        this.branchbyte1 = branchbyte1;
        this.branchbyte2 = branchbyte2;
    }

    public int getBranchbyte1(){
        return branchbyte1;
    }

    public int getBranchbyte2(){
        return branchbyte2;
    }

    public int getBranchOffset(){
        return (branchbyte1 << 8) | branchbyte2;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        super.model(builder);
        builder.tab();
        final CodeAttribute code = (CodeAttribute) builder.getProperty("code");
        final String line = code.getBlockName(getStart(), (short) getBranchOffset());
        if (line == null) {
            builder.add((short) getBranchOffset());
        } else {
            builder.add(line);
        }
    }
}
