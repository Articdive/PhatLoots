package de.articdive.phatloots.regions;

import com.codisimus.plugins.regiontools.Region;
import com.codisimus.plugins.regiontools.RegionTools;
import de.articdive.phatloots.PhatLoots;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Codisimus
 */
public class RegionToolsRegionHook implements RegionHook {
	private Region regionGroup;

	public RegionToolsRegionHook() {
		String regionName = PhatLoots.plugin.getConfig().getString("RegionGroup");
		if (regionName != null && !regionName.isEmpty()) {
			regionGroup = RegionTools.findRegion(regionName, false);
			if (regionGroup == null) {
				regionGroup = RegionTools.createRegionGroup(regionName);
			}
		}
	}

	@Override
	public String getPluginName() {
		return "RegionTools";
	}

	@Override
	public List<String> getRegionNames(Location loc) {
		List<String> regionNames = new ArrayList<>(1);
		Region region = regionGroup == null
				? RegionTools.findRegion(loc, true)
				: regionGroup.findRegion(loc);
		if (region != null) {
			regionNames.add(region.getName());
		}
		return regionNames;
	}
}
