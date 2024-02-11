package net.modinglord.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.modinglord.tutorialmod.TutorialMod;
import net.modinglord.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        // ITEMS
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModItems.RED_CAP.get());
                        output.accept(ModItems.BROWN_CAP.get());
                        output.accept(ModItems.METAL_DETECTOR.get());
                        output.accept(ModItems.STRAWBERRY.get());
                        output.accept(ModItems.URANIUM_CELL.get());
                        output.accept(ModItems.HERBALIST_TOOL.get());

                        // BLOCKS
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.SOUND_BLOCK.get());

                        // SPECIAL BLOCKS

                        output.accept(ModBlocks.SAPPHIRE_WALL.get());
                        output.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        output.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        output.accept(ModBlocks.SAPPHIRE_TRAP_DOOR.get());
                        output.accept(ModBlocks.SAPPHIRE_STAIR.get());
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
