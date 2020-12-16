package jakewhlr.moretools.items.hoes

import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object SpruceHoeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "spruce_hoe")
  }

  def instance: CustomHoeItem = {
    new CustomHoeItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}