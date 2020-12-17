package jakewhlr.moretools.items.swords

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.WarpedToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object WarpedSwordItem {
  def apply: CustomSwordItem = new CustomSwordItem(WarpedToolMaterial, WarpedToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.COMBAT))
  def identifier(id: String): Identifier = new Identifier(id, "warped_sword")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}