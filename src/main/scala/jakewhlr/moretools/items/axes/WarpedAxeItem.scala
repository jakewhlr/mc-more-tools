package jakewhlr.moretools.items.axes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.WarpedToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object WarpedAxeItem {
  def apply: CustomAxeItem = new CustomAxeItem(WarpedToolMaterial, WarpedToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "warped_axe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}