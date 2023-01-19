package net.g3n0.smtpersonamod.client.armor;// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;

public class opera_maskArmor extends BipedModel<LivingEntity> {
	private final ModelRenderer bone;

	public opera_maskArmor(float size) {
		super(size);
		texWidth = 64;
		texHeight = 64;

		bone = new ModelRenderer(this);
		bone.setPos(-8.0F, 3.0F, 8.0F);

		//I am in pain	bone.texOffs(14, 37).addBox(-3.5F, -2.5F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0f, false);

		PartDefinition cube_r1 = bone.("cube_r1", CubeListBuilder.create().texOffs(14, 37).mirror().addBox(-3.5F, -2.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.7875F, -33.2125F, 0.25F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 19).mirror().addBox(-1.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.7875F, -37.2125F, 0.25F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(21, 58).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2125F, -31.7125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(21, 58).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2125F, -31.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.7875F, -31.2125F, 0.25F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(21, 58).mirror().addBox(-2.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.7875F, -31.7125F, 0.25F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -1.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2875F, -30.2125F, 4.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 13).addBox(-0.5F, -1.0F, -4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7125F, -30.2125F, 4.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7875F, -28.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, 16).mirror().addBox(-1.0F, -3.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.2875F, -32.7125F, 0.25F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 16).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.7125F, -32.7125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(39, 19).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7875F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(39, 19).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2125F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7875F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2125F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7875F, -27.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.2125F, -31.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7875F, -28.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.7875F, -29.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.7875F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.7875F, -31.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2125F, -30.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.2125F, -29.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2125F, -28.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(43, 8).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2125F, -27.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(13, 0).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2125F, -28.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 45).addBox(-4.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7875F, -34.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(22, 45).addBox(-4.5F, -0.5F, 2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2125F, -34.2125F, -2.75F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 19).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2125F, -37.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(37, 54).addBox(-8.5F, -7.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 54).addBox(-8.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 54).addBox(0.5F, 2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7875F, -36.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(37, 54).addBox(0.5F, 2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.2125F, -36.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 37).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.2125F, -36.2125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 19).addBox(1.0F, -12.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 21).addBox(-5.0F, -7.0F, -0.5F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 29).addBox(-8.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 21).addBox(-6.0F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 21).addBox(-4.0F, -2.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 45).addBox(-1.0F, -8.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 19).addBox(0.0F, -12.0F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2875F, -33.7125F, 0.25F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	protected Iterable<ModelRenderer> bodyParts() {
		return Collections.emptyList();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}