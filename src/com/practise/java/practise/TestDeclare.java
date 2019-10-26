package com.practise.java.practise;

 public enum TestDeclare {
 MR("Mr."), MRS("Mrs."), MS("Ms.");
 private final String title;
 private TestDeclare(String t) { title = t; }
 public String format(String last, String first) {
 return title + " " + first + " " + last;
 }
 public static void main(String[] args) {
 System.out.println(TestDeclare.MR.format("Doe", "John"));
 }
 }