package be.unamur.info.b314.compiler;

public class VariableEnvironement {
    static int LIFE = 20;
    static int LATITUDE = 1;
    static int LONGITUDE = 1;
    static int GRID_SIZE = 30;


    static int DIRT = 99;
    static int ROCK = 1;
    static int VINE = 2;
    static int ZOMBIE = 3;
    static int ENNEMI = 4;
    static int PLAYER = 5;
    static int NEXT_ACTION = 0;

    static int MAP = 6;
    static int RADIO = 7;
    static int AMMO = 8;
    static int FRUIT = 9;
    static int SODA = 10;
    static int GRAAL = 11;
    static int RADAR = 12;
    static int[][] NEARBY = new int[100][100];

    static boolean ENNEMI_IS_NORTH = false;
    static boolean ENNEMI_IS_SOUTH = false;
    static boolean ENNEMI_IS_WEST = false;
    static boolean ENNEMI_IS_EST = false;

    static boolean GRAAL_IS_NORTH = false;
    static boolean GRAAL_IS_SOUTH = false;
    static boolean GRAAL_IS_WEST = false;
    static boolean GRAAL_IS_EST = false;
}
