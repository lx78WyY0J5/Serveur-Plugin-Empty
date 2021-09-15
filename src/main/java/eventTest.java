import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class eventTest implements Listener
{
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCmd(PlayerCommandPreprocessEvent e)
    {
        if (e.getMessage().equalsIgnoreCase("/test") || e.getMessage().equalsIgnoreCase("/debug"))
        {
            e.getPlayer().sendMessage("Debug : event : " + e.getEventName());
        }
    }
}