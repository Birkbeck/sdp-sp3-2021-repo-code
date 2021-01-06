package com.thing;

public class UnnamedTest {
  public static void main(String... st) {
    Module module = UnnamedTest.class.getModule();
    System.out.println("Module: " + module);
    System.out.println("Name: " + module.getName());
    System.out.println("isNamed: " + module.isNamed());
    System.out.println("Descriptor: " + module.getDescriptor());
  }
}