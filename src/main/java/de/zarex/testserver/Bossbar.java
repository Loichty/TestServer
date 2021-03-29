package de.zarex.testserver;

import org.bukkit.Bukkit;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class Bossbar {

    private int taskID = -1;
    private final Main plugin;
    private Bossbar bar;


    public Bossbar(Main plugin) {
        this.plugin = plugin;
    }

    public void addPlayer(Player player){
        bar.addPlayer(player);
    }

    public Bossbar getBar() {
        return bar;
    }

    public void createBar(){
        bar = Bukkit.createBossBar()
    }
}


