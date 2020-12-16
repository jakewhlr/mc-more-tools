package jakewhlr.moretools

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.util.registry.Registry

import jakewhlr.moretools.items.axes
import jakewhlr.moretools.items.hoes
import jakewhlr.moretools.items.pickaxes
import jakewhlr.moretools.items.shovels
import jakewhlr.moretools.items.swords


object MoreTools extends ModInitializer {
	val modId: String = "more_tools"
	val version: String = FabricLoader.getInstance.getModContainer(modId).get.getMetadata.getVersion.toString

	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, axes.SpruceAxeItem.identifier(modId), axes.SpruceAxeItem.instance)
		Registry.register(Registry.ITEM, hoes.SpruceHoeItem.identifier(modId), hoes.SpruceHoeItem.instance)
		Registry.register(Registry.ITEM, pickaxes.SprucePickaxeItem.identifier(modId), pickaxes.SprucePickaxeItem.instance)
		Registry.register(Registry.ITEM, shovels.SpruceShovelItem.identifier(modId), shovels.SpruceShovelItem.instance)
		Registry.register(Registry.ITEM, swords.SpruceSwordItem.identifier(modId), swords.SpruceSwordItem.instance)

		Registry.register(Registry.ITEM, axes.AcaciaAxeItem.identifier(modId), axes.AcaciaAxeItem.instance)
		Registry.register(Registry.ITEM, hoes.AcaciaHoeItem.identifier(modId), hoes.AcaciaHoeItem.instance)
		Registry.register(Registry.ITEM, pickaxes.AcaciaPickaxeItem.identifier(modId), pickaxes.AcaciaPickaxeItem.instance)
		Registry.register(Registry.ITEM, shovels.AcaciaShovelItem.identifier(modId), shovels.AcaciaShovelItem.instance)
		Registry.register(Registry.ITEM, swords.AcaciaSwordItem.identifier(modId), swords.AcaciaSwordItem.instance)
	}
}
