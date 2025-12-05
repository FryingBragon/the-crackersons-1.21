package com.fryingbragon.thecrackersons.entity;

import com.fryingbragon.thecrackersons.TheCrackersons;
import com.fryingbragon.thecrackersons.entity.custom.JoeEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<JoeEntity> JOE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TheCrackersons.MOD_ID, "joe"),
            EntityType.Builder.create(JoeEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f).build());

    public static void registerModEntities() {
        TheCrackersons.LOGGER.info("Registering terrible things for ):" + TheCrackersons.MOD_ID);
    }
}
