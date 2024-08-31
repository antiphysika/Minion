/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util.array;

public class ArrayUtil
{
  public static Object[] reverseArray (Object[] array)
  {
    Object[] revArray = array.clone();

    for (int i = 0; i < array.length / 2; ++i)
    {
      var tmp = revArray[i];
      revArray[i] = revArray[revArray.length - i - 1];
      revArray[revArray.length - i - 1] = tmp;
    }

    return revArray;
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :