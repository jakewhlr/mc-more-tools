package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.DarkOakToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object DarkOakShovelItem {
  def apply: CustomShovelItem = new CustomShovelItem(DarkOakToolMaterial, DarkOakToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "dark_oak_shovel")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}