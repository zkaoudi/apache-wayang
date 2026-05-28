package org.apache.wayang.postgres.operators;

import org.apache.wayang.basic.data.Record;
import org.apache.wayang.basic.operators.GlobalReduceOperator;
import org.apache.wayang.core.function.ReduceDescriptor;
import org.apache.wayang.jdbc.operators.JdbcGlobalReduceOperator;

public class PostgresGlobalReduceOperator extends JdbcGlobalReduceOperator implements PostgresExecutionOperator {
    public PostgresGlobalReduceOperator(final ReduceDescriptor<Record> reduceDescriptor) {
        super(reduceDescriptor);
    }
    
    public PostgresGlobalReduceOperator(GlobalReduceOperator<Record> that) {
        super(that);
    }

    @Override
    protected PostgresGlobalReduceOperator createCopy() {
        return new PostgresGlobalReduceOperator(this);
    }
}
