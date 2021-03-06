package cyen.bytecode.instruction.print;

import cyen.bytecode.ExecContext;
import cyen.bytecode.instruction.IBytecodeInsn;
import cyen.data.ICyenData;

public class InsnPrint implements IBytecodeInsn {
    @Override
    public void execute( ExecContext ctx ) {
        ICyenData data = ctx.pop();
        System.out.println( data.stringify( ctx ) );
    }
}
