package com.fryingbragon.thecrackersons;

import com.fryingbragon.thecrackersons.entity.ModEntities;
import com.fryingbragon.thecrackersons.entity.client.JoeModel;
import com.fryingbragon.thecrackersons.entity.client.JoeRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class TheCrackersonsClient  implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(JoeModel.JOE, JoeModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.JOE, JoeRenderer::new);
    }
}
