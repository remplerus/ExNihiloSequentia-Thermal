package novamachina.exnihilothermal.common.datagen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilosequentia.api.datagen.AbstractItemTagGenerator;
import novamachina.exnihilothermal.ExNihiloThermal;
import novamachina.exnihilothermal.api.ExNihiloThermalTags;
import novamachina.exnihilothermal.common.utility.ExNihiloThermalConstants;

public class ExNihiloThermalTagGenerator extends AbstractItemTagGenerator {
    public ExNihiloThermalTagGenerator(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ExNihiloThermalTags.DUST_OBSIDIAN).addItemEntry(ExNihiloThermal.dust_obsidian.getRegistryObject().get());
    }
}
