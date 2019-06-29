package com.github.julyss2019.mcsp.julyguild.guild;

import com.github.julyss2019.mcsp.julylibrary.item.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class GuildIcon {
    private Material material;
    private short durability;
    private UUID uuid;
    private ItemStack itemStack;

    public GuildIcon(Material material, short durability, UUID uuid) {
        this.material = material;
        this.durability = durability;
        this.uuid = uuid;

        this.itemStack = new ItemBuilder().material(material).durability(durability).build();
    }

    public UUID getUuid() {
        return uuid;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public Material getMaterial() {
        return material;
    }

    public short getDurability() {
        return durability;
    }

    public static GuildIcon createNew(Material material, short durability) {
        return new GuildIcon(material, durability, UUID.randomUUID());
    }
}
