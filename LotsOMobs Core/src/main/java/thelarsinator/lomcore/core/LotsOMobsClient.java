package thelarsinator.lomcore.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.init.LotsOMobsItems;


public class LotsOMobsClient extends LotsOMobsProxy
{
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
    	
    	//Items
    	for(int i = 0; i < LotsOMobsItems.ItemList.size(); i++)
    	{
    		
    		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(LotsOMobsItems.ItemList.get(i), 0, new ModelResourceLocation(LotsOMobs.modid + ":" + LotsOMobsItems.NameList.get(i), "inventory"));

    	}

    }
    
    public ModelBiped getArmorModel(int id)
    {
		return null;

    }
}
