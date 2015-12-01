package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.BootstrapMethod;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BootstrapMethodReader implements Reader<BootstrapMethod> {
    @Override
    public BootstrapMethod read(final IndexedDataInputStream input) throws IOException {
        final int bootstrapMethodRef = input.readUnsignedShort();
        final int numBootstrapArguments = input.readUnsignedShort();
        final int[] bootstrapArguments = new int[numBootstrapArguments];
        for(int i = 0; i < numBootstrapArguments; i++){
            bootstrapArguments[i] = input.readUnsignedShort();
        }
        return new BootstrapMethod(bootstrapMethodRef, bootstrapArguments);
    }
}
