package io.github.mcengine.api.identity.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Identity-based Library module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to provide identity-related library support to the system.
 */
public interface IMCEngineIdentityLibrary {

    /**
     * Called when the Identity Library is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Identity Library is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Identity Library instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
