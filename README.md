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
  
  #MesoAbstract
  
  An abstract class can contain both abstract and concrete methods, unlike an interface. As such, there is a decision to be made
  as to which methods to implement and which to keep abstract. As the main focus of the project was learning about abstract
  classes, I decided to keep all the methods within MesoAbstract abstract.
  
  
