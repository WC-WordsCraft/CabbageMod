package com.midsummer380.baicair;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class CabbageArmor  implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[]{165,240,225,195};
    public static final int[] BASE_PROTECTION_AMOUNT = new int[]{2,5,4,1};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()]*25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return BASE_PROTECTION_AMOUNT[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;//设置使用时的声音，可选
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;//设置使用铁砧修复的配方，可选
    }

    @Override
    public String getName() {
        return "CabbageArmor";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.0F;
    }

}