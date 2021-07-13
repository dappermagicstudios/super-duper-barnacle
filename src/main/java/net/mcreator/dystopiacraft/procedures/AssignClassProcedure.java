package net.mcreator.dystopiacraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.dystopiacraft.DystopiacraftModVariables;
import net.mcreator.dystopiacraft.DystopiacraftModElements;
import net.mcreator.dystopiacraft.DystopiacraftMod;

import java.util.Map;
import java.util.HashMap;

@DystopiacraftModElements.ModElement.Tag
public class AssignClassProcedure extends DystopiacraftModElements.ModElement {
	public AssignClassProcedure(DystopiacraftModElements instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DystopiacraftMod.LOGGER.warn("Failed to load dependency entity for procedure AssignClass!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DystopiacraftMod.LOGGER.warn("Failed to load dependency world for procedure AssignClass!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass) == 0)) {
			DystopiacraftModVariables.WorldVariables.get(world).RandomClass = (double) Math.round((Math.random() * 5));
			DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
			if (((DystopiacraftModVariables.WorldVariables.get(world).RandomClass) == 1)) {
				if (((DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken) == (false))) {
					DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken = (boolean) (true);
					DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (double) 1;
						entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PlayerClass = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
				}
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 2;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 3;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 4;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else {
				DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 5;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			}
			if (((DystopiacraftModVariables.WorldVariables.get(world).RandomClass) == 2)) {
				if (((DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken) == (false))) {
					DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken = (boolean) (true);
					DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (double) 2;
						entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PlayerClass = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
				}
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 4;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 5;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 3;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else {
				DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 1;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			}
			if (((DystopiacraftModVariables.WorldVariables.get(world).RandomClass) == 3)) {
				if (((DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken) == (false))) {
					DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken = (boolean) (true);
					DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (double) 3;
						entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PlayerClass = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
				}
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 2;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 5;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 1;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else {
				DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 4;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			}
			if (((DystopiacraftModVariables.WorldVariables.get(world).RandomClass) == 4)) {
				if (((DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken) == (false))) {
					DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken = (boolean) (true);
					DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (double) 4;
						entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PlayerClass = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
				}
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 2;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 5;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 1;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else {
				DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 3;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			}
			if (((DystopiacraftModVariables.WorldVariables.get(world).RandomClass) == 5)) {
				if (((DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken) == (false))) {
					DystopiacraftModVariables.WorldVariables.get(world).IsCookTaken = (boolean) (true);
					DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
					{
						double _setval = (double) 5;
						entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PlayerClass = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
				}
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsSICTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 2;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsMedicTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 3;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else if (((DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken) == (false))) {
				DystopiacraftModVariables.WorldVariables.get(world).IsCommanderTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 1;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			} else {
				DystopiacraftModVariables.WorldVariables.get(world).IsEngineerTaken = (boolean) (true);
				DystopiacraftModVariables.WorldVariables.get(world).syncData(world);
				{
					double _setval = (double) 4;
					entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerClass = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				System.out.println(((entity.getCapability(DystopiacraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DystopiacraftModVariables.PlayerVariables())).PlayerClass));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.getPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", entity.getPosX());
		dependencies.put("y", entity.getPosY());
		dependencies.put("z", entity.getPosZ());
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
