package cyen.bytecode.instruction.jump;

import cyen.bytecode.ExecContext;
import cyen.bytecode.instruction.IBytecodeInsn;
import cyen.data.ICyenData;

public class InsnIfGoto implements IBytecodeInsn {
    private final int n;

    public InsnIfGoto( int n ) {
        this.n = n;
    }

    @Override
    public void execute( ExecContext ctx ) {
        ICyenData data = ctx.pop();
        if( data.booleanize( ctx ) ) {
            ctx.goTo( n );
        }
    }
}
