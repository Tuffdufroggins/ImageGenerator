import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class Main {

    public static void main(String args[]) {

        String path = "C:\\Users\\*****\\Desktop\\tex";

        File mainDir = new File(path);

        if (mainDir.exists() && mainDir.listFiles() != null) {
            for (File file : mainDir.listFiles()) {
                BufferedImage image = null;
                try {
                    image = ImageIO.read(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (image != null && !file.getName().contains("_stage") && !file.getName().contains("_door") && !file.getName().contains("_top") && !file.getName().contains("_side") && !file.getName().contains("_bottom") && !file.getName().contains("_back") && !file.getName().contains("_front")) {

                    float colorSumR = 0;
                    float colorSumG = 0;
                    float colorSumA = 0;
                    float colorSumB = 0;

                    for (int row = 0; row < image.getHeight(); row++) {
                        for (int col = 0; col < image.getWidth(); col++) {
                            int rgb = image.getRGB(col, row);

                            colorSumA += (rgb >> 24 & 0xFF) / 255.0F;
                            colorSumR += (rgb >> 16 & 0xFF) / 255.0F;
                            colorSumG += (rgb >> 8 & 0xFF) / 255.0F;
                            colorSumB += (rgb & 0xFF) / 255.0F;

                        }
                    }

                    int pixels = image.getHeight()*image.getWidth();
                    System.out.println("blocks.put(Material." + (file.getName().toUpperCase(Locale.ROOT).replaceAll(".PNG", "")) + ", " + new Color(colorSumR/pixels, colorSumG/pixels, colorSumB/pixels, colorSumA/pixels).getRGB() + ");");
                }
            }
        }
    }

}
