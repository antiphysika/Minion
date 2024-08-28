/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.data;

import java.util.UUID;

public class CompactUuid
{
  private long lowBits;
  private long highBits;

  public CompactUuid (UUID uuid)
  {
    set(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
  }

  public CompactUuid (long lowBits, long highBits)
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

  public static CompactUuid fromUUID (UUID uuid)
  {
    return new CompactUuid(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :