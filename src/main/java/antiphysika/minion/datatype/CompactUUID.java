/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.datatype;

import java.util.UUID;

public class CompactUUID
{
  private long lowBits;
  private long highBits;

  public CompactUUID (UUID uuid)
  {
    set(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
  }

  public CompactUUID (long lowBits, long highBits)
  {
    this.set(lowBits, highBits);
  }

  private void set (long lowBits, long highBits)
  {
    this.lowBits = lowBits;
    this.highBits = highBits;
  }

  public long getLowBits ()
  {
    return lowBits;
  }

  public long getHighBits ()
  {
    return highBits;
  }

  public UUID toUUID ()
  {
    return new UUID(lowBits, highBits);
  }

  public static CompactUUID fromUUID (UUID uuid)
  {
    return new CompactUUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :