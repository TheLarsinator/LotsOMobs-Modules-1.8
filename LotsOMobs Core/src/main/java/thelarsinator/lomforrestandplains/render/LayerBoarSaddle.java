package thelarsinator.lomforrestandplains.render;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityBoar;
import thelarsinator.lomforrestandplains.model.ModelBoar;

@SideOnly(Side.CLIENT)
public class LayerBoarSaddle implements LayerRenderer
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/boar_saddle.png");
    private final RenderBoar BoarRenderer;
    private final ModelBoar BoarModel = new ModelBoar();
    private static final String __OBFID = "CL_00002414";

    public LayerBoarSaddle(RenderBoar p_i46113_1_)
    {
        this.BoarRenderer = p_i46113_1_;
    }

    public void doRenderLayer(EntityBoar p_177155_1_, float p_177155_2_, float p_177155_3_, float p_177155_4_, float p_177155_5_, float p_177155_6_, float p_177155_7_, float p_177155_8_)
    {
        if (p_177155_1_.getSaddled())
        {
            this.BoarRenderer.bindTexture(TEXTURE);
            this.BoarModel.setModelAttributes(this.BoarRenderer.getMainModel());
            this.BoarModel.render(p_177155_1_, p_177155_2_, p_177155_3_, p_177155_5_, p_177155_6_, p_177155_7_, p_177155_8_);
        }
    }

    public boolean shouldCombineTextures()
    {
        return false;
    }

    public void doRenderLayer(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        this.doRenderLayer((EntityBoar)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
    }
}