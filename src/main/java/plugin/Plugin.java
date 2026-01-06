package plugin;

import listeners.PlayerQuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(
                new PlayerQuitListener(this), this);
    }

    @Override
    public void onDisable()
    {

    }
}
