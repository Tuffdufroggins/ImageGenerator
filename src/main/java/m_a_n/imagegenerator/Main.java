package m_a_n.imagegenerator;

import m_a_n.imagegenerator.commands.Filter;
import m_a_n.imagegenerator.commands.Help;
import m_a_n.imagegenerator.commands.Image;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    public static Main getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        Blocks.loadBlocks(true, true);

        getCommand("image").setExecutor(new Image());
        getCommand("help").setExecutor(new Help());
        getCommand("filter").setExecutor(new Filter());
    }

    @Override
    public void onDisable() {

    }
}
