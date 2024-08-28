/*
 * SPDX-License-Identifier: LGPL-2.1
 */

package antiphysika.minion;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(Minion.MOD_ID)
public class Minion
{
  public static final String MOD_ID = "minion";
  private static final Logger LOGGER = LogUtils.getLogger();

  public Minion (IEventBus bus)
  {
    // Add listener for FMLCommonSetupEvent event
    bus.addListener(this::initCommon);

    // Register ourselves on the game bus
    //NeoForge.EVENT_BUS.register(this);
  }

  public static Logger getLogger ()
  {
    return LOGGER;
  }

  private void initCommon (final FMLCommonSetupEvent event)
  {
    LOGGER.info("In {}.initCommon()", MOD_ID);
  }

  @SubscribeEvent
  public void onServerStarting (ServerStartingEvent event)
  {
    Minion.getLogger().info("In ServerEvents.onServerStarting()");
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :