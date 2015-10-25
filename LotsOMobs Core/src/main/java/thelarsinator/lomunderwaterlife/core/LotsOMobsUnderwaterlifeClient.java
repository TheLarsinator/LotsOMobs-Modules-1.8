package thelarsinator.lomunderwaterlife.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomunderwaterlife.entity.EntityBigFish;
import thelarsinator.lomunderwaterlife.entity.EntityFish;
import thelarsinator.lomunderwaterlife.entity.EntityWhale;
import thelarsinator.lomunderwaterlife.model.ModelBigFish;
import thelarsinator.lomunderwaterlife.model.ModelFishy;
import thelarsinator.lomunderwaterlife.model.ModelWhale;
import thelarsinator.lomunderwaterlife.render.RenderBigFish;
import thelarsinator.lomunderwaterlife.render.RenderFish;
import thelarsinator.lomunderwaterlife.render.RenderWhale;


public class LotsOMobsUnderwaterlifeClient extends LotsOMobsUnderwaterlifeProxy
{
	

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
    	RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(Minecraft.getMinecraft().getRenderManager(), new ModelWhale(), 0.0625F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBigFish.class, new RenderBigFish(Minecraft.getMinecraft().getRenderManager(), new ModelBigFish(), 0.0625F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityFish.class, new RenderFish(Minecraft.getMinecraft().getRenderManager(), new ModelFishy(), 0.0625F));
    }
    
    public ModelBiped getArmorModel(int id)
    {
    	return null;
    }
}
