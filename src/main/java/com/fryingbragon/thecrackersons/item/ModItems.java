package com.fryingbragon.thecrackersons.item;

import com.fryingbragon.thecrackersons.TheCrackersons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public float FiveSniffChallenge;

    public static final FoodComponent WHITE_POWDER = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 1f).build();

    public static final Item WHITE_POWDER_ITEM = registerItem("white_powder", new Item(new Item.Settings().food(WHITE_POWDER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheCrackersons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheCrackersons.LOGGER.info("HARDD REGISTERING DHE ITEMZ FOR!!!! " + TheCrackersons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(WHITE_POWDER_ITEM);
        });
    }
}
