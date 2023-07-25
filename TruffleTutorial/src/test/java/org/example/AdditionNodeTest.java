package org.example;

import com.oracle.truffle.api.CallTarget;

import org.example.truffle.AdditionNode;
import org.example.truffle.ArdenNode;
import org.example.truffle.ArdenRootNode;
import org.example.truffle.IntLiteralNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

class AdditionNodeTest {
    @ParameterizedTest
    @ValueSource(ints = {10,12,22})
    public void AdditionCorrectly(int leftNode, int rightNode, int sum) {
        ArdenNode exprNode = new AdditionNode(new IntLiteralNode(leftNode), new IntLiteralNode(rightNode));

        var rootNode = new ArdenRootNode(exprNode);
        CallTarget callTarget = rootNode.getCallTarget();

        var result = callTarget.call();

        assertEquals(sum,result);
    }
}