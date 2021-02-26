package novamachina.exnihilothermal.common.init;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import novamachina.exnihilosequentia.common.item.ore.EnumOre;
import novamachina.exnihilosequentia.common.utility.Config;
import novamachina.exnihilosequentia.common.utility.ExNihiloLogger;
import novamachina.exnihilothermal.common.utility.ExNihiloThermalConstants;
import org.apache.logging.log4j.LogManager;

@Mod.EventBusSubscriber(
    modid = ExNihiloThermalConstants.ModIds.EX_NIHILO_THERMAL,
    bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class ExNihiloThermalInitialization {
    private static final ExNihiloLogger logger = new ExNihiloLogger(LogManager.getLogger());

    private ExNihiloThermalInitialization() {
    }

    @SubscribeEvent
    public static void onCommonStart(FMLCommonSetupEvent event) {
//        ExNihiloThermal.osmium.setIngotItem(MekanismItems.PROCESSED_RESOURCES.get(ResourceType.INGOT, PrimaryResource.OSMIUM).getItem());
    }

    @SubscribeEvent
    public static void onServerStart(FMLServerStartingEvent event) {
        logger.debug("Fired FMLServerStartingEvent");
        enableOres();
        overrideOres();
    }

    private static void overrideOres() {
        if(Config.enableOreOverride()) {
//            ExNihiloThermal.osmium.setEnabled(ExNihiloThermalConfig.enableOsmium());
        }
    }

    private static void enableOres() {
        EnumOre.COPPER.setEnabled(true);
        EnumOre.SILVER.setEnabled(true);
        EnumOre.TIN.setEnabled(true);
        EnumOre.LEAD.setEnabled(true);
        EnumOre.NICKEL.setEnabled(true);
    }
}
