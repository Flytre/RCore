package net.flytre.flytre_lib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.flytre.flytre_lib.config.ReloadConfigCommand;

public class FlytreLib implements ModInitializer {
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> ReloadConfigCommand.register(dispatcher));
    }
}
