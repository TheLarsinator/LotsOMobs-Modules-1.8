// Date: 14.07.2014 11:13:46
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package thelarsinator.lomunderwaterlife.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelWhale extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Belly;
    ModelRenderer Tail1;
    ModelRenderer Belly2;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Flipper;
    ModelRenderer Head;
    ModelRenderer Belly3;
    ModelRenderer RightFin;
    ModelRenderer LeftFin;
  
  public ModelWhale()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Body = new ModelRenderer(this, 13, 0);
      Body.addBox(0F, 0F, 0F, 20, 15, 32);
      Body.setRotationPoint(-10F, 6F, -10F);
      Body.setTextureSize(128, 128);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Belly = new ModelRenderer(this, 25, 89);
      Belly.addBox(0F, 0F, 0F, 16, 4, 35);
      Belly.setRotationPoint(-8F, 21F, -14F);
      Belly.setTextureSize(128, 128);
      Belly.mirror = true;
      setRotation(Belly, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 60);
      Tail1.addBox(-8F, 0F, -2F, 16, 11, 17);
      Tail1.setRotationPoint(0F, 8F, 22F);
      Tail1.setTextureSize(128, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Belly2 = new ModelRenderer(this, 0, 111);
      Belly2.addBox(0F, 0F, 0F, 16, 4, 5);
      Belly2.setRotationPoint(-8F, 19F, 21F);
      Belly2.setTextureSize(128, 128);
      Belly2.mirror = true;
      setRotation(Belly2, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 67, 67);
      Tail2.addBox(-6F, 1F, 13F, 12, 7, 14);
      Tail2.setRotationPoint(0F, 8F, 22F);
      Tail2.setTextureSize(128, 128);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 92, 49);
      Tail3.addBox(-4F, 2F, 24F, 8, 5, 10);
      Tail3.setRotationPoint(0F, 8F, 22F);
      Tail3.setTextureSize(128, 128);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Flipper = new ModelRenderer(this, 1, 47);
      Flipper.addBox(-17F, 2F, 32F, 34, 3, 10);
      Flipper.setRotationPoint(0F, 9F, 22F);
      Flipper.setTextureSize(128, 128);
      Flipper.mirror = true;
      setRotation(Flipper, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 16, 14, 12);
      Head.setRotationPoint(-8F, 7F, -22F);
      Head.setTextureSize(128, 128);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Belly3 = new ModelRenderer(this, 0, 102);
      Belly3.addBox(0F, 0F, 0F, 16, 3, 4);
      Belly3.setRotationPoint(-8F, 20F, -17F);
      Belly3.setTextureSize(128, 128);
      Belly3.mirror = true;
      setRotation(Belly3, 0F, 0F, 0F);
      RightFin = new ModelRenderer(this, 85, 11);
      RightFin.addBox(0F, 0F, 0F, 15, 2, 7);
      RightFin.setRotationPoint(10F, 18F, -7F);
      RightFin.setTextureSize(128, 128);
      RightFin.mirror = true;
      setRotation(RightFin, 0.111544F, -0.4089656F, 0.074351F);
      LeftFin = new ModelRenderer(this, 85, 0);
      LeftFin.addBox(-15F, 0F, 0F, 15, 2, 7);
      LeftFin.setRotationPoint(-10F, 18F, -7F);
      LeftFin.setTextureSize(128, 128);
      LeftFin.mirror = true;
      setRotation(LeftFin, 0.1115358F, 0.4089647F, -0.0743572F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Belly.render(f5);
    Tail1.render(f5);
    Belly2.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Flipper.render(f5);
    Head.render(f5);
    Belly3.render(f5);
    RightFin.render(f5);
    LeftFin.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.Tail1.rotateAngleX = MathHelper.cos(f * 0.3332F) * 0.1F * f1/2;

    this.Tail2.rotateAngleX = MathHelper.cos(f * 0.3332F) * 0.3F * f1/2;
    
    this.Tail3.rotateAngleX = MathHelper.cos(f * 0.3332F) * 0.5F * f1/2;

    this.Flipper.rotateAngleX = MathHelper.cos(f * 0.3332F) * .75F * f1/2;

    this.LeftFin.rotateAngleY = MathHelper.cos(f * 0.3332F) * .6F * f1/2;
    this.RightFin.rotateAngleY = MathHelper.cos(f * 0.3332F + (float)Math.PI) * .4F * f1/2;    
    
  }

}
