/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util.resource;

import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;

public class ResLoc
{
  /**
   * Parse {@link ResourceLocation} from string
   *
   * @param location String to parse
   * @return Parsed {@link ResourceLocation}
   */
  public static ResourceLocation parse (final String location)
  {
    return ResourceLocation.parse(location);
  }

  /**
   * Return {@link ResourceLocation} instance with default namespace and specified path
   *
   * @param path Resource location path
   * @return Instance of {@link ResourceLocation}
   */
  public static ResourceLocation withDefault (final String path)
  {
    return ResourceLocation.withDefaultNamespace(path);
  }

  public static ResourceLocation from (final String namespace, final String path)
  {
    return ResourceLocation.fromNamespaceAndPath(namespace, path);
  }

  /**
   * Validate {@link ResourceLocation} location string
   *
   * @param location Location string to validate
   * @return Returns true if syntactically valid, otherwise false.
   */

  public static boolean isValid (final String location)
  {
    try
    {
      @SuppressWarnings("unused")
      ResourceLocation loc = parse(location);
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