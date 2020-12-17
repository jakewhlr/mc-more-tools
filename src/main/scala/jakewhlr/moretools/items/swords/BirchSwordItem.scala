package jakewhlr.moretools.items.swords

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.BirchToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object BirchSwordItem {
  def apply: CustomSwordItem = new CustomSwordItem(BirchToolMaterial, BirchToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.COMBAT))
  def identifier(id: String): Identifier = new Identifier(id, "birch_sword")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}