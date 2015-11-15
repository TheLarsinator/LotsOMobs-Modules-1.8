package thelarsinator.lomjungleandswamps.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomjungleandswamps.entity.EntityCroco;
import thelarsinator.lomjungleandswamps.entity.EntityFly;
import thelarsinator.lomjungleandswamps.entity.EntityFrog;
import thelarsinator.lomjungleandswamps.entity.EntityGekko;
import thelarsinator.lomjungleandswamps.model.ModelFly;
import thelarsinator.lomjungleandswamps.model.ModelFrog;
import thelarsinator.lomjungleandswamps.model.ModelLizard;
import thelarsinator.lomjungleandswamps.render.RenderCroco;
import thelarsinator.lomjungleandswamps.render.RenderFly;
import thelarsinator.lomjungleandswamps.render.RenderFrog;
import thelarsinator.lomjungleandswamps.render.RenderGekko;


public class LotsOMobsJungleAndSwampsClient extends LotsOMobsJungleAndSwampsProxy
{
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
    	RenderingRegistry.registerEntityRenderingHandler(EntityGekko.class, new RenderGekko(Minecraft.getMinecraft().getRenderManager(), new ModelLizard(), 0.2F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityCroco.class, new RenderCroco(Minecraft.getMinecraft().getRenderManager(), new ModelLizard(), 1.0F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityFrog.class, new RenderFrog(Minecraft.getMinecraft().getRenderManager(), new ModelFrog(), 0.2F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityFly.class, new RenderFly(Minecraft.getMinecraft().getRenderManager(), new ModelFly(), 0.2F));

    }
    
    public ModelBiped getArmorModel(int id)
    {
    	return null;
    }
}
