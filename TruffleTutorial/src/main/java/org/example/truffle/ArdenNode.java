package org.example.truffle;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class ArdenNode extends Node {
    public abstract int executeInt(VirtualFrame frame);
}
