
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pruebabma.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PruebaBmaModTabs {
	public static CreativeModeTab TAB_BMOD;

	public static void load() {
		TAB_BMOD = new CreativeModeTab("tabbmod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PruebaBmaModItems.GLADITE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
