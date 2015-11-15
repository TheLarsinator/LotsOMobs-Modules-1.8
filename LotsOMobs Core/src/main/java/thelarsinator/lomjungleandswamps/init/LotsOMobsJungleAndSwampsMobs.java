package thelarsinator.lomjungleandswamps.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomjungleandswamps.entity.EntityCroco;
import thelarsinator.lomjungleandswamps.entity.EntityFly;
import thelarsinator.lomjungleandswamps.entity.EntityFrog;
import thelarsinator.lomjungleandswamps.entity.EntityGekko;

public class LotsOMobsJungleAndSwampsMobs {

	public static void Init() 
	{
		String mobid = "lom_";

		if(ConfigHandler.GekkoOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityGekko.class, mobid + "Gekko", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityGekko.class,  (int)(ConfigHandler.GekkoRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.swampland});
        	EntityRegistry.addSpawn(EntityGekko.class, (int)(ConfigHandler.GekkoRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
		if(ConfigHandler.CrocoOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityCroco.class, mobid + "Croco", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityCroco.class,  (int)(ConfigHandler.CrocoRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.swampland, BiomeGenBase.jungle});
        	EntityRegistry.addSpawn(EntityCroco.class, (int)(ConfigHandler.CrocoRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
		if(ConfigHandler.FrogOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityFrog.class, mobid + "Frog", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityFrog.class,  (int)(ConfigHandler.FrogRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.swampland, BiomeGenBase.jungle});
        	EntityRegistry.addSpawn(EntityFrog.class, (int)(ConfigHandler.FrogRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
		if(ConfigHandler.FlyOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityFly.class, mobid + "Fly", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityFly.class,  (int)(ConfigHandler.FlyRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.swampland, BiomeGenBase.jungle});
        	EntityRegistry.addSpawn(EntityFly.class, (int)(ConfigHandler.FlyRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
	}

}
