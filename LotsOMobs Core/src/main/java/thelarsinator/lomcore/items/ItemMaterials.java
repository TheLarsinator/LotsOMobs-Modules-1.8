package thelarsinator.lomcore.items;

import net.minecraft.item.Item;
import thelarsinator.lomcore.core.LotsOMobs;

public class ItemMaterials extends Item
{
    public ItemMaterials()
    {
        super();
        this.maxStackSize = 64;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
        
    }
}