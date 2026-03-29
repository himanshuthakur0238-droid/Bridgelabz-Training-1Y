package com.exceptionhandling;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomExceptionPractice1 {
    static void ageCheck(int a)throws InvalidAgeException{
        if(a<18){
            throw new InvalidAgeException("invalid age");
        }
        System.out.println("valid age");
    }
    public static void main(String[]args){
        try{
            ageCheck(100);
        }
        catch (InvalidAgeException e){
            System.out.println(e);

        }
    }
}
