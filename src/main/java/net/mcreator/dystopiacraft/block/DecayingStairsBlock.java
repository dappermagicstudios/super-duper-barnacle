
package net.mcreator.dystopiacraft.block;

import net.minecraft.block.material.Material;

@DystopiacraftModElements.ModElement.Tag
public class DecayingStairsBlock extends DystopiacraftModElements.ModElement {

	@ObjectHolder("dystopiacraft:decaying_stairs")
	public static final Block block = null;

	public DecayingStairsBlock(DystopiacraftModElements instance) {
		super(instance, 12);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5f, 1f)).getDefaultState(),

					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.5f, 1f).setLightLevel(s -> 0));

			setRegistryName("decaying_stairs");
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
