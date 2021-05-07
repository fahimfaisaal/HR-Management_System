package Main;

import Interfaces.*;
import Classes.*;

public class Main {

    public static void main(String[] args) {
    	Human male = new Male("fahim faisal", 22, "Rajshahi");

    	male.setBirthDate("19 Jan ");
		System.out.println(male.toString());
    }
}
