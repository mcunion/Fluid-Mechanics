// Date: 1/22/2013 9:59:56 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package dark.fluid.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelPump extends ModelBase
{
    // fields
    ModelRenderer Body;
    ModelRenderer pipecc1;
    ModelRenderer pipecc3;
    ModelRenderer wheelcenter;
    ModelRenderer wheelcenter2;
    ModelRenderer joint;
    ModelRenderer wheelcc0;
    ModelRenderer wheelcc1;
    ModelRenderer wheelcc2;
    ModelRenderer wheelcc3;
    ModelRenderer wheelcc4;
    ModelRenderer wheelcc5;
    ModelRenderer wheelcc6;
    ModelRenderer wheelcc7;
    ModelRenderer wheelBrace;
    ModelRenderer piston_top;
    ModelRenderer piston;
    ModelRenderer wheelBrace2;
    ModelRenderer joint2;
    ModelRenderer w2;
    ModelRenderer w22;
    ModelRenderer w2cc;
    ModelRenderer w2cc1;
    ModelRenderer w2cc2;
    ModelRenderer w2cc3;
    ModelRenderer w2cc4;
    ModelRenderer w2cc5;
    ModelRenderer w2cc6;
    ModelRenderer w2cc7;
    ModelRenderer side7;
    ModelRenderer side8;

    public ModelPump()
    {
        textureWidth = 128;
        textureHeight = 128;

        Body = new ModelRenderer(this, 0, 109);
        Body.addBox(-3F, 0F, -3F, 6, 12, 6);
        Body.setRotationPoint(0F, 12F, 0F);
        Body.setTextureSize(128, 128);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        pipecc1 = new ModelRenderer(this, 21, 92);
        pipecc1.addBox(-3.5F, -3.5F, 3F, 7, 7, 5);
        pipecc1.setRotationPoint(0F, 16F, 0F);
        pipecc1.setTextureSize(128, 128);
        pipecc1.mirror = true;
        setRotation(pipecc1, 0F, 1.570796F, 0F);
        pipecc3 = new ModelRenderer(this, 8, 50);
        pipecc3.addBox(-3.5F, -4F, 3F, 7, 5, 5);
        pipecc3.setRotationPoint(0F, 16F, 0F);
        pipecc3.setTextureSize(128, 128);
        pipecc3.mirror = true;
        setRotation(pipecc3, 0F, 3.141593F, 0F);
        wheelcenter = new ModelRenderer(this, 0, 25);
        wheelcenter.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
        wheelcenter.setRotationPoint(-5F, 18F, 0F);
        wheelcenter.setTextureSize(128, 128);
        wheelcenter.mirror = true;
        setRotation(wheelcenter, 0F, 0F, 0F);
        wheelcenter2 = new ModelRenderer(this, 0, 25);
        wheelcenter2.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
        wheelcenter2.setRotationPoint(-5F, 18F, 0F);
        wheelcenter2.setTextureSize(128, 128);
        wheelcenter2.mirror = true;
        setRotation(wheelcenter2, 0.7853982F, 0F, 0F);
        joint = new ModelRenderer(this, 0, 18);
        joint.addBox(0F, -1.5F, -1.5F, 1, 3, 3);
        joint.setRotationPoint(-4F, 18F, 0F);
        joint.setTextureSize(128, 128);
        joint.mirror = true;
        setRotation(joint, 0F, 0F, 0F);
        wheelcc0 = new ModelRenderer(this, 0, 0);
        wheelcc0.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc0.setRotationPoint(-5F, 18F, 0F);
        wheelcc0.setTextureSize(128, 128);
        wheelcc0.mirror = true;
        setRotation(wheelcc0, 1.570796F, 0F, 0F);
        wheelcc1 = new ModelRenderer(this, 0, 0);
        wheelcc1.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc1.setRotationPoint(-5F, 18F, 0F);
        wheelcc1.setTextureSize(128, 128);
        wheelcc1.mirror = true;
        setRotation(wheelcc1, 0F, 0F, 0F);
        wheelcc2 = new ModelRenderer(this, 0, 0);
        wheelcc2.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc2.setRotationPoint(-5F, 18F, 0F);
        wheelcc2.setTextureSize(128, 128);
        wheelcc2.mirror = true;
        setRotation(wheelcc2, -1.570796F, 0F, 0F);
        wheelcc3 = new ModelRenderer(this, 0, 0);
        wheelcc3.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc3.setRotationPoint(-5F, 18F, 0F);
        wheelcc3.setTextureSize(128, 128);
        wheelcc3.mirror = true;
        setRotation(wheelcc3, 3.141593F, 0F, 0F);
        wheelcc4 = new ModelRenderer(this, 0, 0);
        wheelcc4.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc4.setRotationPoint(-5F, 18F, 0F);
        wheelcc4.setTextureSize(128, 128);
        wheelcc4.mirror = true;
        setRotation(wheelcc4, 0.7853982F, 0F, 0F);
        wheelcc5 = new ModelRenderer(this, 0, 0);
        wheelcc5.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc5.setRotationPoint(-5F, 18F, 0F);
        wheelcc5.setTextureSize(128, 128);
        wheelcc5.mirror = true;
        setRotation(wheelcc5, -2.356194F, 0F, 0F);
        wheelcc6 = new ModelRenderer(this, 0, 0);
        wheelcc6.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc6.setRotationPoint(-5F, 18F, 0F);
        wheelcc6.setTextureSize(128, 128);
        wheelcc6.mirror = true;
        setRotation(wheelcc6, -0.7853982F, 0F, 0F);
        wheelcc7 = new ModelRenderer(this, 0, 0);
        wheelcc7.addBox(0F, -4.5F, -2F, 1, 1, 4);
        wheelcc7.setRotationPoint(-5F, 18F, 0F);
        wheelcc7.setTextureSize(128, 128);
        wheelcc7.mirror = true;
        setRotation(wheelcc7, 2.356194F, 0F, 0F);
        wheelBrace = new ModelRenderer(this, 27, 5);
        wheelBrace.addBox(0F, -1.5F, -1.5F, 1, 8, 3);
        wheelBrace.setRotationPoint(-6F, 18F, 0F);
        wheelBrace.setTextureSize(128, 128);
        wheelBrace.mirror = true;
        setRotation(wheelBrace, 0F, 0F, 0F);
        piston_top = new ModelRenderer(this, 0, 81);
        piston_top.addBox(-3F, 0F, -3F, 6, 1, 6);
        piston_top.setRotationPoint(0F, 10F, 0F);
        piston_top.setTextureSize(128, 128);
        piston_top.mirror = true;
        setRotation(piston_top, 0F, 0F, 0F);
        piston = new ModelRenderer(this, 0, 90);
        piston.addBox(-2.5F, 0F, -2.5F, 5, 12, 5);
        piston.setRotationPoint(0F, 11F, 0F);
        piston.setTextureSize(128, 128);
        piston.mirror = true;
        setRotation(piston, 0F, 0F, 0F);
        wheelBrace2 = new ModelRenderer(this, 26, 18);
        wheelBrace2.addBox(0F, 0F, -1.5F, 2, 1, 3);
        wheelBrace2.setRotationPoint(-5F, 23F, 0F);
        wheelBrace2.setTextureSize(128, 128);
        wheelBrace2.mirror = true;
        setRotation(wheelBrace2, 0F, 0F, 0F);
        joint2 = new ModelRenderer(this, 0, 14);
        joint2.addBox(0F, -0.5F, -0.5F, 1, 1, 1);
        joint2.setRotationPoint(-4F, 14F, -6F);
        joint2.setTextureSize(128, 128);
        joint2.mirror = true;
        setRotation(joint2, 0F, 0F, 0F);
        w2 = new ModelRenderer(this, 0, 55);
        w2.addBox(0F, -1F, -1F, 1, 2, 2);
        w2.setRotationPoint(-5F, 14F, -6F);
        w2.setTextureSize(128, 128);
        w2.mirror = true;
        setRotation(w2, 0.7853982F, 0F, 0F);
        w22 = new ModelRenderer(this, 0, 55);
        w22.addBox(0F, -1F, -1F, 1, 2, 2);
        w22.setRotationPoint(-5F, 14F, -6F);
        w22.setTextureSize(128, 128);
        w22.mirror = true;
        setRotation(w22, 0F, 0F, 0F);
        w2cc = new ModelRenderer(this, 0, 50);
        w2cc.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc.setRotationPoint(-5F, 14F, -6F);
        w2cc.setTextureSize(128, 128);
        w2cc.mirror = true;
        setRotation(w2cc, 1.570796F, 0F, 0F);
        w2cc1 = new ModelRenderer(this, 0, 50);
        w2cc1.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc1.setRotationPoint(-5F, 14F, -6F);
        w2cc1.setTextureSize(128, 128);
        w2cc1.mirror = true;
        setRotation(w2cc1, 0.7853982F, 0F, 0F);
        w2cc2 = new ModelRenderer(this, 0, 50);
        w2cc2.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc2.setRotationPoint(-5F, 14F, -6F);
        w2cc2.setTextureSize(128, 128);
        w2cc2.mirror = true;
        setRotation(w2cc2, 0F, 0F, 0F);
        w2cc3 = new ModelRenderer(this, 0, 50);
        w2cc3.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc3.setRotationPoint(-5F, 14F, -6F);
        w2cc3.setTextureSize(128, 128);
        w2cc3.mirror = true;
        setRotation(w2cc3, -0.7853982F, 0F, 0F);
        w2cc4 = new ModelRenderer(this, 0, 50);
        w2cc4.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc4.setRotationPoint(-5F, 14F, -6F);
        w2cc4.setTextureSize(128, 128);
        w2cc4.mirror = true;
        setRotation(w2cc4, -1.570796F, 0F, 0F);
        w2cc5 = new ModelRenderer(this, 0, 50);
        w2cc5.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc5.setRotationPoint(-5F, 14F, -6F);
        w2cc5.setTextureSize(128, 128);
        w2cc5.mirror = true;
        setRotation(w2cc5, -2.356194F, 0F, 0F);
        w2cc6 = new ModelRenderer(this, 0, 50);
        w2cc6.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc6.setRotationPoint(-5F, 14F, -6F);
        w2cc6.setTextureSize(128, 128);
        w2cc6.mirror = true;
        setRotation(w2cc6, 3.141593F, 0F, 0F);
        w2cc7 = new ModelRenderer(this, 0, 50);
        w2cc7.addBox(0F, 1.3F, -1F, 1, 1, 2);
        w2cc7.setRotationPoint(-5F, 14F, -6F);
        w2cc7.setTextureSize(128, 128);
        w2cc7.mirror = true;
        setRotation(w2cc7, -3.926991F, 0F, 0F);
        side7 = new ModelRenderer(this, 0, 65);
        side7.addBox(-2.5F, -4F, 3F, 5, 7, 4);
        side7.setRotationPoint(0F, 21F, 0F);
        side7.setTextureSize(128, 128);
        side7.mirror = true;
        setRotation(side7, 0F, 3.141593F, 0F);
        side8 = new ModelRenderer(this, 25, 111);
        side8.addBox(-2.5F, 0F, 3F, 5, 11, 3);
        side8.setRotationPoint(0F, 13F, 0F);
        side8.setTextureSize(128, 128);
        side8.mirror = true;
        setRotation(side8, 0F, 0F, 0F);
    }

    public void render(float f5)
    {
        Body.render(f5);
        pipecc1.render(f5);
        pipecc3.render(f5);

        joint.render(f5);

        wheelBrace.render(f5);
        piston_top.render(f5);
        piston.render(f5);
        wheelBrace2.render(f5);
        joint2.render(f5);

        side7.render(f5);
        side8.render(f5);
    }

    public void renderMotion(float f5, int i)
    {
        //wheel 1
        wheelcenter.render(f5);
        wheelcenter2.render(f5);
        wheelcc0.render(f5);
        wheelcc1.render(f5);
        wheelcc2.render(f5);
        wheelcc3.render(f5);
        wheelcc4.render(f5);
        wheelcc5.render(f5);
        wheelcc6.render(f5);
        wheelcc7.render(f5);
        // wheel 2
        w2.render(f5);
        w22.render(f5);
        w2cc.render(f5);
        w2cc1.render(f5);
        w2cc2.render(f5);
        w2cc3.render(f5);
        w2cc4.render(f5);
        w2cc5.render(f5);
        w2cc6.render(f5);
        w2cc7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
