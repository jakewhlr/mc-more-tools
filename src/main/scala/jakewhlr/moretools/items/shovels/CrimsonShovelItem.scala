package jakewhlr.moretools.items.shovels

import jakewhlr.moretools.MoreTools.modId
import jakewhlr.moretools.items.toolmaterials.CrimsonToolMaterial
import net.minecraft.item.{Item, ItemGroup}
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object CrimsonShovelItem {
  def apply: CustomShovelItem = new CustomShovelItem(CrimsonToolMaterial, CrimsonToolMaterial.getAttackDamage.asInstanceOf[Int], 1.0F, new Item.Settings().group(ItemGroup.TOOLS))
  def identifier(id: String): Identifier = new Identifier(id, "crimson_shovel")
  def register(): Unit = Registry.register(Registry.ITEM, identifier(modId), apply)
}