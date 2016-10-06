package com.calculator.expression.primitives;

import com.calculator.expression.Expression;

final class Variable implements Expression {

    private final String name;
    private final VariablesScope variables;

    Variable(final String name,
             final VariablesScope variablesScope) {
        this.name = name;
        this.variables = variablesScope;
    }

    @Override
    public int interpret()  {
        return this.variables.lookup(this.name).interpret();
    }

}
