package thelarsinator.lomunderwaterlife.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomunderwaterlife.entity.EntityBigFish;

@SideOnly(Side.CLIENT)
public class RenderBigFish extends RenderLiving
{
	
    public RenderBigFish(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderBigFish(EntityBigFish par1EntityBigFish, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityBigFish, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBigFish((EntityBigFish)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBigFish((EntityBigFish)par1Entity, par2, par4, par6, par8, par9);
    }

	private static final ResourceLocation texture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish1.png");
	private static final ResourceLocation texture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/BigFish4.png");
	
	protected ResourceLocation func_110872_a(EntityBigFish par1Entity)
	    {
			switch(par1Entity.textureID)
			{
			default:
			case 1:
				return texture1;
			case 2:
				return texture2;
			case 3:
				return texture3;
			case 4:
				return texture4;
			}
	    }
	 
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityBigFish)var1);
	}
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityBigFish par1EntityBigFish, float par2)
    {
    	float f = par1EntityBigFish.scaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityBigFish)par1EntityLivingBase, par2);
    }
}
