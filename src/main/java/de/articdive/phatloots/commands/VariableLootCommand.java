package de.articdive.phatloots.commands;

import de.articdive.phatloots.PhatLoot;
import org.bukkit.entity.Player;

/**
 * Executes Player Commands for virtually looting a PhatLoot
 *
 * @author Codisimus
 */
public class VariableLootCommand {
	@CommandHandler.CodCommand(
			command = "&variable",
			weight = 200,
			usage = {
					"§2<command> <Name>§b Loot a virtual Chest for the given PhatLoot"
			},
			permission = "phatloots.commandloot"
	)
	public boolean loot(Player player, PhatLoot phatLoot) {
		phatLoot.rollForLoot(player);
		return true;
	}
}