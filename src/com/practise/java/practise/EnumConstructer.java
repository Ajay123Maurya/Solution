package com.practise.java.practise;

 public enum EnumConstructer {
 MR("Mr."), MRS("Mrs."), MS("Ms.");
 private final String title;
 private EnumConstructer(String t) { title = t; }
 public String format(String last, String first) {
 return title + " " + first + " " + last;
 }
 public static void main(String[] args) {
 System.out.println(EnumConstructer.MR.format("Doe", "John"));
 System.out.println(EnumConstructer.MR.format("ajay", "John"));
 }
 }