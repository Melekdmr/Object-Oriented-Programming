package com.melekdmr.oopproject;

public class MusicianEncapsulation {
    private String name;
   private  String instrument;
    private  int age;

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }



    public MusicianEncapsulation(String name, String instrument, int age){
        this.name=name;
        this.instrument=instrument;
        this.age=age;
    }

    public void setName(String name,String password) {
        if(password.matches("hello"))
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age,String password) {
        if(password.matches("Melek"))
        this.age = age;
    }
}
