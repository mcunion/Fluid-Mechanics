// Date: 6/3/2013 6:47:54 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package dark.fluid.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTankSide extends ModelBase
{
	// fields
	ModelRenderer backRightSiding;
	ModelRenderer backLeftSiding;
	ModelRenderer backTopSiding;
	ModelRenderer backBotSiding;
	ModelRenderer topLeft;
	ModelRenderer topRight;
	ModelRenderer botRight;
	ModelRenderer botLeft;
	ModelRenderer botRightOut;
	ModelRenderer botLeftOut;
	ModelRenderer topRightOut;
	ModelRenderer topLeftOut;

	public ModelTankSide()
	{
		textureWidth = 128;
		textureHeight = 128;

		 backRightSiding = new ModelRenderer(this, 0, 19);
	      backRightSiding.addBox(-7F, 10F, 7F, 2, 12, 1);
	      backRightSiding.setRotationPoint(0F, 0F, 0F);
	      backRightSiding.setTextureSize(128, 128);
	      backRightSiding.mirror = true;
	      setRotation(backRightSiding, 0F, 0F, 0F);
	      backLeftSiding = new ModelRenderer(this, 0, 19);
	      backLeftSiding.addBox(5F, 10F, 7F, 2, 12, 1);
	      backLeftSiding.setRotationPoint(0F, 0F, 0F);
	      backLeftSiding.setTextureSize(128, 128);
	      backLeftSiding.mirror = true;
	      setRotation(backLeftSiding, 0F, 0F, 0F);
	      backTopSiding = new ModelRenderer(this, 7, 8);
	      backTopSiding.addBox(-4F, 8F, 7F, 8, 2, 1);
	      backTopSiding.setRotationPoint(0F, 0F, 0F);
	      backTopSiding.setTextureSize(128, 128);
	      backTopSiding.mirror = true;
	      setRotation(backTopSiding, 0F, 0F, 0F);
	      backBotSiding = new ModelRenderer(this, 7, 8);
	      backBotSiding.addBox(-4F, 22F, 7F, 8, 2, 1);
	      backBotSiding.setRotationPoint(0F, 0F, 0F);
	      backBotSiding.setTextureSize(128, 128);
	      backBotSiding.mirror = true;
	      setRotation(backBotSiding, 0F, 0F, 0F);
	      topLeft = new ModelRenderer(this, 0, 0);
	      topLeft.addBox(4F, 8F, 7F, 2, 2, 1);
	      topLeft.setRotationPoint(0F, 0F, 0F);
	      topLeft.setTextureSize(128, 128);
	      topLeft.mirror = true;
	      setRotation(topLeft, 0F, 0F, 0F);
	      topRight = new ModelRenderer(this, 0, 0);
	      topRight.addBox(-6F, 8F, 7F, 2, 2, 1);
	      topRight.setRotationPoint(0F, 0F, 0F);
	      topRight.setTextureSize(128, 128);
	      topRight.mirror = true;
	      setRotation(topRight, 0F, 0F, 0F);
	      botRight = new ModelRenderer(this, 0, 0);
	      botRight.addBox(-6F, 22F, 7F, 2, 2, 1);
	      botRight.setRotationPoint(0F, 0F, 0F);
	      botRight.setTextureSize(128, 128);
	      botRight.mirror = true;
	      setRotation(botRight, 0F, 0F, 0F);
	      botLeft = new ModelRenderer(this, 0, 0);
	      botLeft.addBox(4F, 22F, 7F, 2, 2, 1);
	      botLeft.setRotationPoint(0F, 0F, 0F);
	      botLeft.setTextureSize(128, 128);
	      botLeft.mirror = true;
	      setRotation(botLeft, 0F, 0F, 0F);
	      botRightOut = new ModelRenderer(this, 0, 0);
	      botRightOut.addBox(-7F, 22F, 7F, 2, 2, 1);
	      botRightOut.setRotationPoint(0F, 0F, 0F);
	      botRightOut.setTextureSize(128, 128);
	      botRightOut.mirror = true;
	      setRotation(botRightOut, 0F, 0F, 0F);
	      botLeftOut = new ModelRenderer(this, 0, 0);
	      botLeftOut.addBox(5F, 22F, 7F, 2, 2, 1);
	      botLeftOut.setRotationPoint(0F, 0F, 0F);
	      botLeftOut.setTextureSize(128, 128);
	      botLeftOut.mirror = true;
	      setRotation(botLeftOut, 0F, 0F, 0F);
	      topRightOut = new ModelRenderer(this, 0, 0);
	      topRightOut.addBox(-7F, 8F, 7F, 2, 2, 1);
	      topRightOut.setRotationPoint(0F, 0F, 0F);
	      topRightOut.setTextureSize(128, 128);
	      topRightOut.mirror = true;
	      setRotation(topRightOut, 0F, 0F, 0F);
	      topLeftOut = new ModelRenderer(this, 0, 0);
	      topLeftOut.addBox(5F, 8F, 7F, 2, 2, 1);
	      topLeftOut.setRotationPoint(0F, 0F, 0F);
	      topLeftOut.setTextureSize(128, 128);
	      topLeftOut.mirror = true;
	      setRotation(topLeftOut, 0F, 0F, 0F);
	}

	public void render(float f5, boolean left, boolean right, boolean bot, boolean top)
	{
		//tankBack.render(f5);
		if (!top)
		{
			backTopSiding.render(f5);
			topLeft.render(f5);
			topRight.render(f5);
			topRightOut.render(f5);
			topLeftOut.render(f5);
		}
		if (!bot)
		{
			backBotSiding.render(f5);
			botRight.render(f5);
			botLeft.render(f5);
			botRightOut.render(f5);
			botLeftOut.render(f5);
		}
		if (!right)
		{
			backRightSiding.render(f5);
			if (top)
			{
				topRight.render(f5);
			}
		}
		else
		{
			//tankBackRight.render(f5);
			
		}
		if (!left)
		{
			backLeftSiding.render(f5);
		}
		else
		{
			//tankBackLeft.render(f5);
		}

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}