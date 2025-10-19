package train.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.core.creativetab.CreativeTabTraincraftSteam;
import train.common.creativetabs.CreativeTabAddonPack;
import train.common.library.AddonPackItems;
import train.common.library.Info;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "after:Fox-Traincraft")
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
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Info.modName);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
