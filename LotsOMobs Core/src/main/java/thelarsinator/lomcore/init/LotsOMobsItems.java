package thelarsinator.lomcore.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomcore.core.LotsOMobsProxy;
import thelarsinator.lomcore.items.Item3DArmor;
import thelarsinator.lomcore.items.ItemLOMFood;
import thelarsinator.lomcore.items.ItemMaterials;

public class LotsOMobsItems 
{
	@SidedProxy(clientSide = "thelarsinator.lomcore.core.LotsOMobsClient",serverSide = "thelarsinator.lomcore.core.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;
	
	//Items
		public static Item DeerHide;
		public static Item Horn;
		public static Item SmashedBug;

		public static Item Venison;
		public static Item RawVenison;
		public static Item BoarMeat;
		public static Item RawBoar;
		public static Item CamelMeat;
		public static Item RawCamel;
		public static Item WhaleMeat;
		public static Item RawWhale;
		public static Item ReptileMeat;
		public static Item RawReptile;
		
		public static Item HornSword;
	
		public static Item DeerHideHelmet;
		public static Item DeerHideChestPlate;
		public static Item DeerHideLeggings;
		public static Item DeerHideBoots;


	//	public static Item FoodItems[] = {Venison, RawVenison, BoarMeat, RawBoar, CamelMeat, RawCamel, WhaleMeat, RawWhale, ReptileMeat, RawReptile};
	//	public static String FoodNames[] = {"DeerHide", "Horn", "Venison", "RawVenison", "BoarMeat", "RawBoar", "CamelMeat", "RawCamel", "WhaleMeat", "RawWhale", "ReptileMeat", "RawReptile"};
	//	
	//	public static Item MaterialItems[] = {DeerHide, Horn, SmashedBug};
	//	public static String MaterialNames[] = {"DeerHide", "Horn", "SmashedBug"};
		
		public static List<Item> ItemList = new ArrayList<Item>();
		public static List<String> NameList = new ArrayList<String>();
	
	public static void Init()
	{
		//Materials
		DeerHide = new ItemMaterials().setUnlocalizedName("DeerHide");
		Horn = new ItemMaterials().setUnlocalizedName("Horn");
		
		//Food
		Venison = new ItemLOMFood(4, 4, true).setUnlocalizedName("Venison");
		RawVenison = new ItemLOMFood(2, 1, false).setUnlocalizedName("RawVenison");
		BoarMeat = new ItemLOMFood(4, 4, true).setUnlocalizedName("BoarMeat");
		RawBoar = new ItemLOMFood(2, 1, false).setUnlocalizedName("RawBoar");
		CamelMeat = new ItemLOMFood(4, 5, true).setUnlocalizedName("CamelMeat");
		RawCamel = new ItemLOMFood(1, 1, false).setUnlocalizedName("RawCamel");
		WhaleMeat = new ItemLOMFood(6, 3, true).setUnlocalizedName("WhaleMeat");
		RawWhale = new ItemLOMFood(3, 1, false).setUnlocalizedName("RawWhale");
		
		//Weapons
		HornSword = new ItemSword(LotsOMobs.EnumToolMaterialHorn).setUnlocalizedName("HornSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		
		//Armor
		DeerHideHelmet = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 0).setUnlocalizedName("DeerHideHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideChestPlate = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 1).setUnlocalizedName("DeerHideChestPlate").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideLeggings = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 2).setUnlocalizedName("DeerHideLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideBoots = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 3).setUnlocalizedName("DeerHideBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);

		
		
		ReptileMeat = new ItemLOMFood(1, 0, true).setUnlocalizedName("ReptileMeat");
		RawReptile = new ItemLOMFood(3, 2, false).setUnlocalizedName("RawReptile");
		SmashedBug = new ItemMaterials().setUnlocalizedName("SmashedBug");
		
		//Register that shit
		registerItemAndTexture(DeerHide, "DeerHide");
		registerItemAndTexture(Horn, "Horn");
		
		registerItemAndTexture(Venison, "Venison");
		registerItemAndTexture(RawVenison, "RawVenison");
		registerItemAndTexture(BoarMeat, "BoarMeat");
		registerItemAndTexture(RawBoar, "RawBoar");
		registerItemAndTexture(CamelMeat, "CamelMeat");
		registerItemAndTexture(RawCamel, "RawCamel");
		registerItemAndTexture(WhaleMeat, "WhaleMeat");
		registerItemAndTexture(RawWhale, "RawWhale");
		
		registerItemAndTexture(HornSword, "HornSword");
		
		registerItemAndTexture(DeerHideHelmet, "DeerHideHelmet");
		registerItemAndTexture(DeerHideChestPlate, "DeerHideChestPlate");
		registerItemAndTexture(DeerHideLeggings, "DeerHideLeggings");
		registerItemAndTexture(DeerHideBoots, "DeerHideBoots");
		registerItemAndTexture(ReptileMeat, "ReptileMeat");
		registerItemAndTexture(RawReptile, "RawReptile");
		registerItemAndTexture(SmashedBug, "SmashedBug");


	}
	
	public static void registerItemAndTexture(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
		ItemList.add(item);
		NameList.add(name);
	}
	

	
}
