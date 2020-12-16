package jakewhlr.moretools.items.shovels

import net.minecraft.item.Item.Settings
import net.minecraft.item.{ShovelItem, ToolMaterial}

class CustomShovelItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)
  extends ShovelItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)
