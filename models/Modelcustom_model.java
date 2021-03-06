// Made with Blockbench 3.5.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer main;

	public Modelcustom_model() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 23.0F, 0.0F);
		main.setTextureOffset(0, 0).addBox(-7.0F, -16.0F, -7.0F, 14.0F, 16.0F, 14.0F, 0.0F, false);
		main.setTextureOffset(56, 0).addBox(-6.0F, -15.0F, -8.0F, 12.0F, 14.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(52, 52).addBox(-6.0F, -15.0F, 7.0F, 12.0F, 14.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(26, 49).addBox(-8.0F, -15.0F, -6.0F, 1.0F, 14.0F, 12.0F, 0.0F, false);
		main.setTextureOffset(0, 43).addBox(7.0F, -15.0F, -6.0F, 1.0F, 14.0F, 12.0F, 0.0F, false);
		main.setTextureOffset(36, 36).addBox(-6.0F, -17.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		main.setTextureOffset(0, 30).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}