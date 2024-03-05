package com.melekdmr.oopproject;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*  User myUser=new User();
        myUser.name="Atil";
        myUser.job="Instructor";


        User newUser=new User();
        newUser.name="Melek";
        newUser.job="Engineer"; */

        User myUser=new User("Melek","computer engineer");
        System.out.println(myUser.information());


        System.out.println(myUser.name);


        MusicianEncapsulation james=new MusicianEncapsulation("james","guitar",50);
      //  System.out.println(james.age);
        james.setName("Alice","hello");
        System.out.println(james.getName());
   //Inheritance
        SuperMusician lars=new SuperMusician("lars","battery",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());


        //Polymorphism
        //static polymorphism
        PolyMathematics math=new PolyMathematics();
        System.out.println(math.sum());
        System.out.println(math.sum(5,3));
        System.out.println(math.sum(5,3,4));

        //Dinamic polymorphism
        AnimalDin_poly animal=new AnimalDin_poly();
        animal.sing();

        Dog_Animal dog=new Dog_Animal();
        dog.test();
        dog.sing();

        Piano myPiano=new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();


    }
}