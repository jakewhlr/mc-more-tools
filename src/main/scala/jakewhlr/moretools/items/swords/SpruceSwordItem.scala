package jakewhlr.moretools.items.swords

import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object SpruceSwordItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "spruce_sword")
  }

  def instance: CustomSwordItem = {
    new CustomSwordItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.COMBAT))
  }
}