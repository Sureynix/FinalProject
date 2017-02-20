package net.heletz.firstMod;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Moshe on 2/19/2017.
 */
public class Generation implements IWorldGenerator {
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
        generateTrumpBlock(ModBlocks.trumpBlock,world,random,chunkX,chunkZ,1,8,25,5,63);

    }

    private void generateTrumpBlock(Block funky, World world, Random random, int chunkX, int chunkZ, int i, int j, int k,
                                    int l, int m) {
        int veinSize = 1 + random.nextInt(8-1);
        int heightRange = 63-5;
        WorldGenMinable gen = new WorldGenMinable((IBlockState)funky.getDefaultState(),veinSize);
        for(int y = 0;y<k;y++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(58)+5;
            int zRand = chunkX * 16 + random.nextInt(16);
            gen.generate(world, random, new BlockPos(xRand,yRand,zRand));
        }
    }

}