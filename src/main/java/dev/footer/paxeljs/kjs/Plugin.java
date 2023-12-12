package dev.footer.paxeljs.kjs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;

public class Plugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
    }
}
