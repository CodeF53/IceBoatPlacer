package net.cardinalboats.fabric;

import net.cardinalboats.TurnPriming;
import net.cardinalboats.config.ModConfig;
import net.fabricmc.api.ClientModInitializer;

public class CardinalBoatsInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TurnPriming.init();
        ModConfig.init();
    }
}
