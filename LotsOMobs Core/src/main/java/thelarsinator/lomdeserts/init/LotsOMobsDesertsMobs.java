package thelarsinator.lomdeserts.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomdeserts.entity.EntityCamel;
import thelarsinator.lomdeserts.entity.EntityFennec;
import thelarsinator.lomdeserts.entity.EntityLizard;

public class LotsOMobsDesertsMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		if(ConfigHandler.LizardOn == true)
		{
			EntityRegistry.registerGlobalEntityID(EntityLizard.class, mobid + "Lizard", EntityRegistry.findGlobalUniqueEntityId(),  0xBA6B11, 0xEDCBA4);
	    	EntityRegistry.addSpawn(EntityLizard.class,  (int)(ConfigHandler.LizardRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mesa});
	    	EntityRegistry.addSpawn(EntityLizard.class,  (int)(ConfigHandler.LizardRate *10),  4,  5,  EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.DRY));
	        EntityRegistry.addSpawn(EntityLizard.class, (int)(ConfigHandler.LizardRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}
		if(ConfigHandler.CamelOn == true)
		{
			EntityRegistry.registerGlobalEntityID(EntityCamel.class, mobid + "Camel", EntityRegistry.findGlobalUniqueEntityId(),  0xFADFCD, 0xF5C9AB);
	    	EntityRegistry.addSpawn(EntityCamel.class,  (int)(ConfigHandler.CamelRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mesa});
	        EntityRegistry.addSpawn(EntityCamel.class, (int)(ConfigHandler.CamelRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}
		/*if(ConfigHandler.FennecOn == true)
		{
			EntityRegistry.registerGlobalEntityID(EntityFennec.class, mobid + "Fennec", EntityRegistry.findGlobalUniqueEntityId(),  0xFADFCD, 0xc9a67e);
	    	EntityRegistry.addSpawn(EntityFennec.class,  (int)(ConfigHandler.FennecRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mesa});
	        EntityRegistry.addSpawn(EntityFennec.class, (int)(ConfigHandler.FennecRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}*/
	}
}
