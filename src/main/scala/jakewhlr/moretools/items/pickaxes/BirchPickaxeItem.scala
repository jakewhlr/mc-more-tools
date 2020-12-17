package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.BirchToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object BirchPickaxeItem {
  def apply: CustomPickaxeItem = new CustomPickaxeItem(BirchToolMaterial, BirchToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "birch_pickaxe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}