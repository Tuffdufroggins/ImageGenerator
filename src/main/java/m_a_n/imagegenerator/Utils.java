package m_a_n.imagegenerator;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

    public static boolean decaying = false;
    public static boolean falling = false;

    public static boolean drawImage(String imagePath, int x, int y, int z, World world, int xDir, int yDir, int zDir) {

        File mainDir = new File(Main.getPlugin().getDataFolder().getPath());
        if(!mainDir.exists()) {
            mainDir.mkdir();
        }
        File file = new File(mainDir, imagePath);

        if(!file.exists())
            return false;

        BufferedImage image = null;
        try {
            image = convertToARGB(ImageIO.read(file));
        } catch (IOException e) {
            return false;
        }

        for (int row = 0; row < image.getHeight(); row++) {
            for (int col = 0; col < image.getWidth(); col++) {
                int rgb = image.getRGB(col, row);

                int zIndex = col;
                if(xDir != 0) zIndex = row;

                double tempX = x + (xDir*col);
                double tempY = y + (yDir*row);
                double tempZ = z + (zDir*zIndex);

                Location loc = new Location(world, tempX, tempY, tempZ);
                loc.getBlock().setType(getColoredMaterial(rgb));
            }
        }

        return true;
    }

    public static Material getColoredMaterial(int color) {
        Material closestMat = Material.AIR;

        double closestDist = -1;
        for(Material m : Blocks.getBlocks(decaying, falling).keySet()) {
            double tempDist = getColorDist(color, Blocks.getBlocks(decaying, falling).get(m));
            if(tempDist < closestDist || closestDist == -1) {
                closestMat = m;
                closestDist = tempDist;
            }
        }

        return closestMat;
    }

    public static double getColorDist(int color1, int color2) {
        float alpha = (color1 >> 24 & 0xFF) / 255.0F;
        float red = (color1 >> 16 & 0xFF) / 255.0F;
        float green = (color1 >> 8 & 0xFF) / 255.0F;
        float blue = (color1 & 0xFF) / 255.0F;

        float alpha2 = (color2 >> 24 & 0xFF) / 255.0F;
        float red2 = (color2 >> 16 & 0xFF) / 255.0F;
        float green2 = (color2 >> 8 & 0xFF) / 255.0F;
        float blue2 = (color2 & 0xFF) / 255.0F;

        float alphaDist = alpha - alpha2;
        float redDist = red - red2;
        float greenDist = green - green2;
        float blueDist = blue - blue2;

        return Math.sqrt(alphaDist * alphaDist + redDist * redDist + greenDist * greenDist + blueDist * blueDist);
    }

    public static BufferedImage convertToARGB(BufferedImage image)
    {
        BufferedImage newImage = new BufferedImage(
                image.getWidth(), image.getHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = newImage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return newImage;
    }

}
