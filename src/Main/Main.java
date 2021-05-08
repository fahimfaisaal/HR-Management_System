package Main;

import Classes.*;
import Enums.Gender;
import Interfaces.*;

public class Main {

    public static void main(String[] args) {
        Employ employ = new Employ("fahim faisal", 22, Gender.FEMALE);

        employ.setRelationshipByUser();
        System.out.println(employ.toString());
    }
}