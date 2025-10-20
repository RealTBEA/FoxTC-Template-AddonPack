package trainaddon.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import train.common.items.ItemRollingStock;

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
            item.item = new ItemRollingStock(item.iconName, item.TypeOfRollingStock);
        }
    }

    private void registerItems() {
        for (AddonRollingStockItems item : AddonRollingStockItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.name());
                GameRegistry.registerItem(item.item, item.name());
            }
        }
    }
}
