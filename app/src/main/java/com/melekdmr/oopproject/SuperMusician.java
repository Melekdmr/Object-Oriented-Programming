package com.melekdmr.oopproject;

public class SuperMusician extends MusicianEncapsulation {

    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);

    }

    public String sing(){
        return  "Nothing Else Matters";
    }
}
