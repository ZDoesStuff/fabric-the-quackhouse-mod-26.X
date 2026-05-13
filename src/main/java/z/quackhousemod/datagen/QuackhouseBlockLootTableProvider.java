package z.quackhousemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import z.quackhousemod.block.QuackhouseBlocks;
import z.quackhousemod.item.QuackhouseItems;

import java.util.concurrent.CompletableFuture;

public class QuackhouseBlockLootTableProvider extends FabricBlockLootSubProvider {
    public QuackhouseBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK);
        dropSelf(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS);

        add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE, createMultipleOreDrops(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE, QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL, 1, 4));
        add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE, createMultipleOreDrops(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE, QuackhouseItems.MAGNESIUM_SULFATE_CRYSTAL, 2, 6));

        add(QuackhouseBlocks.SUSPICIOUS_STONE, createSilkTouchOnlyTable(QuackhouseItems.STONE_DUCKY));
    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                        block, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }
}
