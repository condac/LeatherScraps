package net.mcreator.leatherscraps;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxyleatherscraps extends CommonProxyleatherscraps {

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain("leatherscraps");
	}
}
