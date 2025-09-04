package io.github.mcengine.api.identity.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents an Identity-based Agent module that can be dynamically loaded into MCEngine.
 * <p>
 * Implement this interface to integrate identity-related agents into the system.
 */
public interface IMCEngineIdentityAgent {

    /**
     * Called when the Identity Agent is loaded by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Identity Agent is unloaded or disabled by the engine.
     *
     * @param plugin the plugin instance providing context
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Identity Agent instance.
     *
     * @param id the unique ID assigned by the engine
     */
    void setId(String id);
}
