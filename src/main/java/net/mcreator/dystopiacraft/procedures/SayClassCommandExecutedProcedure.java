package net.mcreator.dystopiacraft.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.dystopiacraft.DystopiacraftModVariables;
import net.mcreator.dystopiacraft.DystopiacraftModElements;
import net.mcreator.dystopiacraft.DystopiacraftMod;

import java.util.Map;

@DystopiacraftModElements.ModElement.Tag
public class SayClassCommandExecutedProcedure extends DystopiacraftModElements.ModElement {
	public SayClassCommandExecutedProcedure(DystopiacraftModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DystopiacraftMod.LOGGER.warn("Failed to load dependency entity for procedure SayClassCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(
					new StringTextComponent(("" + (((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass)))),
					(false));
		}
	}
}
