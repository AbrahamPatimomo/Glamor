
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.pruebabma.world.inventory.MesacrafteopruebaMenu;
import net.mcreator.pruebabma.world.inventory.AnvilMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PruebaBmaModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<MesacrafteopruebaMenu> MESACRAFTEOPRUEBA = register("mesacrafteoprueba",
			(id, inv, extraData) -> new MesacrafteopruebaMenu(id, inv, extraData));
	public static final MenuType<AnvilMenu> ANVIL = register("anvil", (id, inv, extraData) -> new AnvilMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
