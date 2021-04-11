package proxy;

public class ProxyImage implements IImage{

    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if(realImage == null)
            realImage = new RealImage(fileName);
        realImage.displayImage();
    }

    @Override
    public void showData() {
        if(realImage == null)
            realImage = new RealImage(fileName);
        realImage.showData();
    }

    @Override
    public String getName(){
        if(realImage == null)
            realImage = new RealImage(fileName);
        return realImage.getName();
    }
}
