package Main;

import Classes.*;
import Classes.Date;
import Classes.Education.Certificate;
import Enums.Gender;
import Interfaces.*;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employ employ = new Employ("fahim", 22, Gender.MALE);

       employ = employ.setBirthDateByUser().setRelationshipByUser().setProfessionByUser();

        employ.getResume().setLanguageByUser().setSkillsByUser().getSocialLinks().setSocialByUser();
        employ.getResume().getEducation().setCertificatesByUser();

        System.out.println(employ.getResume().getSocialLinks().toString());

        LinkedList<Certificate> certificates = employ.getResume().getEducation().getCertificates();

        for (Certificate certificate: certificates) {
            System.out.println(certificate.getCertificate());
            System.out.println(certificate.getResultSheet());
        }

        System.out.println(employ.toString());
    }
}
