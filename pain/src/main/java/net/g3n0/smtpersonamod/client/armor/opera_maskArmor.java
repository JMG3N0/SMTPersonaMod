package net.g3n0.smtpersonamod.client.armor;// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

import java.util.Collections;

public class opera_maskArmor extends BipedModel<LivingEntity> {
	private final ModelRenderer group;
	private final ModelRenderer Inner;
	private final ModelRenderer Outer;

	public opera_maskArmor(float size) {
		super(size);
		texWidth = 64;
		texHeight = 64;

		group = new ModelRenderer(this);

		

		Inner = new ModelRenderer(this);

		group.addChild(Inner);
		Inner.texOffs(1, 0).addBox(-0.675F, -0.5F, 8.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-1.325F, -0.5F, 8.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-7.35F, -1.05F, 8.0F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(1.325F, -1.05F, 8.0F, 6.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(4.0F, -1.7F, 8.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(6.65F, -2.325F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-7.35F, -2.325F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-7.35F, -1.675F, 8.0F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(6.0F, 0.35F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(5.325F, 1.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(4.65F, 1.65F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(3.325F, 3.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-6.6687F, 0.35F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-5.9938F, 1.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-5.3187F, 1.65F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-3.9938F, 3.0F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-3.3438F, 2.325F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(1.9813F, 2.325F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-5.3438F, 2.325F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(4.0062F, 2.325F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-1.9938F, 0.325F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(0.075F, -0.5F, 8.0F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Inner.texOffs(1, 0).addBox(-4.75F, 3.0F, 8.0F, 9.0F, 0.0F, 0.0F, 0.0F, false);

		Outer = new ModelRenderer(this);

		group.addChild(Outer);
		Outer.texOffs(52, 24).addBox(6.65F, -3.025F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(6.7125F, 0.3625F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(6.0125F, 1.6625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(5.3625F, 2.3625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-6.0F, 2.3625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-7.9625F, -3.025F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-7.4F, 0.3625F, 8.0F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-6.7F, 1.6625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(0.7625F, 4.3375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-1.3375F, 4.3375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(4.0125F, 3.7625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-4.7625F, 3.7625F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(3.3125F, 4.3375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-4.0125F, 4.3375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-3.9875F, 2.3125F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-3.3375F, 1.9625F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-1.9875F, 0.9875F, 8.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-4.6375F, 1.6375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-5.3125F, 0.9875F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-5.9625F, 0.3375F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(3.325F, 2.3125F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(1.975F, 1.9875F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(1.325F, 0.9875F, 8.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(4.0F, 1.6375F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(4.65F, 0.9875F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(2.0F, 0.3375F, 8.0F, 4.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(1.3375F, 3.7625F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-3.3125F, 3.7625F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-6.6375F, -2.3375F, 8.0F, 3.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(3.9875F, -2.3375F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(1.3125F, -1.7125F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-3.3125F, -1.7125F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-1.3125F, -1.0375F, 8.0F, 2.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-0.6875F, 4.9875F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(4.7625F, 3.0125F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-5.3625F, 3.0125F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(7.3625F, -2.3375F, 8.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);
		Outer.texOffs(52, 24).addBox(-7.9875F, -2.3375F, 8.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);
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