package thelarsinator.lomcore.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
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
		public static Item ReptileMeat;
		public static Item RawReptile;
		public static Item WhaleMeat;
		public static Item RawWhale;
		public static Item CamelMeat;
		public static Item RawCamel;
		
		public static Item HornSword;

		public static Item DeerHideHelmet;
		public static Item DeerHideChestPlate;
		public static Item DeerHideLeggings;
		public static Item DeerHideBoots;
		
		
	public static void Init()
	{
		//Materials
		DeerHide = new ItemMaterials().setUnlocalizedName("DeerHide");
		Horn = new ItemMaterials().setUnlocalizedName("Horn");
		
		//Food
		Venison = new ItemLOMFood(2, 1, true).setUnlocalizedName("Venison");
		RawVenison = new ItemLOMFood(4, 3, false).setUnlocalizedName("RawVenison");
		BoarMeat = new ItemLOMFood(2, 1, true).setUnlocalizedName("BoarMeat");
		RawBoar = new ItemLOMFood(4, 3, false).setUnlocalizedName("RawBoar");
		ReptileMeat = new ItemLOMFood(1, 0, true).setUnlocalizedName("ReptileMeat");
		RawReptile = new ItemLOMFood(3, 2, false).setUnlocalizedName("RawReptile");
		WhaleMeat = new ItemLOMFood(1, 0, true).setUnlocalizedName("WhaleMeat");
		RawWhale = new ItemLOMFood(3, 2, false).setUnlocalizedName("RawWhale");
		CamelMeat = new ItemLOMFood(1, 0, true).setUnlocalizedName("CamelMeat");
		RawCamel = new ItemLOMFood(3, 2, false).setUnlocalizedName("RawCamel");
		
		//Weapons
		HornSword = new ItemSword(LotsOMobs.EnumToolMaterialHorn).setUnlocalizedName("HornSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		
		//Armor
		DeerHideHelmet = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 0).setUnlocalizedName("DeerHideHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideChestPlate = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 1).setUnlocalizedName("DeerHideChestPlate").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideLeggings = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 2).setUnlocalizedName("DeerHideLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		DeerHideBoots = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("DeerArmor"), 3).setUnlocalizedName("DeerHideBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);

		
		//Register that shit
		registerItemAndTexture(DeerHide, "DeerHide");
		registerItemAndTexture(Horn, "Horn");
		
		registerItemAndTexture(Venison, "Venison");
		registerItemAndTexture(RawVenison, "RawVenison");
		registerItemAndTexture(BoarMeat, "BoarMeat");
		registerItemAndTexture(RawBoar, "RawBoar");
		registerItemAndTexture(ReptileMeat, "ReptileMeat");
		registerItemAndTexture(RawReptile, "RawReptile");
		registerItemAndTexture(WhaleMeat, "WhaleMeat");
		registerItemAndTexture(RawWhale, "RawWhale");
		registerItemAndTexture(CamelMeat, "CamelMeat");
		registerItemAndTexture(RawCamel, "RawCamel");
		
		registerItemAndTexture(HornSword, "HornSword");
		
		registerItemAndTexture(DeerHideHelmet, "DeerHideHelmet");
		registerItemAndTexture(DeerHideChestPlate, "DeerHideChestPlate");
		registerItemAndTexture(DeerHideLeggings, "DeerHideLeggings");
		registerItemAndTexture(DeerHideBoots, "DeerHideBoots");

	}
	
	public static void registerItemAndTexture(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LotsOMobs.modid + ":" + name, "inventory"));

	}
}
