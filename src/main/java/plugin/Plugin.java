package plugin;

import data_managers.PlayerDataManager;
import data_managers.WorldDataManager;
import listeners.PlayerQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(
                new PlayerQuitListener(this), this);

        getLogger().info("Saves-plugin enabled");
    }

    @Override
    public void onDisable() {

        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerDataManager.savePlayerData(player);
        }

        for (World world : Bukkit.getWorlds())
        {
            WorldDataManager.saveWorldData(world);
        }

        getLogger().info("Saves-plugin disabled");
    }
}
