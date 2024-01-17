/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circleprogramer;

import circleprogramer.circlep.Cylinder;

/**
 *
 * @author suha9
 */
public class Circleprogramer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cylineder cy1 = new Cylineder();
      System.out.println("Radius is"+cy1.getRadius()
  +"Height is" +cy1.getHeight()
     +"Base area is" +cy1.getArea()
    +"Volume is "+ cy1.getVolume());
     
       Cylineder cy2 = new Cylineder();
     System.out.println("Radius is"+cy1.getRadius()
     +"Height is" +cy2.getHeight()
    +"Base area is" +cy2.getArea()
   +"Volume is "+ cy2.getVolume());

      
    }
    
}
