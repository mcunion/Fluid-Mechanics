package liquidmechanics.api.helpers;

import liquidmechanics.common.handlers.LiquidData;
import liquidmechanics.common.handlers.LiquidHandler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.ITankContainer;
import net.minecraftforge.liquids.LiquidStack;
import universalelectricity.core.vector.Vector3;

public class TankHelper
{
	/**
	 * Used to find all tileEntities sounding the location you will have to filter for selective
	 * tileEntities
	 * 
	 * @param world - the world being searched threw
	 * @param x
	 * @param y
	 * @param z
	 * @return an array of up to 6 tileEntities
	 */
	public static TileEntity[] getSurroundings(World world, int x, int y, int z)
	{
		TileEntity[] list = new TileEntity[] { null, null, null, null, null, null };
		for (int i = 0; i < 6; i++)
		{
			ForgeDirection d = ForgeDirection.getOrientation(i);
			TileEntity aEntity = world.getBlockTileEntity(x + d.offsetX, y + d.offsetY, z + d.offsetZ);
			if (aEntity instanceof TileEntity)
			{
				list[i] = aEntity;
			}
		}
		return list;
	}
	/**
	 * 
	 * @param world - world
	 * @param center - location of center of trade
	 * @param tank - liquid tank to be drained/filled
	 * @return ammount removed from tank
	 */
	public static int shareLiquid(World world, Vector3 center, LiquidStack resource)
	{

		if (resource == null)
			return 0;
		LiquidStack liquid = resource.copy();
		TileEntity[] connected = TankHelper.getSurroundings(world, center.intX(), center.intY(), center.intZ());
		LiquidData type = LiquidHandler.get(liquid);
		ForgeDirection firstTrade = ForgeDirection.UP;
		if (!LiquidData.getCanFloat(type))
			firstTrade = ForgeDirection.DOWN;
		for (int i = 0; i < 6; i++)
		{
			ForgeDirection dir = ForgeDirection.getOrientation(i);

			if (connected[i] instanceof ITankContainer)
			{
				ITankContainer cont = ((ITankContainer) connected[i]);
				ILiquidTank[] tanks = cont.getTanks(dir);
				boolean validTank = false;
				for (int t = 0; t < tanks.length; t++)
				{
					if (tanks[t].getLiquid() != null && LiquidHandler.isEqual(tanks[t].getLiquid(), liquid))
					{
						validTank = true;
						break;
					}
				}
				if (!validTank)
					connected[i] = null;
			}
			else
			{
				connected[i] = null;
			}

		}
		int filled = 0;
		if (connected[firstTrade.ordinal()] instanceof ITankContainer && liquid != null && liquid.amount <= 0)
		{
			int f = ((ITankContainer) connected[firstTrade.ordinal()]).fill(firstTrade, liquid, true);
			liquid.amount -= f;
			filled += f;
		}
		if (connected[firstTrade.getOpposite().ordinal()] instanceof ITankContainer && liquid != null && liquid.amount <= 0)
		{
			int f = ((ITankContainer) connected[firstTrade.getOpposite().ordinal()]).fill(firstTrade, liquid, true);
			liquid.amount -= f;
			filled += f;
		}
		for (int i = 2; i < 6; i++)
		{
			ForgeDirection dir = ForgeDirection.getOrientation(i);
			if (liquid == null || liquid.amount <= 0)
				break;
			if (connected[i] instanceof ITankContainer)
			{
				int f = ((ITankContainer) connected[i]).fill(dir, liquid, true);
				liquid.amount -= f;
				filled += f;
			}

		}
		return filled;

	}

	/**
	 * 
	 * @param entity - entity in question
	 * @return 1-4 if corner 0 if not a corner you have to figure out which is which depending on
	 * what your using this for 1 should be north east 2 south east
	 */
	public static int corner(TileEntity entity)
	{
		TileEntity[] en = getSurroundings(entity.worldObj, entity.xCoord, entity.yCoord, entity.zCoord);
		if (en[4] != null && en[2] != null && en[5] == null && en[3] == null) { return 3; }
		if (en[2] != null && en[5] != null && en[3] == null && en[4] == null) { return 4; }
		if (en[5] != null && en[3] != null && en[4] == null && en[2] == null) { return 1; }
		if (en[3] != null && en[4] != null && en[2] == null && en[5] == null) { return 2; }

		return 0;

	}
}