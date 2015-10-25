package thelarsinator.lomunderwaterlife.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static thelarsinator.lomcore.init.LotsOMobsItems.*;

public class LotsOMobsUnderwaterlifeRecipes 
{
	public static void RecipeBook()
	{
		//Smelting
		 GameRegistry.addSmelting(RawWhale, new ItemStack(WhaleMeat, 1), 1.0F);
		 
		//Shaped Recipes
		 
	}
}
