/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circleprogramer;

/**
 *
 * @author suha9
 */
public class Cylineder extends circlep {
 private double height;
  
public Cylineder(){this.height=1.0;}
public Cylineder(double radius ){super(radius);}
public  Cylineder(double radius,double height,String color){
    super(radius);
    this.height=height;
}

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    } 
    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius() * (getRadius() + height);}

       public double getVolume(){
        return getArea()*height;}
       
   @Override       
   public String toString(){
     
   return "Cylinder information: base radius ="+radius+",height="+height+
       ",base area ="+super.getArea()+"surface area="+getArea()+"volume ="+getVolume();
   }
}
             


   
   

   


//         



