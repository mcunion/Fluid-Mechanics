package liquidmechanics.common.block;

import java.util.List;

import liquidmechanics.api.liquids.LiquidHandler;
import liquidmechanics.client.render.BlockRenderHelper;
import liquidmechanics.common.TabLiquidMechanics;
import liquidmechanics.common.tileentity.TileEntityTank;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidStack;
import universalelectricity.prefab.BlockMachine;

public class BlockTank extends BlockMachine
{

    public BlockTank(int id)
    {
        super("lmTank", id, Material.rock, TabLiquidMechanics.INSTANCE);
        this.setHardness(1f);
        this.setResistance(5f);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return BlockRenderHelper.renderID;
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int side, float hitX, float hitY, float hitZ)
    {
        if (entityplayer.isSneaking()) { return false; }
        ItemStack current = entityplayer.inventory.getCurrentItem();
        if (current != null)
        {

            LiquidStack liquid = LiquidContainerRegistry.getLiquidForFilledItem(current);

            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

            if (tileEntity instanceof TileEntityTank)
            {
                TileEntityTank tank = (TileEntityTank) tileEntity;

                // Handle filled containers
                if (liquid != null)
                {
                    if (current.isItemEqual(new ItemStack(Item.potion)))
                    {
                        liquid = new LiquidStack(liquid.itemID, (LiquidContainerRegistry.BUCKET_VOLUME / 4), liquid.itemMeta);
                    }
                    int filled = tank.fill(ForgeDirection.UNKNOWN, liquid, true);

                    if (filled != 0 && !entityplayer.capabilities.isCreativeMode)
                    {
                        entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, LiquidHandler.consumeItem(current));
                    }

                    return true;

                    // Handle empty containers
                }
                else
                {

                    LiquidStack stack = tank.getStack();
                    if (stack != null)
                    {
                        ItemStack liquidItem = LiquidContainerRegistry.fillLiquidContainer(stack, current);

                        liquid = LiquidContainerRegistry.getLiquidForFilledItem(liquidItem);

                        if (liquid != null)
                        {
                            if (!entityplayer.capabilities.isCreativeMode)
                            {
                                if (current.stackSize > 1)
                                {
                                    if (!entityplayer.inventory.addItemStackToInventory(liquidItem)) return false;
                                    else
                                    {
                                        entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, LiquidHandler.consumeItem(current));
                                    }
                                }
                                else
                                {
                                    entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, LiquidHandler.consumeItem(current));
                                    entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, liquidItem);
                                }
                            }
                            int ammount = liquid.amount;
                            if (current.isItemEqual(new ItemStack(Item.glassBottle)))
                            {
                                ammount = (LiquidContainerRegistry.BUCKET_VOLUME / 4);
                            }
                            tank.drain(null, ammount, true);
                            return true;
                        }
                    }
                }
            }
        }

        return false;

    }

    @Override
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityTank();
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);

        return new ItemStack(this, 1, meta);

    }

    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 13));
        par3List.add(new ItemStack(par1, 1, 15));
    }
}