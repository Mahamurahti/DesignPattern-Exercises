package compositemethod;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class MotherboardMSI implements IComputerPart{

    private ArrayList<IComputerPart> components = new ArrayList<>();

    @Override
    public double getPrice() {
        double price = 119.90;
        for (IComputerPart part : components)
            price += part.getPrice();
        return BigDecimal.valueOf(price).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String getPart() {
        String msg = "(MSI Z390-A)";
        for (IComputerPart part : components)
            msg += " " + part.getPart() + " ";
        return msg;
    }

    public void addComponent(IComputerPart component){
        components.add(component);
    }

    public boolean removeComponent(IComputerPart component){
        for(IComputerPart part : components){
            if(part.getPart().equals(component.getPart())){
                components.remove(component);
                return true;
            }
        }
        return false;
    }

    public IComputerPart getComponent(int index){
        return components.get(index);
    }

    public int getComponentCount(){
        return components.size();
    }
}
