package gmail.com.heyfang36.discord_rpc;

import org.bukkit.plugin.java.JavaPlugin;

public final class Discord_rpc extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("diamond").setExecutor(new DiamondCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}