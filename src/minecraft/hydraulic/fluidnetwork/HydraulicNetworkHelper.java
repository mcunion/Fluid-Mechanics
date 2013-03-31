package hydraulic.fluidnetwork;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import universalelectricity.core.block.IConnector;
import universalelectricity.core.block.INetworkProvider;
import universalelectricity.core.vector.Vector3;
import universalelectricity.core.vector.VectorHelper;

public class HydraulicNetworkHelper
{

	/**
	 * Invalidates a TileEntity from the electrical network, thereby removing it from all
	 * electricity network that are adjacent to it.
	 */
	public static void invalidate(TileEntity tileEntity)
	{
		for (int i = 0; i < 6; i++)
		{
			ForgeDirection direction = ForgeDirection.getOrientation(i);
			TileEntity checkTile = VectorHelper.getConnectorFromSide(tileEntity.worldObj, new Vector3(tileEntity), direction);

			if (checkTile instanceof IFluidNetworkPart)
			{
				HydraulicNetwork network = ((IFluidNetworkPart) checkTile).getNetwork();

				if (network != null)
				{
					network.removeLoad(tileEntity);
					network.removeSource(tileEntity);
				}
			}
		}
	}
}