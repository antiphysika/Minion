/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion.util;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

import net.neoforged.neoforge.server.ServerLifecycleHooks;

public class ServerUtil
{
  public static MinecraftServer getServer ()
  {
    return ServerLifecycleHooks.getCurrentServer();
  }

  public static ServerLevel getLevel (ResourceKey<Level> level)
  {
    return getServer().getLevel(level);
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :