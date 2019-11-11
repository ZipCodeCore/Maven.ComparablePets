package io.zipcoder.polymorphism;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.InputStream;

public final class Console {

    private final Scanner userInput;
    private final PrintStream output;


//-----------    constructor    --------------------------
    public Console (InputStream in, PrintStream out) {
        this.userInput = new Scanner(in);
        this.output = out;
    }

//-----------  format the prompt and display it -----------
public void println (String val, Object... args){
    print(val + "\n",args);
}

    public void print (String val, Object... args){
        this.output.format(val,args);
    }

//----------- prompt the user for input and get the string value of the answer ----------
    public String getStringInput (String prompt, Object... args){
        println(prompt,args);
        return this.userInput.nextLine();
    }

//----------- prompt the user for input and get the numeric value of the answer ----------

    public Integer getIntegerInput (String prompt, Object... args){
        String tempInput = getStringInput(prompt,args);
        try{
            Integer integerInput = Integer.parseInt(tempInput);
            return integerInput;
        } catch (NumberFormatException nfe){
            println("[ %s ] is not a valid user input!",tempInput);
            println("Try inputting an integer value!");
            return getIntegerInput(prompt,args);
        }
    }

    public Double getDoubleInput(String prompt, Object... args){
        String tempInput = getStringInput(prompt,args);
        try {
            Double doubleInput = Double.parseDouble(tempInput);
            return doubleInput;
        } catch (NumberFormatException nfe){
            println("[ %s ] is not a valid user input!",tempInput);
            println("Try inputting a number with decimals value!");
            return getDoubleInput(prompt,args);
        }

    }


}
