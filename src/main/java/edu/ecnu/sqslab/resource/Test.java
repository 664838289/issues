package edu.ecnu.sqslab.resource;

/**
 * Created by user on 2017/10/25.
 */
interface  A{
     void print();
}
public class Test implements A{
    public void print(){
        System.out.print("test");
    }
    public static void main(String args[]){
        A a = new Test();
        a.print();
    }
}
