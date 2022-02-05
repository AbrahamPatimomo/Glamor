
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.pruebabma.block.NadaBlock;
import net.mcreator.pruebabma.block.MesaDePruebaBlock;
import net.mcreator.pruebabma.block.GladimiteBlock;
import net.mcreator.pruebabma.block.ElvilBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PruebaBmaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block GLADIMITE = register(new GladimiteBlock());
	public static final Block ELVIL = register(new ElvilBlock());
	public static final Block MESA_DE_PRUEBA = register(new MesaDePruebaBlock());
	public static final Block NADA = register(new NadaBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			GladimiteBlock.registerRenderLayer();
			ElvilBlock.registerRenderLayer();
		}
	}
}
