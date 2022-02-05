
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public class GladiteItem extends Item {
	public GladiteItem() {
		super(new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("gladite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
