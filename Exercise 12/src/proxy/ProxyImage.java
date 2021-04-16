package proxy;

public class ProxyImage implements IImage{

    private final String fileName;
    private final String name;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
        String[] splitted = fileName.split("\\\\");     // Get the last part of the path (name)
        this.name = splitted[splitted.length - 1];
    }

    @Override
    public void displayImage() {
        if(realImage == null)
            realImage = new RealImage(fileName, name);
        realImage.displayImage();
    }

    @Override
    public void showData() {
        if(realImage != null)
            realImage.showData();
        else
            System.out.printf("Name: %32s, path: %100s \n", name, fileName);
    }

    @Override
    public String getName(){
        if(realImage != null)
            return realImage.getName();
        return name;
    }
}
