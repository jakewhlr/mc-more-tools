package jakewhlr.moretools.items.axes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CustomToolMaterial
import net.minecraft.item.Item.Settings
import net.minecraft.item.{AxeItem, Item, ItemGroup, ToolMaterial}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CustomAxeItem(material: CustomToolMaterial, attackDamage: Int = 7, attackSpeed: Float = 0.8F, settings: Settings = new Item.Settings().group(ItemGroup.COMBAT)) extends AxeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings){
  val path = f"${material.material}%s_axe"
  def register(): Unit = Registry.register(Registry.ITEM, new Identifier(modId, path), this)
}
