package thelarsinator.lomunderwaterlife.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomunderwaterlife.init.LotsOMobsUnderwaterlifeMobs;
import thelarsinator.lomunderwaterlife.init.LotsOMobsUnderwaterlifeRecipes;

@Mod (modid = "lomuwl", name = "LotsOMobsUnderwaterlife", version = "1.8-1.0", dependencies = "required-after:lom")
public class LotsOMobsUnderwaterlife
{
	public static String modid = "lomuwl";	
	@SidedProxy(clientSide = "thelarsinator.lomunderwaterlife.core.LotsOMobsUnderwaterlifeClient", serverSide = "thelarsinator.lomunderwaterlife.core.LotsOMobsUnderwaterlifeProxy")
	public static LotsOMobsUnderwaterlifeProxy proxy;

	@Mod.Instance("lomuwl")
	public static LotsOMobsUnderwaterlife instance;
		
	//PreInit
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{    

   //  	LotsOMobsBlocks.Init();
   //  	LotsOMobsBiomes.Init();
    // 	LotsOMobsAchievementsBook.Init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	     	
		LotsOMobsUnderwaterlifeMobs.Init();
		LotsOMobsUnderwaterlifeRecipes.RecipeBook();		
     	
		proxy.registerRenderInformation();
	}
}