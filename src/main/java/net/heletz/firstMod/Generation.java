package net.heletz.firstMod;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Moshe on 2/19/2017.
 */
public class Generation implements IWorldGenerator {
    private WorldGenerator gen_trump_ore;
    public Generation () {
        this.gen_trump_ore = new WorldGenMinable(ModBlocks.trumpOre.getDefaultState(), 8);
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()){
            case -1:
                break;
            case 0:
                generateOverworld(world,random,chunkX,chunkZ);
                break;
            case 1:
                break;
        }

    }

    private void generateOverworld(World world, Random random, int chunkX, int chunkZ) {
        generateTrumpBlock(this.gen_trump_ore, world, random, chunkX, chunkZ, 20, 0, 64);

    }

    private void generateTrumpBlock(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal dimensions for WorldGen");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 18 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 18 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

}