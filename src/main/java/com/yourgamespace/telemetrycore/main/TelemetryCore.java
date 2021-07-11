package com.yourgamespace.telemetrycore.main;

import com.yourgamespace.telemetrycore.enums.PluginType;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

import java.util.Timer;
import java.util.TimerTask;

public class TelemetryCore {

    private final String PREFIX = "§7[§3TelemetryCore§7] ";
    private final Long SUBMITDELAY = 300000L;
    private final ConsoleCommandSender ccs = Bukkit.getConsoleSender();

    private final PluginType pluginType;
    private final String serverId;
    private final Boolean debugging;

    public TelemetryCore(PluginType pluginType, String serverId, Boolean debugging) {
        this.pluginType = pluginType;
        this.serverId = serverId;
        this.debugging = debugging;

        if(debugging) ccs.sendMessage(PREFIX + "§aCreated new Instance for Plugin §e" + pluginType.toString() + ".");

        startSubmitting();
    }

    private void startSubmitting() {
        Timer submittingDataTimer = new Timer();

        Thread submittingDataThread = new Thread(() -> {
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    //Submit Data
                }
            };

            submittingDataTimer.schedule(timerTask, 30000, SUBMITDELAY);
            if(debugging) ccs.sendMessage(PREFIX + "§aTimer §esubmittingDataTimer §astarted! §7(Start-Delay: 30000; Submit-Delay: " + SUBMITDELAY + ";)");
        });

        submittingDataThread.start();
        if(debugging) ccs.sendMessage(PREFIX + "§aThread §eSubmittingDataThread §astarted!");
    }

    private String getDataAsJson() {
        String jsonData = null;

        return jsonData;
    }

}
