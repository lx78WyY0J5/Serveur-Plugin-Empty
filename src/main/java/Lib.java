import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Lib
{
    private static JavaPlugin plugin;

    private static Logger     logger = Bukkit.getLogger();

    public static JavaPlugin getPlugin()
    {
        return plugin;
    }

    public static void setPlugin(JavaPlugin plugin)
    {
        Lib.plugin = plugin;
        logger.info("Plugin hook is set");
    }

    public static void debug()
    {
        logger.info("Plugin is hooked");
    }
}