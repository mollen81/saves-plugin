package data_managers;

import org.bukkit.World;

public class WorldDataManager {
    public static void saveWorldData(World world)
    {
        world.save();
    }
}
