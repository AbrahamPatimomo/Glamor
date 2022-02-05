
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pruebabma.item.GlamorpicaxeItem;
import net.mcreator.pruebabma.item.GladiteItem;
import net.mcreator.pruebabma.item.GladimiteoreItem;
import net.mcreator.pruebabma.item.GladamiteSwordItem;
import net.mcreator.pruebabma.item.ElvildustItem;
import net.mcreator.pruebabma.item.DarkmorItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PruebaBmaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GLADIMITE = register(PruebaBmaModBlocks.GLADIMITE, PruebaBmaModTabs.TAB_BMOD);
	public static final Item GLADITE = register(new GladiteItem());
	public static final Item GLAMORPICAXE = register(new GlamorpicaxeItem());
	public static final Item GLADIMITEORE = register(new GladimiteoreItem());
	public static final Item ELVIL = register(PruebaBmaModBlocks.ELVIL, PruebaBmaModTabs.TAB_BMOD);
	public static final Item ELVILDUST = register(new ElvildustItem());
	public static final Item DARKMOR_HELMET = register(new DarkmorItem.Helmet());
	public static final Item DARKMOR_CHESTPLATE = register(new DarkmorItem.Chestplate());
	public static final Item DARKMOR_LEGGINGS = register(new DarkmorItem.Leggings());
	public static final Item DARKMOR_BOOTS = register(new DarkmorItem.Boots());
	public static final Item GLADAMITE_SWORD = register(new GladamiteSwordItem());
	public static final Item MESA_DE_PRUEBA = register(PruebaBmaModBlocks.MESA_DE_PRUEBA, PruebaBmaModTabs.TAB_BMOD);
	public static final Item NADA = register(PruebaBmaModBlocks.NADA, PruebaBmaModTabs.TAB_BMOD);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
