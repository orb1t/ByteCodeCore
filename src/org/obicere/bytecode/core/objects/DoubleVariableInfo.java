package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;

/**
 */
public class DoubleVariableInfo extends VerificationTypeInfo {

    public DoubleVariableInfo(final int tag) {
        super(tag);
    }

    @Override
    public void model(final DocumentBuilder builder) {
        builder.addKeyword("double");
    }

}
