package novamachina.exnihilothermal.common.datagen;

import cofh.thermal.core.ThermalCore;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
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
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ExNihiloThermal.basalz.getRegistryObject().get())
                .patternLine("xvx")
                .patternLine("zyz")
                .patternLine("xwx")
                .key('x', ExNihiloThermalTags.DUST_OBSIDIAN)
                .key('v', Tags.Items.DUSTS_REDSTONE)
                .key('z', Tags.Items.DUSTS_GLOWSTONE)
                .key('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .key('w', Tags.Items.CROPS_NETHER_WART)
                .setGroup(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .addCriterion("has_doll", InventoryChangeTrigger.Instance.forItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .build(consumer, createSaveLocation(ExNihiloThermal.basalz.getRegistryObject().getId()));
        ShapedRecipeBuilder.shapedRecipe(ExNihiloThermal.blizz.getRegistryObject().get())
                .patternLine("xvx")
                .patternLine("zyz")
                .patternLine("xwx")
                .key('x', Items.SNOWBALL)
                .key('v', Tags.Items.DUSTS_REDSTONE)
                .key('z', Tags.Items.DUSTS_GLOWSTONE)
                .key('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .key('w', Tags.Items.CROPS_NETHER_WART)
                .setGroup(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .addCriterion("has_doll", InventoryChangeTrigger.Instance.forItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .build(consumer, createSaveLocation(ExNihiloThermal.blizz.getRegistryObject().getId()));
        ShapedRecipeBuilder.shapedRecipe(ExNihiloThermal.blitz.getRegistryObject().get())
                .patternLine("xvx")
                .patternLine("zyz")
                .patternLine("xwx")
                .key('x', ThermalCore.ITEMS.get("niter_dust"))
                .key('v', Tags.Items.DUSTS_REDSTONE)
                .key('z', Tags.Items.DUSTS_GLOWSTONE)
                .key('y', EnumResource.CRAFTING_DOLL.getRegistryObject().get())
                .key('w', Tags.Items.CROPS_NETHER_WART)
                .setGroup(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA)
                .addCriterion("has_doll", InventoryChangeTrigger.Instance.forItems(EnumResource.CRAFTING_DOLL.getRegistryObject().get()))
                .build(consumer, createSaveLocation(ExNihiloThermal.blitz.getRegistryObject().getId()));

        HammerRecipeBuilder.builder()
                .input(Ingredient.fromTag(Tags.Items.OBSIDIAN))
                .addDrop(ExNihiloThermal.dust_obsidian.getRegistryObject().get(), 4)
                .build(consumer, hammerLoc("dust_obsidian"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.fromTag(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("niter"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("niter"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.fromTag(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("sulfur"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("sulfur"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.fromTag(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("apatite"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("apatite"));

        SieveRecipeBuilder.builder()
                .input(Ingredient.fromTag(Tags.Items.GRAVEL))
                .addResult(ThermalCore.ITEMS.get("cinnabar"))
                .addRoll(new MeshWithChance(EnumMesh.FLINT, 0.05F))
                .addRoll(new MeshWithChance(EnumMesh.IRON, 0.1F))
                .addRoll(new MeshWithChance(EnumMesh.DIAMOND, 0.15F))
                .build(consumer, sieveLoc("cinnabar"));
    }
}
