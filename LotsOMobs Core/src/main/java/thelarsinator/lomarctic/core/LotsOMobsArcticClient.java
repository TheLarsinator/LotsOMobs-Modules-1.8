package thelarsinator.lomarctic.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomarctic.entity.EntityPolarBear;
import thelarsinator.lomarctic.model.ModelPolarBear;
import thelarsinator.lomarctic.render.RenderPolarBear;


public class LotsOMobsArcticClient extends LotsOMobsArcticProxy
{
	

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
//		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, new RenderLizard(Minecraft.getMinecraft().getRenderManager(), new ModelLizard(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, new RenderPolarBear(Minecraft.getMinecraft().getRenderManager(), new ModelPolarBear(), 0.5F));

    }
    
    public ModelBiped getArmorModel(int id)
    {
    	return null;
    }
}
