package net.mcreator.iron_man;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsiron_man.ModElement.Tag
public class MCreatorArcReactor extends Elementsiron_man.ModElement {
	@ObjectHolder("iron_man:arcreactor")
	public static final Item block = null;

	public MCreatorArcReactor(Elementsiron_man instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorIronManTab.tab).maxStackSize(64));
			setRegistryName("arcreactor");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
