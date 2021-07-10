package com.yourgamespace.telemetrycore.main;

import com.yourgamespace.telemetrycore.enums.PluginType;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class TelemetryCore {

    private final String PREFIX = "§7[§3TelemetryCore§7] ";
    private final ConsoleCommandSender ccs = Bukkit.getConsoleSender();

    private PluginType pluginType;
    private String serverId;
    private Boolean debugging;

    public TelemetryCore(PluginType pluginType, String serverId, Boolean debugging) {
        this.pluginType = pluginType;
        this.serverId = serverId;
        this.debugging = debugging;

        if(debugging) ccs.sendMessage(PREFIX + "§aCreated new Instance for Plugin §e" + pluginType.toString() + ".");
    }
}
