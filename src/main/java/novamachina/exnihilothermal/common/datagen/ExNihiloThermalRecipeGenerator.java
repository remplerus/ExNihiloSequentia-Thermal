package novamachina.exnihilothermal.common.datagen;

import cofh.thermal.core.ThermalCore;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import novamachina.exnihilosequentia.api.crafting.hammer.HammerRecipeBuilder;
import novamachina.exnihilosequentia.api.crafting.sieve.MeshWithChance;
import novamachina.exnihilosequentia.api.crafting.sieve.SieveRecipeBuilder;
import novamachina.exnihilosequentia.api.datagen.AbstractRecipeGenerator;
import novamachina.exnihilosequentia.common.item.mesh.EnumMesh;
import novamachina.exnihilosequentia.common.item.resources.EnumResource;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilothermal.ExNihiloThermal;
import novamachina.exnihilothermal.api.ExNihiloThermalTags;
import novamachina.exnihilothermal.common.utility.ExNihiloThermalConstants;

import java.util.function.Consumer;

public class ExNihiloThermalRecipeGenerator extends AbstractRecipeGenerator {
    protected ExNihiloThermalRecipeGenerator(DataGenerator generator) {
        super(generator, ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ExNihiloThermal.basalz.getRegistryObject().get())
                .pattern("xvx")
                .pattern("zyz")
                .pattern("xwx")
                .define('x', ExNihiloThermalTags.DUST_OBSIDIAN)
                .define('v', Tags.Items.DUSTS_REDSTONE)
                .define('z', Tags.Items.DUSTS_GLOWSTONE)
                .define('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .define('w', Tags.Items.CROPS_NETHER_WART)
                .group(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .unlockedBy("has_doll", InventoryChangeTrigger.Instance.hasItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .save(consumer, createSaveLocation(ExNihiloThermal.basalz.getRegistryObject().getId()));
        ShapedRecipeBuilder.shaped(ExNihiloThermal.blizz.getRegistryObject().get())
                .pattern("xvx")
                .pattern("zyz")
                .pattern("xwx")
                .define('x', Items.SNOWBALL)
                .define('v', Tags.Items.DUSTS_REDSTONE)
                .define('z', Tags.Items.DUSTS_GLOWSTONE)
                .define('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .define('w', Tags.Items.CROPS_NETHER_WART)
                .group(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .unlockedBy("has_doll", InventoryChangeTrigger.Instance.hasItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .save(consumer, createSaveLocation(ExNihiloThermal.blizz.getRegistryObject().getId()));
        ShapedRecipeBuilder.shaped(ExNihiloThermal.blitz.getRegistryObject().get())
                .pattern("xvx")
                .pattern("zyz")
                .pattern("xwx")
                .define('x', ThermalCore.ITEMS.get("niter_dust"))
                .define('v', Tags.Items.DUSTS_REDSTONE)
                .define('z', Tags.Items.DUSTS_GLOWSTONE)
                .define('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .define('w', Tags.Items.CROPS_NETHER_WART)
                .group(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .unlockedBy("has_doll", InventoryChangeTrigger.Instance.hasItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .save(consumer, createSaveLocation(ExNihiloThermal.blitz.getRegistryObject().getId()));

        HammerRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.OBSIDIAN))
                .addDrop(ExNihiloThermal.dust_obsidian.getRegistryObject().get(), 4)
                .build(consumer, hammerLoc("dust_obsidian"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("niter"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("niter"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("sulfur"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("sulfur"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("apatite"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("apatite"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("cinnabar"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("cinnabar"));
    }
}
