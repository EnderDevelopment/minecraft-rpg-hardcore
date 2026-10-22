package com.enderdevelopment.challengingrpg;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingEvent;

@Mod.EventBusSubscriber(modid = "challenging_rpg")
public class NeoForgeEventSubscriber {
    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingTickEvent event) {
        // Living update code here
    }
}
