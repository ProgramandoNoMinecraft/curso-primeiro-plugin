package com.curso;

import com.curso.listener.MainListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new MainListener(), this);

        getLogger().info("O plugin iniciou! Feito por: " + getDescription().getAuthors().get(0));
    }
}
