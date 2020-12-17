package jakewhlr.moretools.items.hoes

import net.minecraft.item.Item.Settings
import net.minecraft.item.{HoeItem, ToolMaterial}

class CustomHoeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)
  extends HoeItem(material: ToolMaterial, attackDamage: Int, attackSpeed: Float, settings: Settings)