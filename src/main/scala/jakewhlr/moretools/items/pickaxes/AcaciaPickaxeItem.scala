package jakewhlr.moretools.items.pickaxes

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.AcaciaToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object AcaciaPickaxeItem {
  def apply: CustomPickaxeItem = new CustomPickaxeItem(AcaciaToolMaterial, AcaciaToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "acacia_pickaxe")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)

}