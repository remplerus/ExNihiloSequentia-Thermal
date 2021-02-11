package novamachina.exnihilothermal;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import novamachina.exnihilothermal.common.utility.ExNihiloThermalConstants;
import novamachina.exnihilosequentia.common.item.ore.EnumOre;
import novamachina.exnihilosequentia.common.utility.Color;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

@Mod(ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL)
public class ExNihiloThermal {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

//    public static EnumOre osmium;

    public ExNihiloThermal() {
        logger.debug("Starting Ex Nihilo: Sequentia - Thermal Addon");
        createOres();
    }

    private void createOres() {
//        osmium = EnumOre.create(createOreName("osmium"), EnumOre.Type.MODDED, "osmium", new Color("BBDDFF"), true, false);
    }

    private String createOreName(String ore) {
        return new ResourceLocation(ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL, ore).toString();
    }
}
