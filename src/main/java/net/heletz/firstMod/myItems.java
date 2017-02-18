package net.heletz.firstMod;

import net.heletz.firstMod.items.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Sureynix on 1/15/17.
 */
public final class myItems extends Item {
    public static Item first_item;
    public static Item neon_cat_item;
    public static Item trump_item;
    public static Item raw_trump;
    public static ResourceLocation location = new ResourceLocation("first_mod", "trump_defense_sound");
    public static SoundEvent event = new SoundEvent(location);
    public static ItemArmor.ArmorMaterial trump_defense = EnumHelper.addArmorMaterial("trump_defense", "first_mod:trump_defense", 40, new int[]{1, 3, 2, 1}, 35, event, 1.0f);
    public static ItemModArmor trump_defense_helmet;
    public static ItemModArmor trump_defense_chestplate;
    public static ItemModArmor trump_defense_leggings;
    public static ItemModArmor trump_defense_boots;
    public static ToolMaterial trump_hoe_material = EnumHelper.addToolMaterial("trump_hoe", 3, 10000, 80.0f, 0.0f, 40);
    public static Hoe trump_hoe;
    public static ToolMaterial trump_sword_material = EnumHelper.addToolMaterial("trump_sword", 0, 10000, 1.0f, 1000.0f, 40);
    public static Sword trump_sword;
    public static ToolMaterial trump_pickaxe_material = EnumHelper.addToolMaterial("trump_pickaxe", 2, 10000, 75.0f, 750.0f, 40);
    public static Pickaxe trump_pickaxe;
    public static ToolMaterial trump_spade_material = EnumHelper.addToolMaterial("trump_spade", 0, 10000, 1.0f, 1250.0f, 35);
    public static Spade trump_spade;
    public static PotionEffect raw_trump_speed = new PotionEffect(Potion.getPotionFromResourceLocation("swiftness"), 1200, 1);
    public static PotionEffect raw_trump_jump = new PotionEffect(Potion.getPotionFromResourceLocation("leaping"), 600, 0);
    public static PotionEffect raw_trump_regeneration = new PotionEffect(Potion.getPotionFromResourceLocation("regeneration"), 200, 1);
    public static void createItems() {
        GameRegistry.register(first_item = new BasicItem("first_item", CreativeTabs.MISC));
        GameRegistry.register(neon_cat_item = new BasicItem("neon_cat_item", CreativeTabs.MISC));
        GameRegistry.register(trump_item = new BasicItem("trump_item", CreativeTabs.MISC));
        GameRegistry.register(raw_trump = new ModItemFood(
                "raw_trump",
                2,
                0.2f,
                false,
                raw_trump_speed,
                raw_trump_jump,
                raw_trump_regeneration
                ));
        GameRegistry.register(trump_defense_helmet = new ItemModArmor("trump_defense_helmet", trump_defense, 1, EntityEquipmentSlot.HEAD));
        GameRegistry.register(trump_defense_chestplate = new ItemModArmor("trump_defense_chestplate", trump_defense, 1, EntityEquipmentSlot.CHEST));
        GameRegistry.register(trump_defense_leggings = new ItemModArmor("trump_defense_leggings", trump_defense, 2, EntityEquipmentSlot.LEGS));
        GameRegistry.register(trump_defense_boots = new ItemModArmor("trump_defense_boots", trump_defense, 1, EntityEquipmentSlot.FEET));
        GameRegistry.register(trump_hoe = new Hoe("trump_hoe", trump_hoe_material));
        GameRegistry.register(trump_sword = new Sword("trump_sword", trump_sword_material));
        GameRegistry.register(trump_pickaxe = new Pickaxe("trump_pickaxe", trump_pickaxe_material));
        GameRegistry.register(trump_spade = new Spade("trump_spade", trump_spade_material));
    }

}
