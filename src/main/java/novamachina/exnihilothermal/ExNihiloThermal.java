package novamachina.exnihilothermal;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import novamachina.exnihilosequentia.common.item.dolls.EnumDoll;
import novamachina.exnihilosequentia.common.item.resources.EnumResource;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilothermal.common.utility.ExNihiloThermalConstants;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import org.apache.logging.log4j.LogManager;

@Mod(ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL)
public class ExNihiloThermal {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    public static EnumDoll basalz;
    public static EnumDoll blitz;
    public static EnumDoll blizz;
    public static EnumResource dust_obsidian;

    public ExNihiloThermal() {
        logger.debug("Starting Ex Nihilo: Sequentia - Thermal Addon");
        createEnums();
    }

    private void createEnums() {
        basalz = EnumDoll.create(createEnumName("basalz"), ExNihiloThermalConstants.ModIds.THERMAL, "basalz", ExNihiloConstants.ModIds.MINECRAFT, "lava", 1.0D, "tooltip.doll.basalz");
        blitz = EnumDoll.create(createEnumName("blitz"), ExNihiloThermalConstants.ModIds.THERMAL, "blitz", ExNihiloConstants.ModIds.MINECRAFT, "lava", 1.0D, "tooltip.doll.blitz");
        blizz = EnumDoll.create(createEnumName("blizz"), ExNihiloThermalConstants.ModIds.THERMAL, "blizz", ExNihiloConstants.ModIds.MINECRAFT, "water", 1.0D, "tooltip.doll.blizz");
        dust_obsidian = EnumResource.create("dust_obsidian", "dust_obsidian");
    }

    private String createEnumName(String enumName) {
        return new ResourceLocation(ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL, enumName).toString();
    }
}
