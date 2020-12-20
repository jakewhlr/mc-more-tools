package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CustomToolMaterial
import net.minecraft.item.Item.Settings
import net.minecraft.item.{Item, ItemGroup, PickaxeItem, ToolMaterial}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CustomPickaxeItem(material: CustomToolMaterial, attackDamage: Int = 2, attackSpeed: Float = 1.2F, settings: Settings = new Item.Settings().group(ItemGroup.COMBAT)) extends PickaxeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings){
  val path = f"${material.material}%s_pickaxe"
  def register(): Unit = Registry.register(Registry.ITEM, new Identifier(modId, path), this)
}
