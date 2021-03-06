package cyen.bytecode.instruction.jump;

import cyen.bytecode.ExecContext;
import cyen.bytecode.instruction.IBytecodeInsn;

public class InsnGoto implements IBytecodeInsn {
    private final int n;

    public InsnGoto( int n ) {
        this.n = n;
    }

    @Override
    public void execute( ExecContext ctx ) {
        ctx.goTo( n );
    }
}
