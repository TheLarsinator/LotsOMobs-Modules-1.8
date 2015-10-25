package thelarsinator.lomcore.items;

import net.minecraft.item.ItemFood;
import thelarsinator.lomcore.core.LotsOMobs;

public class ItemLOMFood extends ItemFood
{
	public ItemLOMFood(int healAmount, float saturation, boolean wolfFood)
	{
		super(healAmount, saturation, wolfFood);
		this.setCreativeTab(LotsOMobs.LotsOMobsFoodTab);
	}
}
