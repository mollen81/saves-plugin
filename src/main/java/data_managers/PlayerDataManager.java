package data_managers;

import org.bukkit.entity.Player;

public class PlayerDataManager
{
    public static void savePlayerData(Player player)
    {
        player.saveData();
    }
}
