package thelarsinator.lomcore.core;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class LotsOMobsClient extends LotsOMobsProxy
{
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
    }
    
    public ModelBiped getArmorModel(int id)
    {
		return null;

    }
}
