package thelarsinator.lomjungleandswamps.render;

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
import thelarsinator.lomjungleandswamps.entity.EntityFrog;

@SideOnly(Side.CLIENT)
public class RenderFrog extends RenderLiving
{
	
    public RenderFrog(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderFrog(EntityFrog par1EntityFrog, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityFrog, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderFrog((EntityFrog)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderFrog((EntityFrog)par1Entity, par2, par4, par6, par8, par9);
    }

	private static final ResourceLocation Frogtexture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Frog.png");
	private static final ResourceLocation Frogtexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Frog1.png");
	private static final ResourceLocation Frogtexture3 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Frog2.png");
	private static final ResourceLocation Frogtexture4 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Frog3.png");
	
	protected ResourceLocation func_110872_a(EntityFrog par1Entity)
	{
    	int i = par1Entity.textureID;
    	switch(i)
    	{
    	case 0:
    		default:
    		return Frogtexture1;
    	case 1:
    		return Frogtexture2;
    	case 2:
    		return Frogtexture3;
    	case 3:
    		return Frogtexture4;
    	}
	 }
	 
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityFrog)var1);
	}
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityFrog par1EntityFrog, float par2)
    {
    	float f = 1 + (par1EntityFrog.size/10F);
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityFrog)par1EntityLivingBase, par2);
    }
}
