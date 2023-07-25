package org.example.truffle;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class IntLiteralNode extends ArdenNode {
    private final int value;

    public IntLiteralNode(int value) {
        this.value = value;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        return this.value;
    }
}
