/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util;

import java.time.Instant;

public class DateTimeUtil
{
  public static long getUnixTime ()
  {
    return System.currentTimeMillis() / 1000L;
  }

  public static Instant unixTimeToInstant (long unixTIme)
  {
    return Instant.ofEpochSecond(unixTIme);
  }

  public static long instantToUnixTime (Instant instant)
  {
    return instant.getEpochSecond();
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :