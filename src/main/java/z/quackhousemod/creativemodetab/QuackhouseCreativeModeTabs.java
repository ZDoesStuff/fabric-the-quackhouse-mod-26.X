package z.quackhousemod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import z.quackhousemod.TheQuackhouseMod;
import z.quackhousemod.block.QuackhouseBlocks;
import z.quackhousemod.item.QuackhouseItems;

public class QuackhouseCreativeModeTabs {

    public static final CreativeModeTab QUACKHOUSE_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, "quackhouse_items_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(QuackhouseItems.EPSOM_SALT))
                    .title(Component.translatable("creativemodetab.quackhousemod.quackhouse_items_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL);
                        output.accept(QuackhouseItems.EPSOM_SALT);

                    }).build());

    public static final CreativeModeTab QUACKHOUSE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, "quackhouse_blocks_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS))
                    .title(Component.translatable("creativemodetab.quackhousemod.quackhouse_blocks_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE);
                        output.accept(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE);
                        output.accept(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK);
                        output.accept(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS);

                    }).build());

    public static final CreativeModeTab COLLECTIBLE_DUCKY_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, "collectathon_ducky_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(QuackhouseItems.YELLOW_DUCKY))
                    .title(Component.translatable("creativemodetab.quackhousemod.collectable_ducky"))
                    .displayItems((parameters, output) -> {
                        output.accept(QuackhouseItems.YELLOW_DUCKY);
                        output.accept(QuackhouseItems.BROWN_DUCKY);
                        output.accept(QuackhouseItems.RED_DUCKY);
                        output.accept(QuackhouseItems.BLUE_DUCKY);
                        output.accept(QuackhouseItems.STONE_DUCKY);
                        output.accept(QuackhouseItems.POLKADOT_DUCKY);
                        output.accept(QuackhouseItems.PRIDE_DUCKY);
                        output.accept(QuackhouseItems.TRANS_DUCKY);
                        output.accept(QuackhouseItems.BLUEBERRY_DUCKY);
                        output.accept(QuackhouseItems.GRAPEJUICE_DUCKY);
                        output.accept(QuackhouseItems.STRAWBERRYSHORTCAKE_DUCKY);
                        output.accept(QuackhouseItems.MOLTEN_DUCKY);
                        output.accept(QuackhouseItems.SUDSY_DUCKY);
                        output.accept(QuackhouseItems.FANCY_DUCKY);
                        output.accept(QuackhouseItems.GOOGLY_DUCKY);
                        output.accept(QuackhouseItems.ISOBEL_DUCKY);

                    }).build());

    public static void registerQuackhouseCreativeTabs() {
        TheQuackhouseMod.LOGGER.info("Putting together your shopping list...");
    }
}
