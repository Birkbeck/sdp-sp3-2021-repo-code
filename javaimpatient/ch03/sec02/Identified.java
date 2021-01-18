package ch03.sec02;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); } 
}