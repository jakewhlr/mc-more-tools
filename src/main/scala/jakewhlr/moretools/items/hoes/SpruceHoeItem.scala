package jakewhlr.moretools.items.hoes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object SpruceHoeItem {
  def apply: CustomHoeItem = new CustomHoeItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "spruce_hoe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}