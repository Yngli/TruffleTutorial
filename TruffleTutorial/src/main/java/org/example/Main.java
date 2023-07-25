package org.example;


import com.oracle.truffle.api.CallTarget;

import org.example.truffle.AdditionNode;
import org.example.truffle.ArdenNode;
import org.example.truffle.IntLiteralNode;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        ArdenNode exprNode = new AdditionNode(new IntLiteralNode(10), new IntLiteralNode(12));
        var rootNode = new org.example.truffle.ArdenRootNode(exprNode);
        CallTarget callTarget = rootNode.getCallTarget();

        var result = callTarget.call();

    }

}

