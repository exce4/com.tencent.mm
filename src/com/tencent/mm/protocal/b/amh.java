package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class amh
  extends com.tencent.mm.ax.a
{
  public amj jFX;
  public amj jUO;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (jFX == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (jUO == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (jFX != null)
      {
        paramVarArgs.cx(1, jFX.iO());
        jFX.a(paramVarArgs);
      }
      if (jUO != null)
      {
        paramVarArgs.cx(2, jUO.iO());
        jUO.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (jFX == null) {
        break label486;
      }
    }
    label486:
    for (paramInt = a.a.a.a.cv(1, jFX.iO()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (jUO != null) {
        i = paramInt + a.a.a.a.cv(2, jUO.iO());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], jrk);
        for (paramInt = com.tencent.mm.ax.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.ax.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bve();
          }
        }
        if (jFX == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (jUO != null) {
          break;
        }
        throw new b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        amh localamh = (amh)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).vC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new amj();
            localObject2 = new a.a.a.a.a((byte[])localObject2, jrk);
            for (bool = true; bool; bool = ((amj)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.ax.a)localObject1, com.tencent.mm.ax.a.a((a.a.a.a.a)localObject2))) {}
            jFX = ((amj)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((a.a.a.a.a)localObject1).vC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new amj();
          localObject2 = new a.a.a.a.a((byte[])localObject2, jrk);
          for (bool = true; bool; bool = ((amj)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.ax.a)localObject1, com.tencent.mm.ax.a.a((a.a.a.a.a)localObject2))) {}
          jUO = ((amj)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.amh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */