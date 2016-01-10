package thelarsinator.lomarctic.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomarctic.entity.EntityPolarBear;
import thelarsinator.lomarctic.entity.EntityPolarFox;
import thelarsinator.lomcore.core.handler.ConfigHandler;

public class LotsOMobsArcticMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		if(ConfigHandler.IceBearOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityPolarBear.class, mobid + "PolarBear", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xBBBBBB);
		    EntityRegistry.addSpawn(EntityPolarBear.class, (int)ConfigHandler.IceBearRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.iceMountains, BiomeGenBase.icePlains});
		    EntityRegistry.addSpawn(EntityPolarBear.class, (int)ConfigHandler.IceBearRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SNOWY));
		}
		if(ConfigHandler.FoxOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityPolarFox.class, mobid + "PolarFox", EntityRegistry.findGlobalUniqueEntityId(), 0xFFFFFF, 0xCCCCCC);
		    EntityRegistry.addSpawn(EntityPolarFox.class, (int)ConfigHandler.FoxRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.iceMountains, BiomeGenBase.icePlains});
		    EntityRegistry.addSpawn(EntityPolarFox.class, (int)ConfigHandler.FoxRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SNOWY));
		}
	}
}
