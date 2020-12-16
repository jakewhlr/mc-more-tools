package jakewhlr.moretools.items.pickaxes

import net.minecraft.item.Item.Settings
import net.minecraft.item.{PickaxeItem, ToolMaterial}

class CustomPickaxeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)
  extends PickaxeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)
