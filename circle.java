/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circleprogramer;

/**
 *
 * @author suha9
 */
 class circlep {
  double radius ; 
  private String color;
   
   
   public circlep(){this.radius=1.0;this.color="red";}
   public circlep(double radius){this.radius=radius;}
   public circlep(double radius,String color){this.radius=radius;this.color=color;}

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
   public String toString(){
       return"radius="+radius+"color="+color;}
   public double getArea(){return radius*radius*Math.PI;}
   public class Cylinder{}
   public class TestCylinder{}
  
   
   }

   
