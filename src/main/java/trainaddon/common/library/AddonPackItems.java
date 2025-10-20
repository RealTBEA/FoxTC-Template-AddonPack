package trainaddon.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import trainaddon.common.items.ItemAddonPackRollingStock;

public class AddonPackItems
{
    /**
     * Setup all items
     */
    public AddonPackItems()
    {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems()
    {
        for (AddonRollingStockItems item : AddonRollingStockItems.values())
        {
            item.item = new ItemAddonPackRollingStock(item.iconName, item.TypeOfRollingStock);
        }
    }

    private void registerItems() {
        for (AddonRollingStockItems item : AddonRollingStockItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }
}
