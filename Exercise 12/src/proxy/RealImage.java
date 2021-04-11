package proxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RealImage implements IImage {

    private final String fileName;
    private final String name;
    private BufferedImage image;
    private boolean loaded = false;

    public RealImage(String fileName){
        this.fileName = fileName;
        String[] splitted = fileName.split("\\\\");     // Get the last part of the path (name)
        this.name = splitted[splitted.length - 1];
    }

    private void loadImageFromDisk(){
        System.out.println("Loading " + fileName);
        try{
            final long startTime = System.currentTimeMillis();
            image = ImageIO.read(new File(fileName));       // Load the image
            final long endTime = System.currentTimeMillis();

            System.out.println("Loaded in: " + ((endTime - startTime) / 1000F) + " sec");
            loaded = true;
        }catch (Exception e){
            e.printStackTrace();
            loaded = false;
        }
    }

    @Override
    public void displayImage() {
        if(!loaded)
            loadImageFromDisk();                            // Load the image if necessary
        JLabel label = new JLabel(new ImageIcon(image));    // Use Swing to display the image
        JPanel panel = new JPanel();
        panel.add(label);
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(image.getWidth(), image.getHeight()));
        frame.add(panel);
        frame.setVisible(true);
        System.out.println("Displaying " + fileName);
    }

    @Override
    public void showData() {
        System.out.printf("Name: %32s, path: %100s \n", name, fileName);
    }

    @Override
    public String getName(){
        return this.name;
    }
}
