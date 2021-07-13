
package net.mcreator.dystopiacraft.block;

import net.minecraft.block.material.Material;

@DystopiacraftModElements.ModElement.Tag
public class DecayingFenceGateBlock extends DystopiacraftModElements.ModElement {

	@ObjectHolder("dystopiacraft:decaying_fence_gate")
	public static final Block block = null;

	public DecayingFenceGateBlock(DystopiacraftModElements instance) {
		super(instance, 15);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FenceGateBlock {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 1.5f).setLightLevel(s -> 0));

			setRegistryName("decaying_fence_gate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 3;
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
