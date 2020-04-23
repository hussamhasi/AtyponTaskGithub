package com.company;

public class Main {

    public static void main(String[] args) {
	UniversityCourse java=new UniversityCourse("atypon","hussam");
	java.register("hussam");
	System.out.println(java.isRegistered("kekw"));
    }
}
