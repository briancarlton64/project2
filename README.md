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
  
