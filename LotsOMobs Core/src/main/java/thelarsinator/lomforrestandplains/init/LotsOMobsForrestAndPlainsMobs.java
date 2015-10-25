package thelarsinator.lomforrestandplains.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomforrestandplains.entity.EntityAnt;
import thelarsinator.lomforrestandplains.entity.EntityBoar;
import thelarsinator.lomforrestandplains.entity.EntityDeer;
import thelarsinator.lomforrestandplains.entity.EntityDirtPile;
import thelarsinator.lomforrestandplains.entity.EntityElephant;
import thelarsinator.lomforrestandplains.entity.EntityGekko;
import thelarsinator.lomforrestandplains.entity.EntityMole;
import thelarsinator.lomforrestandplains.entity.EntitySquirrel;

public class LotsOMobsForrestAndPlainsMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		//Temporary fix for missing vanilla creature spawn:
  /*    EntityRegistry.addSpawn(EntityCow.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityPig.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntitySheep.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityHorse.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.plains});
*/

		if(ConfigHandler.DeerOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityDeer.class, mobid + "Deer", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0xB37346);
		    EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		    EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.BoarOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityBoar.class, mobid + "Boar", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0x351f0a);
		    EntityRegistry.addSpawn(EntityBoar.class, (int)ConfigHandler.BoarRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		    EntityRegistry.addSpawn(EntityBoar.class, (int)ConfigHandler.BoarRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.SquirrelOn == true)
		{    
			EntityRegistry.registerGlobalEntityID(EntitySquirrel.class,  mobid + "Squirrel", EntityRegistry.findGlobalUniqueEntityId(), 0x634205, 0x633405);
	        EntityRegistry.addSpawn(EntitySquirrel.class,  (int)(ConfigHandler.SquirrelRate *10),  1,  6,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest});
	        EntityRegistry.addSpawn(EntitySquirrel.class, (int)(ConfigHandler.SquirrelRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.AntOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityAnt.class, mobid + "Ant", EntityRegistry.findGlobalUniqueEntityId(), 0x000000, 0xFF0000);
	     	EntityRegistry.addSpawn(EntityAnt.class, (int)(ConfigHandler.AntRate *10), 15, 20, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest});
	        EntityRegistry.addSpawn(EntityAnt.class, (int)(ConfigHandler.AntRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.PLAINS));
		}
		if(ConfigHandler.GekkoOn == true)
		{
	    	EntityRegistry.registerGlobalEntityID(EntityGekko.class,   mobid + "Gekko", EntityRegistry.findGlobalUniqueEntityId(), 0xDEC2A2, 0x506E21);
	    	EntityRegistry.addSpawn(EntityGekko.class,  (int)(ConfigHandler.GekkoRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.swampland});
        	EntityRegistry.addSpawn(EntityGekko.class, (int)(ConfigHandler.GekkoRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
		if(ConfigHandler.MoleOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityMole.class, mobid + "Mole", EntityRegistry.findGlobalUniqueEntityId(), 0x7D3B0C, 0x544842);
			EntityRegistry.registerGlobalEntityID(EntityDirtPile.class, mobid + "DirtPile", EntityRegistry.findGlobalUniqueEntityId());
			EntityRegistry.addSpawn(EntityMole.class, (int)(ConfigHandler.MoleRate *10), 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills,BiomeGenBase.plains});
			EntityRegistry.addSpawn(EntityMole.class, (int)(ConfigHandler.MoleRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.PLAINS));
		}
		if(ConfigHandler.ElephantOn == true)
		{	
			EntityRegistry.registerGlobalEntityID(EntityElephant.class, mobid + "Elephant", EntityRegistry.findGlobalUniqueEntityId(), 0x919191, 0x757575);
		    EntityRegistry.addSpawn(EntityElephant.class, (int)ConfigHandler.ElephantRate *10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
		    EntityRegistry.addSpawn(EntityElephant.class, (int)ConfigHandler.ElephantRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SAVANNA));
		}
	}
}
