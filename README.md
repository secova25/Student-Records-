# Student Records
## Origin of the project
    This project was constructed to discuss the purpose of Abstract Factory. 
  Abstract factory is, “intent: Provide an interface for creating families of 
  related or dependent objects without specifying their concrete classes (Nahar 
  and Sakib p1)”.

## Download and Startup
    At this moment in time there are two versions. The first version was contructed 
  in Eclipes as a maven project. This project can be found in a folder called JAVA 
  CODE. 
  Be advice you must have Eclipse installed on your computer, java and maven 
  setup properly. 
  If you need help please visit: https://www.guru99.com/install-eclipse-java.html .
  
  ### Setup For JAVA
  - Once you are all setup use the url repository found on the right top corner. 
  There should be something that states Code. 
  - Click on github and copy the Repository use either visual studio or any command 
  line you are accustomed to use. 
  - You must connect to getbash and use this code:  
  git clone https://github.com/secova25/Student-Records-.git 
  - Afterwards just place the project in Eclipse and run it. 
  
  ### HTML/CSS/JAVASCRIPT setup
  - If you are instrested in version two just copy the github depository.
  - Follow the same step two in the previous procedures.
  - Open the folder called Code and Select the folder Student Records.

## Java version
    For an example of Abstract factory we constructed  an interface called credit, 
 where the methods, that are in place into the interface, are simple enough for any 
 class to construct. For this assignment we constructed two different classes. The 
 first class is High School class that will contain to list ArrayList A and 
 ArrayList B and the seond class College will contain the similar ArrayList A and 
 ArrayList B. For this porject when we want to call student A and then we cliecked 
 the view buttion it will show all the creadits that were stored in both classes. 
 Also with in each class, we constructed in inner class called Node. The inner 
 class Node is, use to store in the name of the student, what class they took and 
 the credit hour they received. Now for the most part High School credits and 
 College credits values are different. However, in this javafx project, we allow 
 any value that is greater than zero to be placed into credit. 

   ### Methods that were Constructed.
   - add() method that was inherited in both College and HighSchool class will 
     allows us to add a Node to an existing ArrayList. 
  - delete () method that removes a credit, that already exist on either student A 
     or student B and its possible to remove it by determining a student’s
    name, there are only two students A or B, and class name. 
    This will delete specific course from either student A or student B. 
  
 ### UML Design and Discription
 What you see below is a construction of how we plan a connection between each 
 class.
 
  - JavaFXTemplate.java is the main power house that connects all classes 
    together.
  - credit.java is the interface used as an abstract class that will host two 
    methods
    
             add() addes the credit. 
             delete() removes an existing credit.
             view() views an existing credits of a specific student. 
   - College.java and HighSchool.java both extends credit.java methods. 
   - inner class Node although this was not in the final version the inner class
      was shown since the inner class was named the same and stored the same 
      varriables.
    
 ![UML Classes](/Documents/umlClass.png)
    
 ## HTML/CSS/PHP/JAVASCRIPT version
  Following with similar abstract classes we constructed this version with javafx 
  in mind. What we have constructed so far is a prototype of what our website 
  should look like. 
