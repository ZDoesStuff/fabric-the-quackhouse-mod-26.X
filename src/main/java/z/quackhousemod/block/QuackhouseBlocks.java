package z.quackhousemod.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import z.quackhousemod.TheQuackhouseMod;

import java.util.function.Function;

public class QuackhouseBlocks {

    public static final Block MAGNESIUM_SULFATE_ORE = registerBlock("magnesium_sulfate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block DEEPSLATE_MAGNESIUM_SULFATE_ORE = registerBlock("deepslate_magnesium_sulfate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1, 3), properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final Block MAGNESIUM_SULFATE_BLOCK = registerBlock("magnesium_sulfate_block",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    public static final Block MAGNESIUM_SULFATE_BRICKS = registerBlock("magnesium_sulfate_bricks",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    public static final Block SUSPICIOUS_STONE = registerBlock("suspicious_stone",
            properties -> new Block(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // Registrationsssss

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TheQuackhouseMod.MOD_ID, name)))));
    }

    public static void registerQuackhouseBlocks() {
        TheQuackhouseMod.LOGGER.info("Putting together duck huts...");
    }
}
