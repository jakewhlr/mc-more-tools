package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object SprucePickaxeItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "spruce_pickaxe")
  }

  def instance: CustomPickaxeItem = {
    new CustomPickaxeItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}