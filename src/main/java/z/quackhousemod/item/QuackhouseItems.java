package z.quackhousemod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import z.quackhousemod.TheQuackhouseMod;

import java.util.function.Function;

public class QuackhouseItems {

    public static final Item YELLOW_DUCKY = registerItem("yellow_rubber_ducky", Item::new);
    public static final Item BROWN_DUCKY = registerItem("brown_rubber_ducky", Item::new);
    public static final Item BLUE_DUCKY = registerItem("blue_rubber_ducky", Item::new);
    public static final Item SUDSY_DUCKY = registerItem("bathed_rubber_ducky", Item::new);
    public static final Item BLUEBERRY_DUCKY = registerItem("blueberry_rubber_ducky", Item::new);
    public static final Item PRIDE_DUCKY = registerItem("gay_rubber_ducky", Item::new);
    public static final Item GRAPEJUICE_DUCKY = registerItem("grape_juice_rubber_ducky", Item::new);
    public static final Item ISOBEL_DUCKY = registerItem("isobel_rubber_ducky", Item::new);
    public static final Item MOLTEN_DUCKY = registerItem("molten_rubber_ducky", Item::new);
    public static final Item POLKADOT_DUCKY = registerItem("polkadot_rubber_ducky", Item::new);
    public static final Item STONE_DUCKY = registerItem("stone_rubber_ducky", Item::new);
    public static final Item STRAWBERRYSHORTCAKE_DUCKY = registerItem("strawberry_shortcake_rubber_ducky", Item::new);
    public static final Item TRANS_DUCKY = registerItem("trans_rubber_ducky", Item::new);
    public static final Item RED_DUCKY = registerItem("red_rubber_ducky", Item::new);
    public static final Item FANCY_DUCKY = registerItem("dapper_rubber_ducky", Item::new);
    public static final Item GOOGLY_DUCKY = registerItem("googly_rubber_ducky", Item::new);
    public static final Item MAGNESIUM_SULFATE_CRYSTAL = registerItem("magnesium_sulfate_crystal", Item::new);
    public static final Item EPSOM_SALT = registerItem("epsom_salt", Item::new);


    // This mess is what registers the items. Why have they made this so much more complex?
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name)))));
    }

    public static void registerQuackhouseItems() {
        TheQuackhouseMod.LOGGER.info("Registering all your rubber duckies, right from the quackhouse!");

    }
}
