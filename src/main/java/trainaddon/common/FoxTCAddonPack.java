package trainaddon.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import trainaddon.common.core.handler.AddonPackRollingStockEntityHandler;
import trainaddon.common.core.handler.AddonPackRollingStockModelHandler;
import trainaddon.common.creativetabs.CreativeTabAddonPack;
import trainaddon.common.library.AddonPackItems;
import trainaddon.common.library.Info;
import trainaddon.common.recipes.AddonTableRecipeRegister;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class FoxTCAddonPack
{
    /* TrainCraft instance */
    @Instance(Info.modID)
    public static FoxTCAddonPack instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabs addonTabOne;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        addonTabOne = new CreativeTabAddonPack(CreativeTabs.getNextID(), "addonTabOne", Items.apple);

        AddonPackItems addonPackItems = new AddonPackItems();
        AddonPackRollingStockEntityHandler entityHandler = new AddonPackRollingStockEntityHandler();
        if (FMLCommonHandler.instance().getEffectiveSide().isClient())
        {
            new AddonPackRollingStockModelHandler();
        }
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Info.modName);

        addonLog.info("Initializing recipes...");
        new AddonTableRecipeRegister();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
