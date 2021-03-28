package de.zarex.testserver;

import com.sun.org.apache.xpath.internal.operations.String;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Team {

    private String name, prefix;
    private ArrayList<Player> players;
    private byte colorData;

    public Team(String name, String prefix, byte colorData){
            this.name=name;
            this.prefix=prefix;
            this.colorData=colorData;
            this.players = new ArrayList<>();
    }

    public ArrayList<String> getPlayers() {

        return players;

    }

    public byte getColorData() {
        return colorData;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public boolean isInTeam(Player p){
        if(players.contains(p.getName())){
            return true;
        }
        return false;
    }

   public ItemStack getIcon(){
        ItemStack it = new ItemStack(Material.LEGACY_STAINED_CLAY,1, colorData);
        ItemMeta m = it.getItemMeta();
        m.setDisplayName(prefix+name);
        m.setLore(players);
        it.setItemMeta(m);
        return it;
   }
}
