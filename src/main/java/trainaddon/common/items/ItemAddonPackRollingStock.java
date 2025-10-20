package trainaddon.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import trainaddon.common.FoxTCAddonPack;


public class ItemAddonPackRollingStock  extends ItemAbstractRollingStock
{
    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType)
    {
        super(iconName);
        setCreativeTab(FoxTCAddonPack.addonTabOne);
    }

    @Override
    public String GetTexturePath()
    {
        return trainaddon.common.library.Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
