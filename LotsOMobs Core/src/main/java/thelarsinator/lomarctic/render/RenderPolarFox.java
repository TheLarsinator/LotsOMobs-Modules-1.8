package thelarsinator.lomarctic.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.client.renderer.entity.layers.LayerWolfCollar;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomarctic.entity.EntityPolarFox;
import thelarsinator.lomcore.core.LotsOMobs;

@SideOnly(Side.CLIENT)
public class RenderPolarFox extends RenderWolf
{
    private static final ResourceLocation PolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox.png");
    private static final ResourceLocation tamedPolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox_tame.png");
    private static final ResourceLocation anrgyPolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox_angry.png");

    public RenderPolarFox(RenderManager p_i46128_1_, ModelBase p_i46128_2_, float p_i46128_3_)
    {
        super(p_i46128_1_, p_i46128_2_, p_i46128_3_);
        this.addLayer(new LayerWolfCollar(this));
    }

    protected float func_180593_a(EntityPolarFox p_180593_1_, float p_180593_2_)
    {
        return p_180593_1_.getTailRotation();
    }

    public void func_177135_a(EntityPolarFox p_177135_1_, double p_177135_2_, double p_177135_4_, double p_177135_6_, float p_177135_8_, float p_177135_9_)
    {
        if (p_177135_1_.isWolfWet())
        {
            float f2 = p_177135_1_.getBrightness(p_177135_9_) * p_177135_1_.getShadingWhileWet(p_177135_9_);
            GlStateManager.color(f2, f2, f2);
        }

        super.doRender((EntityLiving)p_177135_1_, p_177135_2_, p_177135_4_, p_177135_6_, p_177135_8_, p_177135_9_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPolarFox entity)
    {
        return entity.isTamed() ? tamedPolarFoxTextures : (entity.isAngry() ? anrgyPolarFoxTextures : PolarFoxTextures);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(EntityLiving entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityPolarFox)entity, x, y, z, p_76986_8_, partialTicks);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.func_180593_a((EntityPolarFox)p_77044_1_, p_77044_2_);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(EntityLivingBase entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityPolarFox)entity, x, y, z, p_76986_8_, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityPolarFox)entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.func_177135_a((EntityPolarFox)entity, x, y, z, p_76986_8_, partialTicks);
    }
    
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityPolarFox par1EntityPolarFox, float par2)
    {
    	float f = par1EntityPolarFox.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityPolarFox)par1EntityLivingBase, par2);
    }
}