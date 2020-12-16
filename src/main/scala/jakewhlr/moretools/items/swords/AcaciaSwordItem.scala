package jakewhlr.moretools.items.swords

import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object AcaciaSwordItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "acacia_sword")
  }

  def instance: CustomSwordItem = {
    new CustomSwordItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}