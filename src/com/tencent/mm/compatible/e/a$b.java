package com.tencent.mm.compatible.e;

import android.util.SparseArray;
import java.util.Locale;

public final class a$b
{
  public int bhU;
  public SparseArray<String> bhV;
  public String bhW;
  public String model;
  public String version;
  
  public final String toString()
  {
    return String.format(Locale.US, "manufacture: %s, model: %s, version: %s, value: %s, chkExp: %d", new Object[] { bhW, model, version, bhV, Integer.valueOf(bhU) });
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.compatible.e.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */