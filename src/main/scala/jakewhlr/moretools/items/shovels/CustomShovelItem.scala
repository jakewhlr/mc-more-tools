package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CustomToolMaterial
import net.minecraft.item.Item.Settings
import net.minecraft.item.{Item, ItemGroup, ShovelItem, ToolMaterial}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CustomShovelItem(material: CustomToolMaterial, attackDamage: Int = 2, attackSpeed: Float = 1.0F, settings: Settings = new Item.Settings().group(ItemGroup.TOOLS)) extends ShovelItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings){
  val path = f"${material.material}%s_shovel"
  def register(): Unit = Registry.register(Registry.ITEM, new Identifier(modId, path), this)
}
