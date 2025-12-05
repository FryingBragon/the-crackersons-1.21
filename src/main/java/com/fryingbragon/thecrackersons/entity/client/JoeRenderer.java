package com.fryingbragon.thecrackersons.entity.client;

import com.fryingbragon.thecrackersons.TheCrackersons;
import com.fryingbragon.thecrackersons.entity.custom.JoeEntity;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class JoeRenderer extends MobEntityRenderer<JoeEntity, JoeModel<JoeEntity>> {
    public JoeRenderer(EntityRendererFactory.Context context) {
        super(context, new JoeModel<>(context.getPart(JoeModel.JOE)), 0.75f);
    }

    @Override
    public Identifier getTexture(JoeEntity entity) {
        return Identifier.of(TheCrackersons.MOD_ID, "textures/entity/joe/joe.png");
    }

    public void renderer(JoeEntity livingEntity, float f, float g, MatrixStack matrixStack,
                         VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
