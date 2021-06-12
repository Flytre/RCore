package net.flytre.resource_core;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.util.function.Supplier;
import java.util.logging.Logger;

public class ResourceCore implements ModInitializer {

    public static final Logger LOGGER = Logger.getLogger("Flytre Lib");


    public static final Supplier<Item> ITEM_MAKER = () -> new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static final Item BLUESTONE = ITEM_MAKER.get();
    public static final Block DECOR = new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK));

    @Override
    public void onInitialize() {

        RegistryUtils.registerBlocks(ResourceCore.class, "flytre_lib", ItemGroup.MISC);
        RegistryUtils.registerItems(ResourceCore.class, "flytre_lib");
        RegistryUtils.registerBoilerNamespace("flytre_lib");
    }

}
