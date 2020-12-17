package jakewhlr.moretools.items.swords

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.DarkOakToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object DarkOakSwordItem {
  def apply: CustomSwordItem = new CustomSwordItem(DarkOakToolMaterial, DarkOakToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.COMBAT))
  def identifier(id: String): Identifier = new Identifier(id, "dark_oak_sword")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}