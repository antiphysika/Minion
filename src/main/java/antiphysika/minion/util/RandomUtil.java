/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util;

import java.util.Random;

public class RandomUtil
{
  private static final Random RNG = new Random();

  public static int randomInt (int min, int max)
  {
    return RNG.nextInt(max - min) + min;
  }

  public static long randomLong (long min, long max)
  {
    return RNG.nextLong(max - min) + min;
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :