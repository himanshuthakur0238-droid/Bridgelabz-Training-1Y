package com.access.one;

public class Base {

    public void publicMethod() {
        System.out.println("Public Method - Accessible Everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method - Accessible in subclass");
    }

    void defaultMethod() {
        System.out.println("Default Method - Accessible only in same package");
    }

    private void privateMethod() {
        System.out.println("Private Method - Accessible only in same class");
    }

    public void testPrivate() {
        privateMethod();
    }
}
