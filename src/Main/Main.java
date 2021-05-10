package Main;

import Classes.*;
import Enums.Gender;
import Interfaces.*;

public class Main {

    public static void main(String[] args) {
        Employ employ = new Employ("fahim faisal", 22, Gender.MALE);

        employ.getResume().setPhone("01721494068");
        employ.getResume().setSkillsByUser();
        employ.getResume().getAllSkills();
        System.out.println(employ.toString());
    }
}