package listeners;

import data_managers.PlayerDataManager;
import data_managers.WorldDataManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import plugin.Plugin;

public class PlayerQuitListener implements Listener
{
    private final Plugin plugin;

    public PlayerQuitListener(Plugin plugin)
    {
        this.plugin = plugin;
    }

    //handler
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event)
    {
        Player player = event.getPlayer();

        // saves
        PlayerDataManager.savePlayerData(player);
        WorldDataManager.saveWorldData(player.getWorld());
    }
}
