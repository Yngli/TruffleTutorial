package org.example.truffle;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public final class ArdenRootNode extends RootNode {
    @SuppressWarnings("FieldMayBeFinal")
    @Child
    private ArdenNode exprNode;

    public ArdenRootNode(ArdenNode exprNode) {
        super(null);

        this.exprNode = exprNode;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return this.exprNode.executeInt(frame);
    }
}
