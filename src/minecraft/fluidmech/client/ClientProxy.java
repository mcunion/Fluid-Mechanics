package fluidmech.client;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fluidmech.client.render.BlockRenderHelper;
import fluidmech.client.render.ItemRenderHelper;
import fluidmech.client.render.RenderGearRod;
import fluidmech.client.render.RenderGenerator;
import fluidmech.client.render.RenderPipe;
import fluidmech.client.render.RenderPump;
import fluidmech.client.render.RenderReleaseValve;
import fluidmech.client.render.RenderSink;
import fluidmech.client.render.RenderTank;
import fluidmech.common.CommonProxy;
import fluidmech.common.FluidMech;
import fluidmech.common.tileentity.TileEntityGenerator;
import fluidmech.common.tileentity.TileEntityPipe;
import fluidmech.common.tileentity.TileEntityPump;
import fluidmech.common.tileentity.TileEntityReleaseValve;
import fluidmech.common.tileentity.TileEntityRod;
import fluidmech.common.tileentity.TileEntitySink;
import fluidmech.common.tileentity.TileEntityTank;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		MinecraftForgeClient.preloadTexture(FluidMech.BLOCK_TEXTURE_FILE);
		MinecraftForgeClient.preloadTexture(FluidMech.ITEM_TEXTURE_FILE);
	}

	@Override
	public void Init()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new RenderPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPump.class, new RenderPump());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRod.class, new RenderGearRod());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGenerator.class, new RenderGenerator());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTank.class, new RenderTank());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityReleaseValve.class, new RenderReleaseValve());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySink.class, new RenderSink());
		MinecraftForgeClient.registerItemRenderer(FluidMech.blockPipe.blockID, new ItemRenderHelper());
		MinecraftForgeClient.registerItemRenderer(FluidMech.blockReleaseValve.blockID, new ItemRenderHelper());
		RenderingRegistry.registerBlockHandler(new BlockRenderHelper());
	}

	@Override
	public void postInit()
	{

	}
}