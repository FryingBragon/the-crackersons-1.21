
package com.fryingbragon.thecrackersons.entity.client;

import com.fryingbragon.thecrackersons.TheCrackersons;
import com.fryingbragon.thecrackersons.entity.custom.JoeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class JoeModel<T extends JoeEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer JOE = new EntityModelLayer(Identifier.of(TheCrackersons.MOD_ID, "joe"), "main");

    private final ModelPart root;

    public JoeModel(ModelPart root) {
        this.root = root;
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        modelPartData.addChild("bb_main", ModelPartBuilder.create()
                        .uv(24, 13).cuboid(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F)
                        .uv(0, 13).cuboid(-1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 10.0F)
                        .uv(0, 0).cuboid(-4.0F, -15.0F, -4.0F, 8.0F, 5.0F, 8.0F),
                ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // No animations
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
