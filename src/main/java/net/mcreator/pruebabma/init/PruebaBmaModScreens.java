
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.pruebabma.client.gui.MesacrafteopruebaScreen;
import net.mcreator.pruebabma.client.gui.AnvilScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PruebaBmaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PruebaBmaModMenus.MESACRAFTEOPRUEBA, MesacrafteopruebaScreen::new);
			MenuScreens.register(PruebaBmaModMenus.ANVIL, AnvilScreen::new);
		});
	}
}
