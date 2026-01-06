package data_managers;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class PlayerDataManager
{
    public static void savePlayerData(Player player)
    {
        UUID uuid = player.getUniqueId();

        Location location = player.getLocation();
        Inventory inventory = player.getInventory();
        double health = player.getHealth();
        double experience = player.getExp();
        Collection<PotionEffect> effects = player.getActivePotionEffects();

        player.saveData();
    }
}
