package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object AcaciaShovelItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "acacia_shovel")
  }

  def instance: CustomShovelItem = {
    new CustomShovelItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}