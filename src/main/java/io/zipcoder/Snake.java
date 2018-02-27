package io.zipcoder;

public class Snake extends Pets {



    public Snake(String name) {
        super(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String speak() {
        return "I have seen all the dead seasons, and the great trees and the old elephants, and the rocks that were "
                + "bare and sharp-pointed ere the moss grew.  Art thou still alive, Manling?";
    }
}
