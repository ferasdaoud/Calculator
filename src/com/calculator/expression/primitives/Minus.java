package com.calculator.expression.primitives;

import com.calculator.expression.Expression;

final class Minus implements Expression {

    private final Expression leftOperand;
    private final Expression rightOperand;

    Minus(final Expression left,
          final Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret()  {
        return this.rightOperand.interpret() - this.leftOperand.interpret();
    }
}