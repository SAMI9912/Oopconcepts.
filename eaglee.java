/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author fa20-bse-024
 */
class  eaglee  {
        public  void  fly()  {
        System.out.println("The bird is flying.");
        }
        public  void  fly(int height)  {
        System.out.println("The bird is flying "  + height +  " feet high.");
        }
        public  void  fly(String name,  int height)  {
        System.out.println("The "  + name +  " is flying "  + height +  " feet high.");
        }
}

class  TestBirdStatic  {
        public  static  void  main(String[] args)  {
        eaglee myeaglee =  new eaglee();
        myeaglee.fly();
        myeaglee.fly(10000);
        myeaglee.fly("eagle", 10000);
}
}