import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class commandTest implements CommandExecutor, TabCompleter
{
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        if (sender instanceof ConsoleCommandSender || (sender instanceof Player && ((Player) sender).getPlayer().isOp()))
        {
            if (args.length == 1)
            {
                if (args[0].equalsIgnoreCase("true"))
                {
                    sender.sendMessage("Debug : args : " + args[0]);
                    return true;
                }
                else if (args[0].equalsIgnoreCase("false"))
                {
                    sender.sendMessage("Debug : args : " + args[0]);
                    return true;
                }
            }
            else
            {
                sender.sendMessage("Debug : no args");
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args)
    {
        List<String> argsToReturn = new ArrayList<String>();
        if (args.length == 1)
        {
            argsToReturn.add("true");
            argsToReturn.add("false");
        }
        return argsToReturn;
    }
}