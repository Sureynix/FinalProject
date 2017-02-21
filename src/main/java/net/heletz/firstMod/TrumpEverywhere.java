package net.heletz.firstMod;


        import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrumpEverywhere implements ICommand {
    public List<String> aliases;
    public int numOfSpawns;
    Random random = new Random();
    public TrumpEverywhere(){
        aliases = new ArrayList();
        aliases.add("trumpZombie");
        aliases.add("tpzh");
    }
    @Override
    public int compareTo(ICommand arg0) {

        return 0;
    }

    @Override
    public String getCommandName() {
        // TODO Auto-generated method stub
        return "trumpZombie";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        // TODO Auto-generated method stub
        return "trumpZombie";
    }

    @Override
    public List<String> getCommandAliases() {
        // TODO Auto-generated method stub
        return aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        World world = sender.getEntityWorld();
        if(!world.isRemote){
            numOfSpawns = 20;
            for(int i = 0;i<numOfSpawns;i++){
                EntityZombieHorse zombieHorse = new EntityZombieHorse(world);
                zombieHorse.setPosition(sender.getPosition().getX(), sender.getPosition().getY(), sender.getPosition().getZ());
                world.spawnEntityInWorld(zombieHorse);
            }
        }

    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args,
                                                BlockPos pos) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        // TODO Auto-generated method stub
        return false;
    }

}