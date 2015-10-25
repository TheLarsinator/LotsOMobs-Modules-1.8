// Date: 30.08.2014 21:37:32
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package thelarsinator.lomforrestandplains.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDirtPile extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Body;
    ModelRenderer ArmR;
    ModelRenderer ArmL;
    ModelRenderer Head;
    ModelRenderer Nose;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape5;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
  
  public ModelDirtPile()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 8, 2, 8);
      Shape1.setRotationPoint(-4F, 22F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 6, 2, 6);
      Shape2.setRotationPoint(-3F, 20F, -3F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape3.setRotationPoint(-2F, 19F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 25);
      Body.addBox(0F, 0F, 0F, 3, 3, 3);
      Body.setRotationPoint(-1.5F, 17F, -1.5F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      ArmR = new ModelRenderer(this, 16, 13);
      ArmR.addBox(0F, 0F, 0F, 3, 1, 1);
      ArmR.setRotationPoint(1F, 17F, -1F);
      ArmR.setTextureSize(64, 32);
      ArmR.mirror = true;
      setRotation(ArmR, 0F, 0.4089647F, 0.2974289F);
      ArmL = new ModelRenderer(this, 0, 13);
      ArmL.addBox(-3F, 0F, 0F, 3, 1, 1);
      ArmL.setRotationPoint(-1F, 17F, -1F);
      ArmL.setTextureSize(64, 32);
      ArmL.mirror = true;
      setRotation(ArmL, 0F, -0.4461433F, -0.4089647F);
      Head = new ModelRenderer(this, 0, 17);
      Head.addBox(0F, 0F, 0F, 2, 2, 3);
      Head.setRotationPoint(-1F, 15F, -2.52F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 24, 24);
      Nose.addBox(0F, 0F, 0F, 1, 1, 1);
      Nose.setRotationPoint(-0.5F, 16F, -3F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 11, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape4.setRotationPoint(4F, 23F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 8, 0);
      Shape6.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape6.setRotationPoint(0F, 23F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 7);
      Shape7.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape7.setRotationPoint(1F, 23F, 4F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 9, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(-3F, 23F, 4F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 7, 2);
      Shape5.addBox(0F, 0F, 0F, 3, 1, 2);
      Shape5.setRotationPoint(-5F, 23F, -5F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 11, 3);
      Shape9.addBox(0F, 0F, 0F, 4, 1, 2);
      Shape9.setRotationPoint(2F, 23F, 3F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 10, 2);
      Shape10.addBox(0F, 0F, 0F, 3, 1, 2);
      Shape10.setRotationPoint(-6F, 23F, 1F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
        Shape4.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);
        Shape5.render(f5);
        Shape9.render(f5);
        Shape10.render(f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
    
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
  }

}
