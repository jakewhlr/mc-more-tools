package jakewhlr.moretools.items.toolmaterials

import net.minecraft.item.Items
import net.minecraft.recipe.Ingredient

object AcaciaToolMaterial extends CustomToolMaterial {
  val material: String = "acacia"
  def craftingIngredient: Ingredient = Ingredient.ofItems(Items.ACACIA_PLANKS)
  override def getDurability: Int = 59
  override def getMiningSpeedMultiplier: Float = 1
  override def getAttackDamage: Float = 1
  override def getMiningLevel: Int = 1
  override def getEnchantability: Int = 15
  override def getRepairIngredient: Ingredient = craftingIngredient
}
