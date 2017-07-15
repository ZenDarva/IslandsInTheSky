package com.darva.islandsinthesky.generation;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

/**
 * Created by James on 9/7/2015.
 */
public class VoidWorldType extends WorldType {
    public VoidWorldType() {
        super("IslandsInTheSky");
    }



    @Override
    public String getWorldTypeName() {
        return "IslandsInTheSky";
    }

    @Override
    public WorldChunkManager getChunkManager(World world) {


        return new VoidWorldChunkManager(world);
    }

    @Override
    public IChunkProvider getChunkGenerator(World world, String generatorOptions) {
        return new VoidChunk(world,world.getSeed(),false,"",world);
    }

    @Override
    public int getSpawnFuzz() {
        return 1;
    }
}
