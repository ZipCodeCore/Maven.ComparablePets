package io.zipcoder;

import org.w3c.dom.ls.LSOutput;

public class Llama extends Pets{
    String speak = "";


   public Llama(String speak, String name) {
        super(speak, name);
    }

    public Llama() {
        super();
    }

    //@Override
    public void speak() {
       String speak = "argh";
        System.out.println(speak);
    }
}
