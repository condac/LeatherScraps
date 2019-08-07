package net.mcreator.leatherscraps;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

public class MCreatorHardScissors extends leatherscraps.ModElement {

	@GameRegistry.ObjectHolder("leatherscraps:hardscissors")
	public static final Item block = null;

	public MCreatorHardScissors(leatherscraps instance) {
		super(instance);
		instance.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("leatherscraps:hardscissors", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(50);
			maxStackSize = 1;
			setUnlocalizedName("hardscissors");
			setRegistryName("hardscissors");
			setCreativeTab(CreativeTabs.TOOLS);
			setContainerItem(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 50;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 2F;
		}

		@Override
		public boolean hasContainerItem(ItemStack itemStack) {
		       return true;
		}
		
		@Override
		public ItemStack getContainerItem(ItemStack itemStack) {
		   // copy our item.
		   ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);
		
		   // is it enchanted
		   // if so, copy the enchantment
		   if (itemStack.isItemEnchanted()) {
		        //NBTTagCompound nbtcompound = itemStack.getTagCompound();
		        //returnItem.setTagCompound(nbtcompound);
		   }        
		
		   return returnItem;
		}
	}
}
