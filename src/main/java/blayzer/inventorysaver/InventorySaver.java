package blayzer.inventorysaver;

import blayzer.inventorysaver.commands.CommandInventory;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "InventorySaver", acceptableRemoteVersions = "*")
public class InventorySaver {

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(PlayerInventoryStore.instance);
	}
	
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandInventory());
    }
}
