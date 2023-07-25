package com.github.sachin.tweakin.compat;

import com.github.sachin.tweakin.Tweakin;
import com.github.sachin.tweakin.utils.TConstants;

public class TeaksTweaksCompat {

    public static boolean isEnabled;

    static {
        isEnabled = Tweakin.getPlugin().getServer().getPluginManager().isPluginEnabled(TConstants.TEAKSTWEAKS);
    }

    public static boolean isPackEnabled(String name){
        me.teakivy.teakstweaks.Main instance = me.teakivy.teakstweaks.Main.getInstance();
        return instance.getPacks().contains(name);
    }
}
