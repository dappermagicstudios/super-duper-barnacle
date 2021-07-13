
package net.mcreator.dystopiacraft.block;

import net.minecraft.block.material.Material;

@DystopiacraftModElements.ModElement.Tag
public class DecayingLeavesBlock extends DystopiacraftModElements.ModElement {

	@ObjectHolder("dystopiacraft:decaying_leaves")
	public static final Block block = null;

	public DecayingLeavesBlock(DystopiacraftModElements instance) {
		super(instance, 11);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.1f, 0.1f).setLightLevel(s -> 0)
							.notSolid());

			setRegistryName("decaying_leaves");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
