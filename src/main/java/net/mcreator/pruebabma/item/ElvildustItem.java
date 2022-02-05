
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public class ElvildustItem extends Item {
	public ElvildustItem() {
		super(new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD).stacksTo(32).rarity(Rarity.COMMON));
		setRegistryName("elvildust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
