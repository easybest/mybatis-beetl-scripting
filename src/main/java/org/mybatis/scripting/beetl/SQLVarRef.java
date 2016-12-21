package org.mybatis.scripting.beetl;

import org.beetl.core.Context;
import org.beetl.core.statement.VarRef;


public class SQLVarRef extends VarRef {

    public SQLVarRef(VarRef ref) {
        super(ref.attributes, ref.hasSafe, ref.safe, ref.token, ref.token);
        this.varIndex = ref.varIndex;
    }

    @Override
    public Object evaluate(Context ctx) {


        Object value = ctx.vars[varIndex];
        if (value == Context.NOT_EXIST_OBJECT) {
            ctx.getGlobal("_root");

        }
        return super.evaluate(ctx);
    }

}
