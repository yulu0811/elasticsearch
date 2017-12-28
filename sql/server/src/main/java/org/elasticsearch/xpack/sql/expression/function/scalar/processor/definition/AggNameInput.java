/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.sql.expression.function.scalar.processor.definition;

import org.elasticsearch.xpack.sql.expression.Expression;

public class AggNameInput extends NonExecutableInput<String> {

    public AggNameInput(Expression expression, String context) {
        super(expression, context);
    }

    @Override
    public final boolean supportedByAggsOnlyQuery() {
        return true;
    }

    @Override
    public final ProcessorDefinition resolveAttributes(AttributeResolver resolver) {
        return this;
    }
}
