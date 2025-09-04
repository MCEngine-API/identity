package io.github.mcengine.api.identity.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Identity-based DLC module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content into the system.
 */
public interface IMCEngineIdentityDLC {

    /**
     * Called when the Identity DLC is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Identity DLC is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Identity DLC instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
