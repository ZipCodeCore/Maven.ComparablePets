package io.zipcoder;

public class Bird extends Pet {

    public Bird()
    {

    }

    public Bird(String name)
    {
        super(name);
    }

    public String speak()
    {
        return "chirp";
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
