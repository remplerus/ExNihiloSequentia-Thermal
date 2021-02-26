package novamachina.exnihilothermal.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilosequentia.api.datagen.AbstractItemGenerator;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import novamachina.exnihilothermal.ExNihiloThermal;
import org.apache.logging.log4j.LogManager;

public class ExNihiloThermalItemGenerator extends AbstractItemGenerator {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    private static final String ITEMS_TAG = "items/";
    private static final String ITEM_HANDHELD_TAG = "item/handheld";
    private static final String LAYER_0_TAG = "layer0";

    protected ExNihiloThermalItemGenerator(DataGenerator generator, String modId, ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(ExNihiloThermal.basalz.getRegistryObject().get().getRegistryName().toString(),
                new ResourceLocation(ITEM_HANDHELD_TAG), LAYER_0_TAG,
                new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, ITEMS_TAG + ExNihiloThermal.basalz.getDollName()));

        singleTexture(ExNihiloThermal.blitz.getRegistryObject().get().getRegistryName().toString(),
                new ResourceLocation(ITEM_HANDHELD_TAG), LAYER_0_TAG,
                new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, ITEMS_TAG + ExNihiloThermal.blitz.getDollName()));

        singleTexture(ExNihiloThermal.blizz.getRegistryObject().get().getRegistryName().toString(),
                new ResourceLocation(ITEM_HANDHELD_TAG), LAYER_0_TAG,
                new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, ITEMS_TAG + ExNihiloThermal.blizz.getDollName()));

        singleTexture((ExNihiloThermal.dust_obsidian.getRegistryObject().get()).getRegistryName().getPath(),
                new ResourceLocation("item/handheld"), "layer0",
                new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "items/" + ExNihiloThermal.dust_obsidian.getResourceName()));
    }
}
