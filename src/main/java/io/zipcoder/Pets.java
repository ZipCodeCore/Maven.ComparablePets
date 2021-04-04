package io.zipcoder;

public class Pets {

    private String speak;
    private String name;

  public Pets(String speak, String name)  {
      this.speak = speak;
      this.name = name;
  }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pets() {

    }


    public void speak(String sound) {
      speak = sound;
    }
}
