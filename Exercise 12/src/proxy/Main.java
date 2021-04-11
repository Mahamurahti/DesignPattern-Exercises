package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static String PATH = System.getProperty("user.dir") + "\\Exercise 12\\res\\";

    public static void main(String[] args){
        List<IImage> imageList = new ArrayList<>();

        imageList.add(new ProxyImage(PATH + "abstract_img_hiresolution.jpg"));
        imageList.add(new ProxyImage(PATH + "happy_doggo.jpg"));
        imageList.add(new ProxyImage(PATH + "landscape_photo_01.jpg"));
        imageList.add(new ProxyImage(PATH + "safety_cat.jpg"));
        imageList.add(new ProxyImage(PATH + "house_blueprint.jpg"));

        Scanner reader = new Scanner(System.in);
        char select;
        do{
            System.out.println("\n\t\t\t1. Show data (files in order)");    // Shows data in the 'res' folder
            System.out.println("\t\t\t2. Display an image");                // Prompts the user to select an image
            System.out.println("\t\t\t3. Exit");
            System.out.print("\n\n");
            try{ select = reader.nextLine().charAt(0); }
            catch (Exception e){ select = '4'; }

            switch (select) {
                case '1':
                    for (IImage image : imageList)
                        image.showData();
                    break;
                case '2':
                    System.out.println("Which image you want to display:");  // User needs to choose an image

                    for (int i = 0; i < imageList.size(); i++)
                        System.out.println((i + 1) + ". " + imageList.get(i).getName());

                    try{
                        select = reader.nextLine().charAt(0);
                        imageList.get(Integer.parseInt(String.valueOf(select)) - 1).displayImage();
                    }catch (Exception e){ System.out.println("Something went wrong (unreadable input or file not found)"); }

                    select = '4';
                    break;
                case '3':
                    break;
            }
        }while (select != '3');
        System.exit(1);
    }
}
