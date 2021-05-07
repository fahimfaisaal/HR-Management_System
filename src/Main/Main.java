package Main;

import Classes.Date;
import Classes.Human.*;
import Enums.Months;
import Interfaces.*;

public class Main {

    public static void main(String[] args) {
    	Human male = new Male("fahim faisal", 22, "Rajshahi");

    	male.setBirthDate();
    	System.out.println(male.toString());
    }
}