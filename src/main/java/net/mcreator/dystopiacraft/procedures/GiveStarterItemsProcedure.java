package net.mcreator.dystopiacraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dystopiacraft.item.HeirloomKnifeItem;
import net.mcreator.dystopiacraft.DystopiacraftModVariables;
import net.mcreator.dystopiacraft.DystopiacraftModElements;
import net.mcreator.dystopiacraft.DystopiacraftMod;

import java.util.Map;

@DystopiacraftModElements.ModElement.Tag
public class GiveStarterItemsProcedure extends DystopiacraftModElements.ModElement {
	public GiveStarterItemsProcedure(DystopiacraftModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DystopiacraftMod.LOGGER.warn("Failed to load dependency entity for procedure GiveStarterItems!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass) == 1)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @p written_book{pages:[\"[\"\",\"Day 95\",\"\n\",\"It has been going on for days now. Sick Bay is overflowing. The crew has dropped from the original 100 to 15. There is no hope. Me and my closest friends are discussing a few ideas but none of them are finalized. I end todays entry here.\"]\",\"[\"\",\"Day 96\",\"\n\",\"More deaths. The crew has dropped down to 10. We are contemplating leaving everyone behind. There is no point trying to save them. We are running out of supplies. I end todays log here.\"]\",\"[\"\",\"Day 97  \",\"\n\",\"We leave in a few days. We have started packing. I end todays log.\"]\",\"[\"\",\"Day 98\",\"\n\",\"We leave tomorrow. We have decided to crash the ship to put everyone else out of there misery. End of todays log.\"]\",\"[\"\",\"Day 99\",\"\n\",\"We leave today. This will be the last entry in my log. We have launched out of the ship in the escape pod with only a few items. The ship is careening towards a planet that looks empty. We will have to try and survive on this planet. I have said my goodbyes and I have left many things behind. I end the final log here.\"]\"],title:\"Captains Log\",author:Captain}");
				}
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(HeirloomKnifeItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
