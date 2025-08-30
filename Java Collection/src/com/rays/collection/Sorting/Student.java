package com.rays.collection.Sorting;

public class Student implements Comparable<Student> {

  public String Name;
  public int RollNo;
  public int Maths;
  public int Physics;
  public int Chemistry;
  
  public Student(String Name, int RollNo, int Maths , int Physics , int Chemistry ) {
	  this.Name = Name;
	  this.RollNo = RollNo;
	  this.Maths = Maths;
	  this.Physics = Physics;
	  this.Chemistry = Chemistry;
	  
  }
   public String toString() {
	   return "Name:" + Name +" "+ "RollNo :" + RollNo +"  "+ "Maths:" + Maths+" "+ "Physics :" + Physics+" "+ "Chemistry :"+ Chemistry ;                
   }

@Override
public int compareTo(Student o) {
	return o.Chemistry - this.Chemistry;

}
  
}
