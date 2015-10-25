// Date: 02.04.2013 11:33:47
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package thelarsinator.lomforrestandplains.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ModelSquirrel extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer tail;
    ModelRenderer head;
    ModelRenderer chest;
    ModelRenderer leg_2;
    ModelRenderer leg;
    ModelRenderer leg_front_2;
    ModelRenderer leg_front;
    ModelRenderer ear_2;
    ModelRenderer ear;
  
  public ModelSquirrel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 3, 2, 5);
      body.setRotationPoint(-1F, 20.8F, -2F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 0, 15);
      tail.addBox(-1F, 0F, 1F, 2, 2, 5);
      tail.setRotationPoint(0.5F, 21.2F, 1.5F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0.2617994F, 0F, 0F);
      head = new ModelRenderer(this, 16, 8);
      head.addBox(-1F, -1F, -2F, 2, 2, 2);
      head.setRotationPoint(0.5F, 21.9F, -2F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      chest = new ModelRenderer(this, 0, 8);
      chest.addBox(0F, 0F, 0F, 2, 1, 5);
      chest.setRotationPoint(-0.5F, 22F, -2F);
      chest.setTextureSize(64, 32);
      chest.mirror = true;
      setRotation(chest, 0F, 0F, 0F);
      leg_2 = new ModelRenderer(this, 40, 0);
      leg_2.addBox(0F, 0F, 0F, 1, 3, 1);
      leg_2.setRotationPoint(1.5F, 21F, 1.5F);
      leg_2.setTextureSize(64, 32);
      leg_2.mirror = true;
      setRotation(leg_2, 0.1745329F, 0F, 0F);
      leg = new ModelRenderer(this, 35, 0);
      leg.addBox(0F, 0F, 0F, 1, 3, 1);
      leg.setRotationPoint(-1.5F, 21F, 1.5F);
      leg.setTextureSize(64, 32);
      leg.mirror = true;
      setRotation(leg, 0.1745329F, 0F, 0F);
      leg_front_2 = new ModelRenderer(this, 25, 0);
      leg_front_2.addBox(0F, 0F, 0F, 1, 3, 1);
      leg_front_2.setRotationPoint(1.5F, 20.8F, -1.5F);
      leg_front_2.setTextureSize(64, 32);
      leg_front_2.mirror = true;
      setRotation(leg_front_2, -0.1745329F, 0F, 0F);
      leg_front = new ModelRenderer(this, 30, 0);
      leg_front.addBox(0F, 0F, 0F, 1, 3, 1);
      leg_front.setRotationPoint(-1.5F, 20.8F, -1.5F);
      leg_front.setTextureSize(64, 32);
      leg_front.mirror = true;
      setRotation(leg_front, -0.1745329F, 0F, 0F);
      ear_2 = new ModelRenderer(this, 18, 0);
      ear_2.addBox(0F, 0F, 0F, 0, 1, 1);
      ear_2.setRotationPoint(0.8F, 20F, -3F);
      ear_2.setTextureSize(64, 32);
      ear_2.mirror = true;
      setRotation(ear_2, 0F, 0.8726646F, 0F);
      ear = new ModelRenderer(this, 21, 0);
      ear.addBox(0F, 0F, 0F, 0, 1, 1);
      ear.setRotationPoint(0.2F, 20F, -3F);
      ear.setTextureSize(64, 32);
      ear.mirror = true;
      setRotation(ear, 0F, -0.8726646F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    if (this.isChild)
    {
        float var8 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
        GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);

        body.render(f5);
        tail.render(f5);
        head.render(f5);
        chest.render(f5);
        leg_2.render(f5);
        leg.render(f5);
        leg_front_2.render(f5);
        leg_front.render(f5);
        ear_2.render(f5);
        ear.render(f5);
        GL11.glPopMatrix();
        
    }
    else
    {
    body.render(f5);
    tail.render(f5);
    head.render(f5);
    chest.render(f5);
    leg_2.render(f5);
    leg.render(f5);
    leg_front_2.render(f5);
    leg_front.render(f5);
    ear_2.render(f5);
    ear.render(f5);}
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
    
    leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    leg_front_2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    leg_2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    leg_front.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
