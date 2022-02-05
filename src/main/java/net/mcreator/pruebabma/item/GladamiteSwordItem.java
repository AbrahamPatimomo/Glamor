
package net.mcreator.pruebabma.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.pruebabma.init.PruebaBmaModTabs;

public class GladamiteSwordItem extends SwordItem {
	public GladamiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.2f, new Item.Properties().tab(PruebaBmaModTabs.TAB_BMOD));
		setRegistryName("gladamite_sword");
	}
}
