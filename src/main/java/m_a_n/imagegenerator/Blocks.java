package m_a_n.imagegenerator;

import org.bukkit.Material;

import java.util.HashMap;

public class Blocks {

    public static HashMap<Material, Integer> blocks = new HashMap<>();

    public static HashMap<Material, Integer> getBlocks(boolean includeDecaying, boolean includeFalling) {
        loadBlocks(includeDecaying, includeFalling);

        return blocks;
    }

    static boolean loaded = false;
    static boolean loadedDec = false;
    static boolean loadedFal = false;

    public static void loadBlocks(boolean includeDecaying, boolean includeFalling) {
        if(loaded && includeDecaying == loadedDec && includeFalling == loadedFal) return;

        if(!blocks.isEmpty()) blocks.clear();

        blocks.put(Material.AIR, 0x00000000);

        blocks.put(Material.WHITE_CONCRETE, 0xFFCFD5D6);
        blocks.put(Material.LIGHT_GRAY_CONCRETE, 0xFF7D7D73);
        blocks.put(Material.GRAY_CONCRETE, 0xFF373A3E);
        blocks.put(Material.BLACK_CONCRETE, 0xFF080A0F);
        blocks.put(Material.BROWN_CONCRETE, 0xFF603C20);
        blocks.put(Material.RED_CONCRETE, 0xFF8E2121);
        blocks.put(Material.ORANGE_CONCRETE, 0xFFE06101);
        blocks.put(Material.YELLOW_CONCRETE, 0xFFF1AF15);
        blocks.put(Material.LIME_CONCRETE, 0xFF5EA919);
        blocks.put(Material.GREEN_CONCRETE, 0xFF495B24);
        blocks.put(Material.CYAN_CONCRETE, 0xFF157788);
        blocks.put(Material.LIGHT_BLUE_CONCRETE, 0xFF2489C7);
        blocks.put(Material.BLUE_CONCRETE, 0xFF2C2E8F);
        blocks.put(Material.PURPLE_CONCRETE, 0xFF64209C);
        blocks.put(Material.MAGENTA_CONCRETE, 0xFFA9309F);
        blocks.put(Material.PINK_CONCRETE, 0xFFD6658F);

        blocks.put(Material.WHITE_WOOL, -1381139);
        blocks.put(Material.LIGHT_GRAY_WOOL, -7434617);
        blocks.put(Material.GRAY_WOOL, -12630968);
        blocks.put(Material.BLACK_WOOL, -15395558);
        blocks.put(Material.BROWN_WOOL, -9287639);
        blocks.put(Material.RED_WOOL, -6215901);
        blocks.put(Material.ORANGE_WOOL, -952812);
        blocks.put(Material.YELLOW_WOOL, -408024);
        blocks.put(Material.LIME_WOOL, -9389798);
        blocks.put(Material.GREEN_WOOL, -11178468);
        blocks.put(Material.CYAN_WOOL, -15365487);
        blocks.put(Material.LIGHT_BLUE_WOOL, -12931111);
        blocks.put(Material.BLUE_WOOL, -13289059);
        blocks.put(Material.PURPLE_WOOL, -8770899);
        blocks.put(Material.MAGENTA_WOOL, -4307532);
        blocks.put(Material.PINK_WOOL, -1143380);

        blocks.put(Material.OAK_WOOD, -9611981);
        blocks.put(Material.SPRUCE_WOOD, -12900847);
        blocks.put(Material.BIRCH_WOOD, -2500654);
        blocks.put(Material.JUNGLE_WOOD, -11189223);
        blocks.put(Material.ACACIA_WOOD, -10002089);
        blocks.put(Material.DARK_OAK_WOOD, -12832998);
        blocks.put(Material.MANGROVE_WOOD, -11254999);
        blocks.put(Material.CRIMSON_HYPHAE, -10675682);
        blocks.put(Material.WARPED_HYPHAE, -12960946);

        blocks.put(Material.STRIPPED_OAK_WOOD, -5140394);
        blocks.put(Material.STRIPPED_SPRUCE_WOOD, -9151948);
        blocks.put(Material.STRIPPED_BIRCH_WOOD, -3821450);
        blocks.put(Material.STRIPPED_JUNGLE_WOOD, -5536427);
        blocks.put(Material.STRIPPED_ACACIA_WOOD, -5284548);
        blocks.put(Material.STRIPPED_DARK_OAK_WOOD, -11978460);
        blocks.put(Material.STRIPPED_MANGROVE_WOOD, -8899024);
        blocks.put(Material.STRIPPED_CRIMSON_HYPHAE, -7784102);
        blocks.put(Material.STRIPPED_WARPED_HYPHAE, -12937324);

        blocks.put(Material.BLUE_ICE, 0xFF74A8FD);

        blocks.put(Material.ACACIA_PLANKS, -5744078);
        blocks.put(Material.AMETHYST_BLOCK, -7970113);
        blocks.put(Material.ANDESITE, -7829367);
        blocks.put(Material.BAMBOO_BLOCK, -8417222);
        blocks.put(Material.BAMBOO_MOSAIC, -4281778);
        blocks.put(Material.BAMBOO_PLANKS, -4084400);
        blocks.put(Material.BEDROCK, -11184811);
        blocks.put(Material.BIRCH_PLANKS, -4149383);
        blocks.put(Material.BLACKSTONE, -14015447);
        blocks.put(Material.BLACK_GLAZED_TERRACOTTA, -12313056);

        blocks.put(Material.BLACK_STAINED_GLASS, 1964579097);
        blocks.put(Material.BLACK_TERRACOTTA, -14346480);
        blocks.put(Material.BLUE_GLAZED_TERRACOTTA, -13680245);
        blocks.put(Material.BLUE_STAINED_GLASS, 1966296242);
        blocks.put(Material.BLUE_TERRACOTTA, -11912101);
        blocks.put(Material.BRICKS, -6856109);
        blocks.put(Material.BROWN_GLAZED_TERRACOTTA, -8885674);
        blocks.put(Material.BROWN_MUSHROOM_BLOCK, -6983599);
        blocks.put(Material.BROWN_STAINED_GLASS, 1969638451);

        blocks.put(Material.BROWN_TERRACOTTA, -11717852);
        blocks.put(Material.CALCITE, -2105123);
        blocks.put(Material.CHISELED_DEEPSLATE, -13224393);
        blocks.put(Material.CHISELED_NETHER_BRICKS, -13690852);
        blocks.put(Material.CHISELED_POLISHED_BLACKSTONE, -13225671);
        blocks.put(Material.CHISELED_QUARTZ_BLOCK, -1514534);
        blocks.put(Material.CHISELED_RED_SANDSTONE, -4759268);
        blocks.put(Material.CHISELED_SANDSTONE, -2569317);
        blocks.put(Material.CHISELED_STONE_BRICKS, -8882312);
        blocks.put(Material.CLAY, -6183245);
        blocks.put(Material.COAL_BLOCK, -15724528);
        blocks.put(Material.COAL_ORE, -9803159);
        blocks.put(Material.COARSE_DIRT, -8956357);
        blocks.put(Material.COBBLED_DEEPSLATE, -11711151);
        blocks.put(Material.COBBLESTONE, -8355968);
        blocks.put(Material.COPPER_BLOCK, -4166576);
        blocks.put(Material.COPPER_ORE, -8552840);
        blocks.put(Material.CRACKED_DEEPSLATE_BRICKS, -12500671);
        blocks.put(Material.CRACKED_DEEPSLATE_TILES, -13290187);
        blocks.put(Material.CRACKED_NETHER_BRICKS, -14150632);
        blocks.put(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, -13883860);
        blocks.put(Material.CRACKED_STONE_BRICKS, -9013642);
        blocks.put(Material.CRIMSON_NYLIUM, -8184033);
        blocks.put(Material.CRIMSON_PLANKS, -10145465);
        blocks.put(Material.CRYING_OBSIDIAN, -14611908);
        blocks.put(Material.CUT_COPPER, -4232367);
        blocks.put(Material.CUT_RED_SANDSTONE, -4364768);
        blocks.put(Material.CUT_SANDSTONE, -2437472);
        blocks.put(Material.CYAN_GLAZED_TERRACOTTA, -13338755);
        blocks.put(Material.CYAN_STAINED_GLASS, 1967947673);
        blocks.put(Material.CYAN_TERRACOTTA, -11052197);
        blocks.put(Material.DARK_OAK_LOG, -12832998);
        blocks.put(Material.DARK_OAK_PLANKS, -12375276);
        blocks.put(Material.DARK_PRISMARINE, -13345716);
        blocks.put(Material.DEAD_BRAIN_CORAL_BLOCK, -8620430);
        blocks.put(Material.DEAD_BUBBLE_CORAL_BLOCK, -8094601);
        blocks.put(Material.DEAD_FIRE_CORAL_BLOCK, -8094600);
        blocks.put(Material.DEAD_HORN_CORAL_BLOCK, -7963014);
        blocks.put(Material.DEAD_TUBE_CORAL_BLOCK, -8225928);
        blocks.put(Material.DEEPSLATE, -11513773);
        blocks.put(Material.DEEPSLATE_BRICKS, -12105913);
        blocks.put(Material.DEEPSLATE_COAL_ORE, -11908532);
        blocks.put(Material.DEEPSLATE_COPPER_ORE, -10724007);
        blocks.put(Material.DEEPSLATE_DIAMOND_ORE, -11310485);
        blocks.put(Material.DEEPSLATE_EMERALD_ORE, -11638696);
        blocks.put(Material.DEEPSLATE_GOLD_ORE, -9214130);
        blocks.put(Material.DEEPSLATE_IRON_ORE, -9739169);
        blocks.put(Material.DEEPSLATE_LAPIS_ORE, -11510925);
        blocks.put(Material.DEEPSLATE_REDSTONE_ORE, -9877173);
        blocks.put(Material.DEEPSLATE_TILES, -13158601);
        blocks.put(Material.DIAMOND_BLOCK, -10293788);
        blocks.put(Material.DIAMOND_ORE, -8811123);
        blocks.put(Material.DIORITE, -4342595);
        blocks.put(Material.DIRT, -7970749);
        blocks.put(Material.DRIPSTONE_BLOCK, -7967651);
        blocks.put(Material.EMERALD_BLOCK, -13972648);
        blocks.put(Material.EMERALD_ORE, -9664396);
        blocks.put(Material.END_STONE, -2302050);
        blocks.put(Material.END_STONE_BRICKS, -2432862);
        blocks.put(Material.EXPOSED_COPPER, -6193560);
        blocks.put(Material.EXPOSED_CUT_COPPER, -6587803);
        blocks.put(Material.GILDED_BLACKSTONE, -13096154);
        blocks.put(Material.GLASS, 1099732631);
        blocks.put(Material.GLOWSTONE, -5471404);
        blocks.put(Material.GOLD_BLOCK, -602050);
        blocks.put(Material.GOLD_ORE, -7240085);
        blocks.put(Material.GRANITE, -6985898);
        blocks.put(Material.GRAY_GLAZED_TERRACOTTA, -11314594);
        blocks.put(Material.GRAY_STAINED_GLASS, 1967934540);
        blocks.put(Material.GRAY_TERRACOTTA, -12965340);
        blocks.put(Material.GREEN_GLAZED_TERRACOTTA, -9073085);
        blocks.put(Material.GREEN_STAINED_GLASS, 1969651507);
        blocks.put(Material.GREEN_TERRACOTTA, -11775190);
        blocks.put(Material.HONEYCOMB_BLOCK, -1731554);
        blocks.put(Material.ICE, -1097680642);
        blocks.put(Material.IRON_BLOCK, -2302756);
        blocks.put(Material.IRON_ORE, -7831173);
        blocks.put(Material.JUNGLE_LOG, -11189223);
        blocks.put(Material.JUNGLE_PLANKS, -6261935);
        blocks.put(Material.LAPIS_BLOCK, -14728308);
        blocks.put(Material.LAPIS_ORE, -9734515);
        blocks.put(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, -10508847);
        blocks.put(Material.LIGHT_BLUE_STAINED_GLASS, 1969658328);
        blocks.put(Material.LIGHT_BLUE_TERRACOTTA, -9343606);
        blocks.put(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, -7297368);
        blocks.put(Material.LIGHT_GRAY_STAINED_GLASS, 1973000601);
        blocks.put(Material.LIGHT_GRAY_TERRACOTTA, -7902366);
        blocks.put(Material.LIME_GLAZED_TERRACOTTA, -6044105);
        blocks.put(Material.LIME_STAINED_GLASS, 1971309593);
        blocks.put(Material.LIME_TERRACOTTA, -9931211);
        blocks.put(Material.MAGENTA_GLAZED_TERRACOTTA, -3119936);
        blocks.put(Material.MAGENTA_STAINED_GLASS, 1974619352);
        blocks.put(Material.MAGENTA_TERRACOTTA, -6924179);
        blocks.put(Material.MANGROVE_LOG, -11254999);
        blocks.put(Material.MANGROVE_PLANKS, -9030095);
        blocks.put(Material.MOSSY_COBBLESTONE, -9537697);
        blocks.put(Material.MOSSY_STONE_BRICKS, -9209495);
        blocks.put(Material.MOSS_BLOCK, -10916307);
        blocks.put(Material.MUD, -12830403);
        blocks.put(Material.MUD_BRICKS, -7772081);
        blocks.put(Material.NETHERITE_BLOCK, -12370624);
        blocks.put(Material.NETHERRACK, -10344922);
        blocks.put(Material.NETHER_BRICKS, -13887974);
        blocks.put(Material.NETHER_GOLD_ORE, -9226454);
        blocks.put(Material.NETHER_PORTAL, -1084814401);
        blocks.put(Material.NETHER_QUARTZ_ORE, -9027010);
        blocks.put(Material.NETHER_WART_BLOCK, -9239806);
        blocks.put(Material.NOTE_BLOCK, -10929367);
        blocks.put(Material.OAK_LOG, -9611981);
        blocks.put(Material.OAK_PLANKS, -6126769);
        blocks.put(Material.OBSIDIAN, -15791335);
        blocks.put(Material.ORANGE_GLAZED_TERRACOTTA, -6581412);
        blocks.put(Material.ORANGE_STAINED_GLASS, 1977122611);
        blocks.put(Material.ORANGE_TERRACOTTA, -6138842);
        blocks.put(Material.OXIDIZED_COPPER, -11361403);
        blocks.put(Material.OXIDIZED_CUT_COPPER, -11494786);
        blocks.put(Material.PACKED_ICE, -7424774);
        blocks.put(Material.PACKED_MUD, -7443632);
        blocks.put(Material.PINK_GLAZED_TERRACOTTA, -1336394);
        blocks.put(Material.PINK_STAINED_GLASS, 1978826661);
        blocks.put(Material.PINK_TERRACOTTA, -6140337);
        blocks.put(Material.POLISHED_ANDESITE, -8091770);
        blocks.put(Material.POLISHED_BLACKSTONE, -13291207);
        blocks.put(Material.POLISHED_BLACKSTONE_BRICKS, -13620430);
        blocks.put(Material.POLISHED_DEEPSLATE, -12039863);
        blocks.put(Material.POLISHED_DIORITE, -4079165);
        blocks.put(Material.POLISHED_GRANITE, -6657191);
        blocks.put(Material.POWDER_SNOW, -459267);
        blocks.put(Material.PRISMARINE, -10249065);
        blocks.put(Material.PRISMARINE_BRICKS, -10244962);
        blocks.put(Material.PURPLE_GLAZED_TERRACOTTA, -9555816);
        blocks.put(Material.PURPLE_STAINED_GLASS, 1971273650);
        blocks.put(Material.PURPLE_TERRACOTTA, -9025962);
        blocks.put(Material.PURPUR_BLOCK, -5603670);
        blocks.put(Material.PURPUR_PILLAR, -5471828);
        blocks.put(Material.QUARTZ_BRICKS, -1317410);
        blocks.put(Material.QUARTZ_PILLAR, -1251360);
        blocks.put(Material.RAW_COPPER_BLOCK, -6657457);
        blocks.put(Material.RAW_GOLD_BLOCK, -2184913);
        blocks.put(Material.RAW_IRON_BLOCK, -5863317);
        blocks.put(Material.REDSTONE_BLOCK, -5236475);
        blocks.put(Material.REDSTONE_LAMP, -10537186);
        blocks.put(Material.REDSTONE_ORE, -7573906);
        blocks.put(Material.RED_GLAZED_TERRACOTTA, -4834251);
        blocks.put(Material.RED_MUSHROOM_BLOCK, -3657939);
        blocks.put(Material.RED_NETHER_BRICKS, -12187895);
        blocks.put(Material.RED_SANDSTONE, -4496611);
        blocks.put(Material.RED_STAINED_GLASS, 1972974387);
        blocks.put(Material.RED_TERRACOTTA, -7389905);
        blocks.put(Material.ROOTED_DIRT, -7313331);
        blocks.put(Material.SANDSTONE, -2569316);
        blocks.put(Material.SEA_LANTERN, -5453634);
        blocks.put(Material.SHROOMLIGHT, -945337);
        blocks.put(Material.SLIME_BLOCK, -1267679140);
        blocks.put(Material.SMOOTH_BASALT, -11974578);
        blocks.put(Material.SMOOTH_STONE, -6316129);
        blocks.put(Material.SOUL_SAND, -11452877);
        blocks.put(Material.SOUL_SOIL, -11781585);
        blocks.put(Material.SPONGE, -3882933);
        blocks.put(Material.SPRUCE_LOG, -12900847);
        blocks.put(Material.SPRUCE_PLANKS, -9218767);
        blocks.put(Material.STONE, -8487298);
        blocks.put(Material.STONE_BRICKS, -8750470);
        blocks.put(Material.STRIPPED_ACACIA_LOG, -5284548);
        blocks.put(Material.STRIPPED_BAMBOO_BLOCK, -4084400);
        blocks.put(Material.STRIPPED_BIRCH_LOG, -3821450);
        blocks.put(Material.STRIPPED_DARK_OAK_LOG, -11978460);
        blocks.put(Material.STRIPPED_JUNGLE_LOG, -5536427);
        blocks.put(Material.STRIPPED_MANGROVE_LOG, -8899024);
        blocks.put(Material.STRIPPED_OAK_LOG, -5140394);
        blocks.put(Material.STRIPPED_SPRUCE_LOG, -9151948);
        blocks.put(Material.TERRACOTTA, -6791612);
        blocks.put(Material.TINTED_GLASS, -2094258386);
        blocks.put(Material.TUFF, -9671321);
        blocks.put(Material.WARPED_NYLIUM, -13929883);
        blocks.put(Material.WARPED_PLANKS, -13932189);
        blocks.put(Material.WARPED_WART_BLOCK, -15239047);
        blocks.put(Material.WEATHERED_COPPER, -9660050);
        blocks.put(Material.WEATHERED_CUT_COPPER, -9596564);
        blocks.put(Material.WET_SPONGE, -5524154);
        blocks.put(Material.WHITE_GLAZED_TERRACOTTA, -4401973);
        blocks.put(Material.WHITE_STAINED_GLASS, 1979711487);
        blocks.put(Material.WHITE_TERRACOTTA, -2968927);
        blocks.put(Material.YELLOW_GLAZED_TERRACOTTA, -1392551);
        blocks.put(Material.YELLOW_STAINED_GLASS, 1978000691);
        blocks.put(Material.YELLOW_TERRACOTTA, -4553437);


        if(includeDecaying) {
            // leaves
            blocks.put(Material.BIRCH_LEAVES, -1891022519);
            blocks.put(Material.FLOWERING_AZALEA_LEAVES, -867149519);
            blocks.put(Material.JUNGLE_LEAVES, -1318229148);
            blocks.put(Material.SPRUCE_LEAVES, -1622192305);
            blocks.put(Material.OAK_LEAVES, -1419681439);
            blocks.put(Material.MANGROVE_LEAVES, -747935126);
            blocks.put(Material.DARK_OAK_LEAVES, -1301714327);
            blocks.put(Material.ACACIA_LEAVES, -1823058346);
            blocks.put(Material.AZALEA_LEAVES, -1002088414);

            // coral
            blocks.put(Material.TUBE_CORAL_BLOCK, -13543473);
            blocks.put(Material.HORN_CORAL_BLOCK, -2570174);
            blocks.put(Material.FIRE_CORAL_BLOCK, -6020305);
            blocks.put(Material.BRAIN_CORAL_BLOCK, -3187809);
            blocks.put(Material.BUBBLE_CORAL_BLOCK, -5956958);
        }

        if(includeFalling) {
            // falling blocks
            blocks.put(Material.WHITE_CONCRETE_POWDER, -1907740);
            blocks.put(Material.PURPLE_CONCRETE_POWDER, -8111950);
            blocks.put(Material.PINK_CONCRETE_POWDER, -1730123);
            blocks.put(Material.ORANGE_CONCRETE_POWDER, -1866720);
            blocks.put(Material.MAGENTA_CONCRETE_POWDER, -4107079);
            blocks.put(Material.LIME_CONCRETE_POWDER, -8536790);
            blocks.put(Material.LIGHT_GRAY_CONCRETE_POWDER, -6579308);
            blocks.put(Material.LIGHT_BLUE_CONCRETE_POWDER, -11881003);
            blocks.put(Material.GREEN_CONCRETE_POWDER, -10389715);
            blocks.put(Material.GRAY_CONCRETE_POWDER, -11710123);
            blocks.put(Material.CYAN_CONCRETE_POWDER, -14314339);
            blocks.put(Material.BLACK_CONCRETE_POWDER, -15131872);
            blocks.put(Material.RED_CONCRETE_POWDER, -5753293);
            blocks.put(Material.YELLOW_CONCRETE_POWDER, -1456329);

            blocks.put(Material.GRAVEL, -8093825);
            blocks.put(Material.SAND, -2371677);
            blocks.put(Material.RED_SAND, -4233439);
        }

        loaded = true;
        loadedDec = includeDecaying;
        loadedFal = includeFalling;
    }

}
