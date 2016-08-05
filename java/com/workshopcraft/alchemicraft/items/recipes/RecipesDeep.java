package com.workshopcraft.alchemicraft.items.recipes;

import net.minecraftforge.common.config.Configuration;

public class RecipesDeep extends Recipes{

	public RecipesDeep(String n,Configuration config) 
	{
		super(n,config);
		
	}

	@Override
	public void PopulateListFromConfig(Configuration config)
	{
		getRecipeFromConfig(config,"minecraft:stone","minecraft:cobblestone",0,1);//stone -> cobble +1 ether
	}
}
