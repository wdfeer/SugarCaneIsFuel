package net.wdfeer.sugarCaneIsFuel;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;

public class Mod implements ModInitializer {
	@Override
	public void onInitialize() {
		FuelRegistry.INSTANCE.add(Items.SUGAR_CANE, 100);
	}
}
