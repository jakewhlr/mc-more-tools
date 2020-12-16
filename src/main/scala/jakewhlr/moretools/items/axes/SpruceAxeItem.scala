package jakewhlr.moretools.items.axes

import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object SpruceAxeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "spruce_axe")
  }

  def instance: CustomAxeItem = {
    new CustomAxeItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}