package com.enderdevelopment.challengingrpg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class FabricEventSubscriber implements ModInitializer {
    @Override
    public void onInitialize() {
        // Initialization code here
        ServerLifecycleEvents.SERVER_STARTING.register(server -> {
            // Server starting code here
        });
    }
}
