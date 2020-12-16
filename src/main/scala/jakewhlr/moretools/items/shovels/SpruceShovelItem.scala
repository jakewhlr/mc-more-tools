package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.items.toolmaterials.SpruceToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier

object SpruceShovelItem {
  def identifier(id: String): Identifier = {
    new Identifier(id, "spruce_shovel")
  }

  def instance: CustomShovelItem = {
    new CustomShovelItem(SpruceToolMaterial, SpruceToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  }
}