package com.naughtyzombie.demo.util;

/**
 * Created by pram on 17/05/2015.
 */
public class Constants {
    //Set the visible game world width in meters
    public static final float VIEWPORT_WIDTH = 5.0f;

    //set the visible game world height in meters
    public static final float VIEWPORT_HEIGHT = 5.0f;

    // GUI Width
    public static final float VIEWPORT_GUI_WIDTH = 800.0f;
    // GUI Height
    public static final float VIEWPORT_GUI_HEIGHT = 480.0f;

    //Location of texture atlas
    public static final String TEXTURE_ATLAS_OBJECTS = "images/jumpyjump.pack.atlas";
    public static final String TEXTURE_ATLAS_UI = "images-ui/jumpyjump-ui.pack.atlas";
    public static final String TEXTURE_ATLAS_LIBGDX_UI = "images/uiskin.atlas";
    // Location of description file for skins
    public static final String SKIN_LIBGDX_UI = "images/uiskin.json";
    public static final String SKIN_JUMPYJUMP_UI = "images/jumpyjump-ui.json";

    // Location of image file for level 01
    public static final String LEVEL_01 = "levels/level-01.png";

    // Amount of extra lives at level start
    public static final int LIVES_START = 3;
    public static final float ITEM_FEATHER_POWERUP_DURATION = 9;

    // Delay after game over
    public static final float TIME_DELAY_GAME_OVER = 3;

    // Game preferences file
    public static final String PREFERENCES = "jumpyjump.prefs";

    // Number of carrots to spawn
    public static final int CARROTS_SPAWN_MAX = 100;
    // Spawn radius for carrots
    public static final float CARROTS_SPAWN_RADIUS = 3.5f;
    // Delay after game finished
    public static final float TIME_DELAY_GAME_FINISHED = 6;
}
