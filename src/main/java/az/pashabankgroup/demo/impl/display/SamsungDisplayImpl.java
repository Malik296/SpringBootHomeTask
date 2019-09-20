package az.pashabankgroup.demo.impl.display;


import az.pashabankgroup.demo.interfaces.Display;

public class SamsungDisplayImpl implements Display {

    @Override
    public String displayInfo() {
        return "Samsung: FullHD+";
    }
}
