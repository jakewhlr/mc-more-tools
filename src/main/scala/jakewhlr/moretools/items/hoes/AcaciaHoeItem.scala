package jakewhlr.moretools.items.hoes

import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object AcaciaHoeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "acacia_hoe")
  }

  def instance: CustomHoeItem = {
    new CustomHoeItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}