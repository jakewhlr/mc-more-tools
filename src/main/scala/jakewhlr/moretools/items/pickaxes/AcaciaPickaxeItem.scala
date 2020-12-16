package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object AcaciaPickaxeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "acacia_pickaxe")
  }

  def instance: CustomPickaxeItem = {
    new CustomPickaxeItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}