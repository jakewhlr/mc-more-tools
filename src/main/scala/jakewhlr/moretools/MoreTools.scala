package jakewhlr.moretools

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.util.registry.Registry
import jakewhlr.moretools.items.axes._
import jakewhlr.moretools.items.hoes._
import jakewhlr.moretools.items.pickaxes._
import jakewhlr.moretools.items.shovels._
import jakewhlr.moretools.items.swords._


object MoreTools extends ModInitializer {
	val modId: String = "more_tools"
	val version: String = FabricLoader.getInstance.getModContainer(modId).get.getMetadata.getVersion.toString

	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// axes
		AcaciaAxeItem.register()
		BirchAxeItem.register()
		CrimsonAxeItem.register()
		DarkOakAxeItem.register()
		JungleAxeItem.register()
		OakAxeItem.register()
		SpruceAxeItem.register()
		WarpedAxeItem.register()

		// hoes
		AcaciaHoeItem.register()
		BirchHoeItem.register()
		CrimsonHoeItem.register()
		DarkOakHoeItem.register()
		JungleHoeItem.register()
		OakHoeItem.register()
		SpruceHoeItem.register()
		WarpedHoeItem.register()

		// pickaxes
		AcaciaPickaxeItem.register()
		BirchPickaxeItem.register()
		CrimsonPickaxeItem.register()
		DarkOakPickaxeItem.register()
		JunglePickaxeItem.register()
		OakPickaxeItem.register()
		SprucePickaxeItem.register()
		WarpedPickaxeItem.register()

		// shovels
		AcaciaShovelItem.register()
		BirchShovelItem.register()
		CrimsonShovelItem.register()
		DarkOakShovelItem.register()
		JungleShovelItem.register()
		OakShovelItem.register()
		SpruceShovelItem.register()
		WarpedShovelItem.register()

		// swords
		AcaciaSwordItem.register()
		BirchSwordItem.register()
		CrimsonSwordItem.register()
		DarkOakSwordItem.register()
		JungleSwordItem.register()
		OakSwordItem.register()
		SpruceSwordItem.register()
		WarpedSwordItem.register()
	}
}
