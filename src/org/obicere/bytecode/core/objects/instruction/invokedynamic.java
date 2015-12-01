package org.obicere.bytecode.core.objects.instruction;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 * @author Obicere
 */
public class invokedynamic extends Instruction {

    private static final String MNEMONIC = "invokedynamic";
    private static final int    OPCODE   = 0xba;

    private final int indexbyte1;
    private final int indexbyte2;

    public invokedynamic(final int indexbyte1, final int indexbyte2, final int indexbyte3, final int indexbyte4) {
        super(MNEMONIC, OPCODE);
        if (indexbyte3 != 0 || indexbyte4 != 0) {
            throw new ClassFormatError("invokedynamic bytes 3 and 4 must be set to 0.");
        }
        this.indexbyte1 = indexbyte1;
        this.indexbyte2 = indexbyte2;
    }

    public int getIndexbyte1() {
        return indexbyte1;
    }

    public int getIndexbyte2() {
        return indexbyte2;
    }

    public int getIndex(){
        return (indexbyte1 << 8) | indexbyte2;
    }

    @Override
    public void model(final DocumentBuilder builder) {
        super.model(builder);
        builder.tab();
        builder.getConstantPool().get(getIndex()).modelValue(builder);
        builder.tab();
        builder.add(0);
        builder.tab();
        builder.add(0);
    }
}
