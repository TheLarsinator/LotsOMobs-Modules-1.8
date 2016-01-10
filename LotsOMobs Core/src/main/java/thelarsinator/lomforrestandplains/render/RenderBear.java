package thelarsinator.lomforrestandplains.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityBear;
import thelarsinator.lomforrestandplains.entity.EntityBear;

@SideOnly(Side.CLIENT)
public class RenderBear extends RenderLiving
{
    public RenderBear(RenderManager p_i46149_1_, ModelBase p_i46149_2_, float p_i46149_3_)
    {
        super(p_i46149_1_, p_i46149_2_, p_i46149_3_);
    }

	private static final ResourceLocation Deertexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Bear.png");
	 protected ResourceLocation func_110872_a(EntityBear par1Entity)
	    {
	        return Deertexture;
	    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.func_110872_a((EntityBear)entity);
    }
    
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityBear par1EntityBear, float par2)
    {
    	float f = par1EntityBear.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityBear)par1EntityLivingBase, par2);
    }
}