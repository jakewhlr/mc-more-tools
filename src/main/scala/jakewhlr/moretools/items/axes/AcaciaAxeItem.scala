package jakewhlr.moretools.items.axes

import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object AcaciaAxeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "acacia_axe")
  }

  def instance: CustomAxeItem = {
    new CustomAxeItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}