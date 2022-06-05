package Image_Handling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Intro {
    // java have two classes : -
    // java.awt.Image
    // java.awt.image.BufferedImage

    // here awt contains all the class related to the user interface and graphics

    public static void main(String[] args) {
        int width = 705;
        int height = 1122;

        BufferedImage image = null;
        image = readImage(width, height, image);
        writeImage(image);

    }

    public static BufferedImage readImage(int width, int height, BufferedImage image) {
        File img = new File("D:\\dsa in java\\img.jped");
        image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        try {
            image = ImageIO.read(img);
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println(image);
        return image;
    }

    public static void writeImage(BufferedImage image) {
        File output = new File("D:\\dsa in java\\Image_Handling\\output.jped");
        try {
            ImageIO.write(image, "jped", output);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("the image has been added");

    }

}
