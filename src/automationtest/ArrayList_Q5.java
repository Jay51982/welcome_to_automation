package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> softwareList = new ArrayList<>();
        softwareList.add("Scrum");
        softwareList.add("Java");
        softwareList.add("Jira");
        softwareList.add("Selenium");
        softwareList.add("Cucumber");
        softwareList.add("Postman");
        softwareList.add("Rest Assured");

        for(String name : softwareList){
            System.out.println(name);
        }
    }
}
