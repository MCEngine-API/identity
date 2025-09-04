package io.github.mcengine.api.identity.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Identity-based API module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to provide identity-related APIs to the system.
 */
public interface IMCEngineIdentityAPI {

    /**
     * Called when the Identity API is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Identity API is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Identity API instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
