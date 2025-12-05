package com.fryingbragon.thecrackersons.structure;

import com.fryingbragon.thecrackersons.TheCrackersons;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.StructureType;

import java.util.logging.Logger;

public class ModStructures {
    public static final Identifier PENIS = Identifier.of("thecrackersons", "penis");

    public static void registerStructures() {
        TheCrackersons.LOGGER.info("Registering my penis uwu :3" + TheCrackersons.MOD_ID);

        Registry.register(Registries.STRUCTURE_TYPE, PENIS, StructureType.JIGSAW);
    }
}
