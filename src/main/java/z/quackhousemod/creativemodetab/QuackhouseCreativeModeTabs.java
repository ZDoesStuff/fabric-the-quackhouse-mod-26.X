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
import z.quackhousemod.item.QuackhouseItems;

public class QuackhouseCreativeModeTabs {

    public static final CreativeModeTab COLLECTIBLE_DUCKY_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, "collectathon_ducky_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(QuackhouseItems.YELLOW_DUCKY))
                    .title(Component.translatable("creativemodetab.quackhousemod.collectable_ducky"))
                    .displayItems((parameters, output) -> {
                        output.accept(QuackhouseItems.YELLOW_DUCKY);
                        output.accept(QuackhouseItems.BROWN_DUCKY);
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
                        output.accept(QuackhouseItems.ISOBEL_DUCKY);

                    }).build());

    public static void registerQuackhouseCreativeTabs() {
        TheQuackhouseMod.LOGGER.info("Putting together your shopping list...");
    }
}
