package jakewhlr.moretools.items.swords

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CustomToolMaterial
import net.minecraft.item.Item.Settings
import net.minecraft.item.{Item, ItemGroup, SwordItem, ToolMaterial}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CustomSwordItem(material: CustomToolMaterial, attackDamage: Int = 4, attackSpeed: Float = 1.6F, settings: Settings = new Item.Settings().group(ItemGroup.COMBAT)) extends SwordItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings){
  val path = f"${material.material}%s_sword"
  def register(): Unit = Registry.register(Registry.ITEM, new Identifier(modId, path), this)
}
