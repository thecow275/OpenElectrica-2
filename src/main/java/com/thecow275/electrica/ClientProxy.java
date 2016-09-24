package com.thecow275.electrica;
import com.thecow275.electrica.render.blocks.BlockRenderRegister;
import com.thecow275.electrica.render.items.ItemRenderRegister;

import	net.minecraftforge.fml.common.event.FMLInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e){
		super.preInit(e);
	}
	@Override
	public void Init(FMLInitializationEvent e){
		super.Init(e);
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	}
	@Override
	public void postInit(FMLPostInitializationEvent e){
		super.postInit(e);
	}
}
