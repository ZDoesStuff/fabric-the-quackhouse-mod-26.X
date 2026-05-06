package z.quackhousemod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import z.quackhousemod.item.QuackhouseItems;

public class QuackhouseModelProvider extends FabricModelProvider {

    public QuackhouseModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(QuackhouseItems.YELLOW_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.BROWN_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.BLUE_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.BLUEBERRY_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.ISOBEL_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.GRAPEJUICE_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.POLKADOT_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.PRIDE_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.STRAWBERRYSHORTCAKE_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.STONE_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.MOLTEN_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.TRANS_DUCKY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(QuackhouseItems.SUDSY_DUCKY, ModelTemplates.FLAT_ITEM);
    }
}
