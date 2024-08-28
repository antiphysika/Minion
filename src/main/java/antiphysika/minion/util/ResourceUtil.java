/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util;

import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;

public class ResourceUtil
{
  public static boolean isValid (String loc)
  {
    try
    {
      ResourceLocation rl = ResourceLocation.parse(loc);
      return true;
    }
    catch (ResourceLocationException ex)
    {
      return false;
    }
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :