
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public class GladimiteoreItem extends Item {
	public GladimiteoreItem() {
		super(new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("gladimiteore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
