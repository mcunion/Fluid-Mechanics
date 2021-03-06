// Date: 10/8/2012 7:31:40 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package dark.fluid.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.tileentity.TileEntity;
import dark.fluid.common.machines.TileEntityTank;

public class ModelLiquidTank extends ModelBase
{
    // fields
    ModelRenderer Mid;
    ModelRenderer Corner;
    ModelRenderer Corner2;
    ModelRenderer Corner3;
    ModelRenderer Corner4;
    ModelRenderer C8;
    ModelRenderer C7;
    ModelRenderer C6;
    ModelRenderer C5;
    ModelRenderer C4;
    ModelRenderer C;
    ModelRenderer C3;
    ModelRenderer C2;
    ModelRenderer GuageT;
    ModelRenderer GuageB;
    ModelRenderer Guage;
    ModelRenderer GuageR;
    // ModelRenderer GuageGlass;
    ModelRenderer GuageL;

    ModelRenderer GuageT2;
    ModelRenderer GuageB2;
    ModelRenderer Guage2;
    ModelRenderer GuageR2;
    // ModelRenderer GuageGlass2;
    ModelRenderer GuageL2;

    ModelRenderer GuageT3;
    ModelRenderer GuageB3;
    ModelRenderer Guage3;
    ModelRenderer GuageR3;
    // ModelRenderer GuageGlass3;
    ModelRenderer GuageL3;

    ModelRenderer GuageT4;
    ModelRenderer GuageB4;
    ModelRenderer Guage4;
    ModelRenderer GuageR4;
    // ModelRenderer GuageGlass4;
    ModelRenderer GuageL4;

    ModelRenderer CCBottom;
    ModelRenderer CCRight;
    ModelRenderer CCLeft;
    ModelRenderer CCFront;
    ModelRenderer CCBack;
    ModelRenderer CCTop;

    public ModelLiquidTank()
    {
        textureWidth = 128;
        textureHeight = 128;

        Mid = new ModelRenderer(this, 0, 50);
        Mid.addBox(-6F, 0F, -6F, 12, 14, 12);
        Mid.setRotationPoint(0F, 9F, 0F);
        Mid.setTextureSize(128, 128);
        Mid.mirror = true;
        setRotation(Mid, 0F, 0F, 0F);
        Corner = new ModelRenderer(this, 0, 30);
        Corner.addBox(-1F, 0F, -1F, 2, 16, 2);
        Corner.setRotationPoint(-7F, 8F, 7F);
        Corner.setTextureSize(128, 128);
        Corner.mirror = true;
        setRotation(Corner, 0F, 0F, 0F);
        Corner2 = new ModelRenderer(this, 0, 30);
        Corner2.addBox(-1F, 0F, -1F, 2, 16, 2);
        Corner2.setRotationPoint(-7F, 8F, -7F);
        Corner2.setTextureSize(128, 128);
        Corner2.mirror = true;
        setRotation(Corner2, 0F, 0F, 0F);
        Corner3 = new ModelRenderer(this, 0, 30);
        Corner3.addBox(-1F, 0F, -1F, 2, 16, 2);
        Corner3.setRotationPoint(7F, 8F, -7F);
        Corner3.setTextureSize(128, 128);
        Corner3.mirror = true;
        setRotation(Corner3, 0F, 0F, 0F);
        Corner4 = new ModelRenderer(this, 0, 30);
        Corner4.addBox(-1F, 0F, -1F, 2, 16, 2);
        Corner4.setRotationPoint(7F, 8F, 7F);
        Corner4.setTextureSize(128, 128);
        Corner4.mirror = true;
        setRotation(Corner4, 0F, 0F, 0F);
        C8 = new ModelRenderer(this, 9, 35);
        C8.addBox(-1F, 0F, -1F, 2, 2, 12);
        C8.setRotationPoint(6F, 22F, -5F);
        C8.setTextureSize(128, 128);
        C8.mirror = true;
        setRotation(C8, 0F, 0F, 0F);
        C7 = new ModelRenderer(this, 9, 35);
        C7.addBox(-1F, 0F, -1F, 2, 2, 12);
        C7.setRotationPoint(-6F, 8F, -5F);
        C7.setTextureSize(128, 128);
        C7.mirror = true;
        setRotation(C7, 0F, 0F, 0F);
        C6 = new ModelRenderer(this, 9, 35);
        C6.addBox(-1F, 0F, -1F, 2, 2, 12);
        C6.setRotationPoint(6F, 8F, -5F);
        C6.setTextureSize(128, 128);
        C6.mirror = true;
        setRotation(C6, 0F, 0F, 0F);
        C5 = new ModelRenderer(this, 9, 30);
        C5.addBox(-1F, 0F, -1F, 12, 2, 2);
        C5.setRotationPoint(-5F, 8F, 6F);
        C5.setTextureSize(128, 128);
        C5.mirror = true;
        setRotation(C5, 0F, 0F, 0F);
        C4 = new ModelRenderer(this, 9, 35);
        C4.addBox(-1F, 0F, -1F, 2, 2, 12);
        C4.setRotationPoint(-6F, 22F, -5F);
        C4.setTextureSize(128, 128);
        C4.mirror = true;
        setRotation(C4, 0F, 0F, 0F);
        C = new ModelRenderer(this, 9, 30);
        C.addBox(-1F, 0F, -1F, 12, 2, 2);
        C.setRotationPoint(-5F, 22F, 6F);
        C.setTextureSize(128, 128);
        C.mirror = true;
        setRotation(C, 0F, 0F, 0F);
        C3 = new ModelRenderer(this, 9, 30);
        C3.addBox(-1F, 0F, -1F, 12, 2, 2);
        C3.setRotationPoint(-5F, 8F, -6F);
        C3.setTextureSize(128, 128);
        C3.mirror = true;
        setRotation(C3, 0F, 0F, 0F);
        C2 = new ModelRenderer(this, 9, 30);
        C2.addBox(-1F, 0F, -1F, 12, 2, 2);
        C2.setRotationPoint(-5F, 22F, -6F);
        C2.setTextureSize(128, 128);
        C2.mirror = true;
        setRotation(C2, 0F, 0F, 0F);
        // G1--------------------------------------
        GuageT = new ModelRenderer(this, 54, 42);
        GuageT.addBox(-1F, -1F, 0F, 2, 1, 2);
        GuageT.setRotationPoint(0F, 12F, -8F);
        GuageT.setTextureSize(128, 128);
        GuageT.mirror = true;
        setRotation(GuageT, 0F, 0F, 0F);
        GuageB = new ModelRenderer(this, 54, 42);
        GuageB.addBox(-1F, 8F, 0F, 2, 1, 2);
        GuageB.setRotationPoint(0F, 12F, -8F);
        GuageB.setTextureSize(128, 128);
        GuageB.mirror = true;
        setRotation(GuageB, 0F, 0F, 0F);
        Guage = new ModelRenderer(this, 54, 32);
        Guage.addBox(-1F, 0F, 0F, 2, 8, 1);
        Guage.setRotationPoint(0F, 12F, -7F);
        Guage.setTextureSize(128, 128);
        Guage.mirror = true;
        setRotation(Guage, 0F, 0F, 0F);
        GuageR = new ModelRenderer(this, 44, 32);
        GuageR.addBox(1F, -1F, -1F, 2, 10, 2);
        GuageR.setRotationPoint(0F, 12F, -7F);
        GuageR.setTextureSize(128, 128);
        GuageR.mirror = true;
        setRotation(GuageR, 0F, 0F, 0F);
        // GuageGlass = new ModelRenderer(this, 60, 32);
        // GuageGlass.addBox(-1F, 0F, 0F, 2, 8, 1);
        // GuageGlass.setRotationPoint(0F, 12F, -8F);
        // GuageGlass.setTextureSize(128, 128);
        // GuageGlass.mirror = true;
        // setRotation(GuageGlass, 0F, 0F, 0F);
        GuageL = new ModelRenderer(this, 44, 32);
        GuageL.addBox(-3F, -1F, -1F, 2, 10, 2);
        GuageL.setRotationPoint(0F, 12F, -7F);
        GuageL.setTextureSize(128, 128);
        GuageL.mirror = true;
        setRotation(GuageL, 0F, 0F, 0F);
        // G2----------------------------------
        GuageT2 = new ModelRenderer(this, 54, 42);
        GuageT2.addBox(-1F, -1F, 0F, 2, 1, 2);
        GuageT2.setRotationPoint(-8F, 12F, 0F);
        GuageT2.setTextureSize(128, 128);
        GuageT2.mirror = true;
        setRotation(GuageT2, 0F, 1.570796F, 0F);
        GuageB2 = new ModelRenderer(this, 54, 42);
        GuageB2.addBox(-1F, 8F, 0F, 2, 1, 2);
        GuageB2.setRotationPoint(-8F, 12F, 0F);
        GuageB2.setTextureSize(128, 128);
        GuageB2.mirror = true;
        setRotation(GuageB2, 0F, 1.570796F, 0F);
        Guage2 = new ModelRenderer(this, 54, 32);
        Guage2.addBox(-1F, 0F, 0F, 2, 8, 1);
        Guage2.setRotationPoint(-7F, 12F, 0F);
        Guage2.setTextureSize(128, 128);
        Guage2.mirror = true;
        setRotation(Guage2, 0F, 1.570796F, 0F);
        GuageR2 = new ModelRenderer(this, 44, 32);
        GuageR2.addBox(1F, -1F, -1F, 2, 10, 2);
        GuageR2.setRotationPoint(-7F, 12F, 0F);
        GuageR2.setTextureSize(128, 128);
        GuageR2.mirror = true;
        setRotation(GuageR2, 0F, 1.570796F, 0F);
        // GuageGlass2 = new ModelRenderer(this, 60, 32);
        // GuageGlass2.addBox(-1F, 0F, 0F, 2, 8, 1);
        // GuageGlass2.setRotationPoint(-8F, 12F, 0F);
        // GuageGlass2.setTextureSize(128, 128);
        // GuageGlass2.mirror = true;
        // setRotation(GuageGlass2, 0F, 1.570796F, 0F);
        GuageL2 = new ModelRenderer(this, 44, 32);
        GuageL2.addBox(-3F, -1F, -1F, 2, 10, 2);
        GuageL2.setRotationPoint(-7F, 12F, 0F);
        GuageL2.setTextureSize(128, 128);
        GuageL2.mirror = true;
        setRotation(GuageL2, 0F, 1.570796F, 0F);
        // G3--------------------------------------
        GuageT3 = new ModelRenderer(this, 54, 42);
        GuageT3.addBox(-1F, -1F, 0F, 2, 1, 2);
        GuageT3.setRotationPoint(0F, 12F, 8F);
        GuageT3.setTextureSize(128, 128);
        GuageT3.mirror = true;
        setRotation(GuageT3, 0F, 3.141593F, 0F);
        GuageB3 = new ModelRenderer(this, 54, 42);
        GuageB3.addBox(-1F, 8F, 0F, 2, 1, 2);
        GuageB3.setRotationPoint(0F, 12F, 8F);
        GuageB3.setTextureSize(128, 128);
        GuageB3.mirror = true;
        setRotation(GuageB3, 0F, 3.141593F, 0F);
        Guage3 = new ModelRenderer(this, 54, 32);
        Guage3.addBox(-1F, 0F, 0F, 2, 8, 1);
        Guage3.setRotationPoint(0F, 12F, 7F);
        Guage3.setTextureSize(128, 128);
        Guage3.mirror = true;
        setRotation(Guage3, 0F, 3.141593F, 0F);
        GuageR3 = new ModelRenderer(this, 44, 32);
        GuageR3.addBox(1F, -1F, -1F, 2, 10, 2);
        GuageR3.setRotationPoint(0F, 12F, 7F);
        GuageR3.setTextureSize(128, 128);
        GuageR3.mirror = true;
        setRotation(GuageR3, 0F, 3.141593F, 0F);
        // GuageGlass3 = new ModelRenderer(this, 60, 32);
        // GuageGlass3.addBox(-1F, 0F, 0F, 2, 8, 1);
        // GuageGlass3.setRotationPoint(0F, 12F, 8F);
        // GuageGlass3.setTextureSize(128, 128);
        // GuageGlass3.mirror = true;
        // setRotation(GuageGlass3, 0F, 3.141593F, 0F);
        GuageL3 = new ModelRenderer(this, 44, 32);
        GuageL3.addBox(-3F, -1F, -1F, 2, 10, 2);
        GuageL3.setRotationPoint(0F, 12F, 7F);
        GuageL3.setTextureSize(128, 128);
        GuageL3.mirror = true;
        setRotation(GuageL3, 0F, 3.141593F, 0F);
        // G4-------------------------------
        GuageT4 = new ModelRenderer(this, 54, 42);
        GuageT4.addBox(-1F, -1F, 0F, 2, 1, 2);
        GuageT4.setRotationPoint(8F, 12F, 0F);
        GuageT4.setTextureSize(128, 128);
        GuageT4.mirror = true;
        setRotation(GuageT4, 0F, -1.570796F, 0F);
        GuageB4 = new ModelRenderer(this, 54, 42);
        GuageB4.addBox(-1F, 8F, 0F, 2, 1, 2);
        GuageB4.setRotationPoint(8F, 12F, 0F);
        GuageB4.setTextureSize(128, 128);
        GuageB4.mirror = true;
        setRotation(GuageB4, 0F, -1.570796F, 0F);
        Guage4 = new ModelRenderer(this, 54, 32);
        Guage4.addBox(-1F, 0F, 0F, 2, 8, 1);
        Guage4.setRotationPoint(7F, 12F, 0F);
        Guage4.setTextureSize(128, 128);
        Guage4.mirror = true;
        setRotation(Guage4, 0F, -1.570796F, 0F);
        GuageR4 = new ModelRenderer(this, 44, 32);
        GuageR4.addBox(1F, -1F, -1F, 2, 10, 2);
        GuageR4.setRotationPoint(7F, 12F, 0F);
        GuageR4.setTextureSize(128, 128);
        GuageR4.mirror = true;
        setRotation(GuageR4, 0F, -1.570796F, 0F);
        // GuageGlass4 = new ModelRenderer(this, 60, 32);
        // GuageGlass4.addBox(-1F, 0F, 0F, 2, 8, 1);
        // GuageGlass4.setRotationPoint(8F, 12F, 0F);
        // GuageGlass4.setTextureSize(128, 128);
        // GuageGlass4.mirror = true;
        // setRotation(GuageGlass4, 0F, -1.570796F, 0F);
        GuageL4 = new ModelRenderer(this, 44, 32);
        GuageL4.addBox(-3F, -1F, -1F, 2, 10, 2);
        GuageL4.setRotationPoint(7F, 12F, 0F);
        GuageL4.setTextureSize(128, 128);
        GuageL4.mirror = true;
        setRotation(GuageL4, 0F, -1.570796F, 0F);
        // Pipe Connectors
        CCBottom = new ModelRenderer(this, 0, 0);
        CCBottom.addBox(-3F, -9F, -3F, 6, 1, 6);
        CCBottom.setRotationPoint(0F, 15F, 0F);
        CCBottom.setTextureSize(128, 128);
        CCBottom.mirror = true;
        setRotation(CCBottom, 3.141593F, 0F, 0F);
        CCRight = new ModelRenderer(this, 0, 0);
        CCRight.addBox(-3F, -8F, -3F, 6, 2, 6);
        CCRight.setRotationPoint(0F, 15F, 0F);
        CCRight.setTextureSize(128, 128);
        CCRight.mirror = true;
        setRotation(CCRight, 0F, 0F, -1.570796F);
        CCLeft = new ModelRenderer(this, 0, 0);
        CCLeft.addBox(-3F, -8F, -3F, 6, 2, 6);
        CCLeft.setRotationPoint(0F, 15F, 0F);
        CCLeft.setTextureSize(128, 128);
        CCLeft.mirror = true;
        setRotation(CCLeft, 0F, 0F, 1.570796F);
        CCFront = new ModelRenderer(this, 0, 0);
        CCFront.addBox(-3F, -8F, -3F, 6, 2, 6);
        CCFront.setRotationPoint(0F, 15F, 0F);
        CCFront.setTextureSize(128, 128);
        CCFront.mirror = true;
        setRotation(CCFront, 1.570796F, 0F, 0F);
        CCBack = new ModelRenderer(this, 0, 0);
        CCBack.addBox(-3F, -8F, -3F, 6, 2, 6);
        CCBack.setRotationPoint(0F, 15F, 0F);
        CCBack.setTextureSize(128, 128);
        CCBack.mirror = true;
        setRotation(CCBack, -1.570796F, 0F, 0F);
        CCTop = new ModelRenderer(this, 0, 0);
        CCTop.addBox(-3F, -7F, -3F, 6, 1, 6);
        CCTop.setRotationPoint(0F, 15F, 0F);
        CCTop.setTextureSize(128, 128);
        CCTop.mirror = true;
        setRotation(CCTop, 0F, 0F, 0F);
    }

    public void renderMain(float f5)
    {

        // render regardless of sides
        Mid.render(f5);
        Corner.render(f5);
        Corner2.render(f5);
        Corner3.render(f5);
        Corner4.render(f5);
        C8.render(f5);
        C7.render(f5);
        C6.render(f5);
        C5.render(f5);
        C4.render(f5);
        C.render(f5);
        C3.render(f5);
        C2.render(f5);
        CCTop.render(f5);
        CCBottom.render(f5);

    }

    public void renderMeter(TileEntity tee, float f5)
    {
        int[] conenctedTiles = new int[6];
        if (tee instanceof TileEntityTank)
        {
            conenctedTiles = ((TileEntityTank) tee).renderConnection;
        }
        // Front
        if (conenctedTiles[3] == 1)
        {
            CCFront.render(f5);
        }
        else if (conenctedTiles[3] == 0)
        {
            GuageT.render(f5);
            GuageB.render(f5);
            Guage.render(f5);
            GuageR.render(f5);
            // GuageGlass.render(f5);
            GuageL.render(f5);
        }
        // back
        if (conenctedTiles[2] == 1)
        {
            CCBack.render(f5);
        }
        else if (conenctedTiles[2] == 0)
        {
            GuageT3.render(f5);
            Guage3.render(f5);
            Guage3.render(f5);
            GuageR3.render(f5);
            // GuageGlass3.render(f5);
            GuageL3.render(f5);
        }
        // right
        if (conenctedTiles[4] == 1)
        {
            CCRight.render(f5);
        }
        else if (conenctedTiles[4] == 0)
        {
            GuageT4.render(f5);
            Guage4.render(f5);
            Guage4.render(f5);
            GuageR4.render(f5);
            // GuageGlass4.render(f5);
            GuageL4.render(f5);
        }
        // left
        if (conenctedTiles[5] == 1)
        {
            CCLeft.render(f5);
        }
        else if (conenctedTiles[3] == 1)
        {
            GuageT2.render(f5);
            Guage2.render(f5);
            Guage2.render(f5);
            GuageR2.render(f5);
            // GuageGlass2.render(f5);
            GuageL2.render(f5);

        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
