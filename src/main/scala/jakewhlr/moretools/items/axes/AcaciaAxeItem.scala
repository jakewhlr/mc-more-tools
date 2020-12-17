package jakewhlr.moretools.items.axes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object AcaciaAxeItem {
  def apply: CustomAxeItem = new CustomAxeItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "acacia_axe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}