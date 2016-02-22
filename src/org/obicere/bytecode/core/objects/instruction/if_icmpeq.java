package org.obicere.bytecode.core.objects.instruction;

/**
 * @author Obicere
 */
public class if_icmpeq extends Instruction {

    public static final String IDENTIFIER = "if_icmpeq";
    private static final int    OPCODE   = 0x9f;

    private final int branchbyte1;
    private final int branchbyte2;

    public if_icmpeq(final int branchbyte1, final int branchbyte2) {
        super(IDENTIFIER, OPCODE);
        this.branchbyte1 = branchbyte1;
        this.branchbyte2 = branchbyte2;
    }

    public int getBranchbyte1() {
        return branchbyte1;
    }

    public int getBranchbyte2() {
        return branchbyte2;
    }

    public int getBranchOffset() {
        return (branchbyte1 << 8) | branchbyte2;
    }
}
