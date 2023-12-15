package org.desingpattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user=new User.UserBuilder("Bhaskar","Vanam")
                .age(40)
                .phone("9666187554")
                .address("USA")
                .build();
        System.out.println(user);
    }
}
