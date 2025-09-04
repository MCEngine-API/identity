package io.github.mcengine.api.identity.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Identity-based Skript module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate scripted identity content into the system.
 */
public interface IMCEngineIdentitySkript {

    /**
     * Called when the Identity Skript module is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Identity Skript module is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Identity Skript instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
