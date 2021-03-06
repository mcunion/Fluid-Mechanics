package dark.core.network.fluid;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.IFluidHandler;
import universalelectricity.core.vector.Vector3;
import universalelectricity.core.vector.VectorHelper;
import dark.api.INetworkPart;
import dark.api.fluid.IDrain;
import dark.core.tile.network.NetworkTileEntities;

public class HydraulicNetworkHelper
{

    /** Invalidates a TileEntity */
    public static void invalidate(TileEntity tileEntity)
    {
        for (int i = 0; i < 6; i++)
        {
            ForgeDirection direction = ForgeDirection.getOrientation(i);
            TileEntity checkTile = VectorHelper.getConnectorFromSide(tileEntity.worldObj, new Vector3(tileEntity), direction);

            if (checkTile instanceof INetworkPart)
            {
                NetworkTileEntities network = ((INetworkPart) checkTile).getTileNetwork();

                if (network != null && network instanceof NetworkFluidTiles)
                {
                    network.removeTile(tileEntity);

                }
            }
        }
    }
}
