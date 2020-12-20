package jakewhlr.moretools.items.hoes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CustomToolMaterial
import net.minecraft.item.Item.Settings
import net.minecraft.item.{HoeItem, Item, ItemGroup, ToolMaterial}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CustomHoeItem(material: CustomToolMaterial, attackDamage: Int = 1, attackSpeed: Float = 1.0F, settings: Settings = new Item.Settings().group(ItemGroup.COMBAT)) extends HoeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings){
  val path = f"${material.material}%s_hoe"
  def register(): Unit = Registry.register(Registry.ITEM, new Identifier(modId, path), this)
}