
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pruebabma.client.model.ModelPantalones;
import net.mcreator.pruebabma.client.model.ModelCasco_sin_cuernos;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PruebaBmaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCasco_sin_cuernos.LAYER_LOCATION, ModelCasco_sin_cuernos::createBodyLayer);
		event.registerLayerDefinition(ModelPantalones.LAYER_LOCATION, ModelPantalones::createBodyLayer);
	}
}
