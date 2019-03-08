# Project 2

  This project consisted of two problems: solving a problem and learning about abstract classes and methods.
  Below is a detailed analysis of the problem solving aproach and what was learned about abstract classes.
  This project was begun and completed on March 7th 2019, over the course of roughly two hours.
# Outline
  
    Classes:
    Main
    MesoAbstract
    MesoInherit
    MesoStation
    
    Methods:
    Main
      +main(String[] args)
    MesoAbstract
      +calAverage():int[]
      +letterAverage():char
    MesoInherit
      +calAverage:int[]
      +letterAverage():char
    MesoStation
      +getStID():String
      
    Fields:
    Main
     
    MesoAbstract
      +char[] st
    MesoInherit
      +char[] st
    MesoStation
      -String StID
      
    Inheritance
    MesoInherit extends MesoAbstract
    
  With this outline drawn out, we can begin to see what needs to be completed for the project. As both Main and MesoStation were
  provided, this documentation will focus on MesoAbstract and MesoInherit.
  
 # MesoAbstract
  
  An abstract class can contain both abstract and concrete methods, unlike an interface. As such, there is a decision to be made
  as to which methods to implement and which to keep abstract. As the main focus of the project was learning about abstract
  classes, I decided to keep all the methods within MesoAbstract abstract.
  
    public abstract class MesoAbstract{
      char[] st;
      public abstract int[] calAverage();
      public abstract char letterAverage();
    }
  
  As you can see, this is a very short class since all the methods have no implementation (abstract). A more detailled analysis of
  the field and two methods is contained within the source code, however a summary follows:
    
    char[] st;
  
  This char array is named st in short for station, as a MesoAbstract subclass will take a MesoStation as the only input for
  the constructor. It is used to represent the string StID from MesoStation as an array of characters.
  
    public abstract int[] calAverage();
  
  This method will take the internal st char array and calculate the average ascii value of the chars.
  
    public abstract char letterAverage();
    
  This method will take calAverage[0], the rounded average ascii value, and return the character represented by it.
  
 # MesoInherit
  
  MesoInherit is a subclass of MesoAbstract. This being the case, it must implement all the abstract methods found within MesoAbstract.
  In the scope of this project, it would be very easy and possibly simpler to begin with MesoInherit and remove the 
  unnecessary MesoAbstract, however these projects are not about simplicity and real-world implementation, but rather serve
  as examples for concepts which will be easier to implement in these simple environments.
  
    public class MesoInherit extends MesoAbstract{
      char[] st = new char[3]
      public int[] calAverage{
      ...
      }
      public char letterAverage(){
      ...
      }
    }
  As you can see, MesoInherit's only function is to implement MesoAbstract.
  
    char st = new char[3];
    
  As per documentation, each MesoStation will have an ID of four characters. If the length were unknown, then this statement
  would be reduced to a declaration, and the array would be initialized within the constructor where the length of ID would
  be known.
  
    public int[] calAverage(){...}
  
  This method overrides and implements the same method found within MesoAbstract. It operates on the st array and returns an
  int array formatted to the project specification. This format can be found within the source code.
  
    public char letterAverage(){...}
  
  This method takes calAverage()[0], which representes the average ascii value rounded to the nearest whole number, and returns
  the char associated with that value.
