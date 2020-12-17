package jakewhlr.moretools.items.toolmaterials

import net.minecraft.item.{Items, ToolMaterial}
import net.minecraft.recipe.Ingredient

object JungleToolMaterial extends ToolMaterial{
  def craftingIngredient: Ingredient = Ingredient.ofItems(Items.JUNGLE_PLANKS)
  override def getDurability: Int = 59
  override def getMiningSpeedMultiplier: Float = 1
  override def getAttackDamage: Float = 1
  override def getMiningLevel: Int = 1
  override def getEnchantability: Int = 15
  override def getRepairIngredient: Ingredient = craftingIngredient
}
