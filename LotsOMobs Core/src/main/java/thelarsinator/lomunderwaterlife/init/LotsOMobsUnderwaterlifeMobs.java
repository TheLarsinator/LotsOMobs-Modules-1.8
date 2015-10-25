package thelarsinator.lomunderwaterlife.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomunderwaterlife.entity.EntityBigFish;
import thelarsinator.lomunderwaterlife.entity.EntityFish;
import thelarsinator.lomunderwaterlife.entity.EntityWhale;

public class LotsOMobsUnderwaterlifeMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		if(ConfigHandler.WhaleOn == true)
		{ 
			EntityRegistry.registerGlobalEntityID(EntityWhale.class, mobid + "Whale", EntityRegistry.findGlobalUniqueEntityId(), 0x757C82, 0x97AEC4);
	        EntityRegistry.addSpawn(EntityWhale.class, (int)(ConfigHandler.WhaleRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean});
	        EntityRegistry.addSpawn(EntityWhale.class, (int)(ConfigHandler.WhaleRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, BiomeDictionary.getBiomesForType(Type.OCEAN));
		}
		if(ConfigHandler.FishyOn == true)
		{ 
			EntityRegistry.registerGlobalEntityID(EntityBigFish.class, mobid + "BigFish", EntityRegistry.findGlobalUniqueEntityId(), 0x085cae, 0x1ccbc2);
	        EntityRegistry.addSpawn(EntityBigFish.class, (int)(ConfigHandler.FishyRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean});
	        EntityRegistry.addSpawn(EntityBigFish.class, (int)(ConfigHandler.FishyRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, BiomeDictionary.getBiomesForType(Type.OCEAN));
		}
		if(ConfigHandler.FishyOn == true)
		{ 
			EntityRegistry.registerGlobalEntityID(EntityFish.class, mobid + "Fish", EntityRegistry.findGlobalUniqueEntityId(), 0xF78A2A, 0xF78A2A);
	        EntityRegistry.addSpawn(EntityFish.class, (int)(ConfigHandler.FishyRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean, BiomeGenBase.river});
	        EntityRegistry.addSpawn(EntityFish.class, (int)(ConfigHandler.FishyRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, BiomeDictionary.getBiomesForType(Type.OCEAN));
	        EntityRegistry.addSpawn(EntityFish.class, (int)(ConfigHandler.FishyRate *10), 1, 4, EnumCreatureType.WATER_CREATURE, BiomeDictionary.getBiomesForType(Type.RIVER));
		}
	}
}
