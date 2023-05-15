
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reoredfabric.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.grawmpy.reoredfabric.block.SilverOreBlock;
import net.grawmpy.reoredfabric.ReoredfabricMod;

public class ReoredfabricModBlocks {
	public static Block SILVER_ORE;

	public static void load() {
		SILVER_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(ReoredfabricMod.MODID, "silver_ore"), new SilverOreBlock());
	}

	public static void clientLoad() {
		SilverOreBlock.clientInit();
	}
}
