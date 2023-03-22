package com.curso.listener;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage("§a§l* §eO jogador §b" + player.getName() + "§e entrou no servidor.");

        player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        ItemMeta meta = sword.getItemMeta();

        meta.setDisplayName("§aEspadinha do Céu");

        sword.setItemMeta(meta);

        player.getInventory().addItem(sword);

        player.sendTitle("§b§lBESTEIRINHA", "§fComida");
    }
}
