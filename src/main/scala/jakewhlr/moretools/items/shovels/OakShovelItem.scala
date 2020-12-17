package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.OakToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object OakShovelItem {
  def apply: CustomShovelItem = new CustomShovelItem(OakToolMaterial, OakToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "oak_shovel")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}