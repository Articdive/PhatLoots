package de.articdive.phatloots.regions;

import org.bukkit.Location;

import java.util.List;

/**
 * @author Codisimus
 */
public interface RegionHook {
	public String getPluginName();

	public List<String> getRegionNames(Location loc);
}
