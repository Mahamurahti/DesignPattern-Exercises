package abstractmethod;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args){
        IFactory factory;

        Coder coder = new Coder("Jasper", "coder");

        factory = readFactoryFromFile("adidasFactory");

        coder.setHat(factory.createHat());
        coder.setShirt(factory.createShirt());
        coder.setPants(factory.createPants());
        coder.setShoes(factory.createShoes());

        System.out.println("\n\n" + coder.getName() + "-" + coder.getOccupation() + " is a student and he's wearing: \n" +
                            coder.getHat() + ", \n" + coder.getShirt() + ", \n" + coder.getPants() + ", \n" + coder.getShoes());

        System.out.println("\n\nAfter a three year time skip...");

        factory = readFactoryFromFile("bossFactory");

        coder.setHat(factory.createHat());
        coder.setShirt(factory.createShirt());
        coder.setPants(factory.createPants());
        coder.setShoes(factory.createShoes());

        System.out.println("\n\n" + coder.getName() + "-" + coder.getOccupation() + " is now working and he's wearing: \n" +
                coder.getHat() + ", \n" + coder.getShirt() + ", \n" + coder.getPants() + ", \n" + coder.getShoes());

        System.out.println();
    }

    private static IFactory readFactoryFromFile(String factoryName){
        IFactory factory = null;
        Class c;
        Properties properties = new Properties();
        try{
            properties.load(new FileInputStream("Exercise 2/src/abstractmethod/factory.properties"));
            c = Class.forName(properties.getProperty(factoryName));
            factory = (IFactory) c.getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }
}
