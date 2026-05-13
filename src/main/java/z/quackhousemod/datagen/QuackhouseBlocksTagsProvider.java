package z.quackhousemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import z.quackhousemod.block.QuackhouseBlocks;

import java.util.concurrent.CompletableFuture;

public class QuackhouseBlocksTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public QuackhouseBlocksTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE)
                .add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_BLOCK)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_BRICKS)
                .add(QuackhouseBlocks.SUSPICIOUS_STONE);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(QuackhouseBlocks.MAGNESIUM_SULFATE_ORE)
                .add(QuackhouseBlocks.DEEPSLATE_MAGNESIUM_SULFATE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(QuackhouseBlocks.SUSPICIOUS_STONE);
    }
}
