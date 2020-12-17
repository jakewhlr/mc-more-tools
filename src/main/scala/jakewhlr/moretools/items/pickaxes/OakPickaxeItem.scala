package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.OakToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object OakPickaxeItem {
  def apply: CustomPickaxeItem = new CustomPickaxeItem(OakToolMaterial, OakToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "oak_pickaxe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}