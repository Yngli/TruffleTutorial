package org.example.truffle;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public final class AdditionNode extends ArdenNode {
    @SuppressWarnings("FieldMayBeFinal")
    @Node.Child
    private ArdenNode leftNode, rightNode;

    public AdditionNode(ArdenNode leftNode, ArdenNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        int leftValue = this.leftNode.executeInt(frame);
        int rightValue = this.rightNode.executeInt(frame);
        return leftValue + rightValue;
    }
}
