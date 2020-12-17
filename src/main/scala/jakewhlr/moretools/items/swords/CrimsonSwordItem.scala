package jakewhlr.moretools.items.swords

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CrimsonToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object CrimsonSwordItem {
  def apply: CustomSwordItem = new CustomSwordItem(CrimsonToolMaterial, CrimsonToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.COMBAT))
  def identifier(id: String): Identifier = new Identifier(id, "crimson_sword")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}