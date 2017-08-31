import java.io.*;// Required to access file
import java.util.Scanner;//Required for input
import java.text.NumberFormat; // Required for getCurrencyInstance() and getPercentInstance() 
import java.text.DecimalFormat; // Required for DecimalFormat() 
//Parent is a subclass of Driver
public class Parent {
		private int test=30;
		public int test1=40;
		protected int test2=50;
		final int TEST3=70;
		static int test4=80;
		
		  int creditHrs;         // number of semester hours earned
	      double qualityPts;     // number of quality points earned
	      double gpa;            // grade point (quality point) average
	      String name;			// name of student
	      
	      
	      String myname;
	      String person;
	      int grade;
	      
	      
	      public Parent(int TEST3)//first constructor-special method called when object is instantiated
	      {
	    	  int grade= TEST3;
	    	  
	      }
	      public Parent(){//second constructor- method oveloading-same name different arguments
	    	  
	      }
	      //package-private(no explicit modifier)-it is visible only within its own package
	      class NoPurpose{
	    	  
	      }
		//has class scope but method test overrides class test
		public void printLocalTest(){
			int test=20;
			System.out.println("LocalTest: "+test);
		}
		//has class scope and is public-can be accessed by objects of 
		public void printClassTest(){
			System.out.println("ClassTest: "+test);
			Parent d= new Parent();
			d.printPrivateTest();
		}
		//has class scope and is private-can be accessed by object of the same class
		private void printPrivateTest(){
			System.out.println("PrivateTest: "+test1);
			
		}
		//has class scope but method test overrides class test
		public void printParamTest(int test){
			System.out.println("ParamTest: "+test);
		}
		//has class scope and is protected- can be accessed by any class in the same package and
		//by subclasses even if they are even if they are in other packages
		protected void printProtectedTest() {
				System.out.println("ProtectedTest: "+TEST3);
		}
				public String toString(){
					return("StringTest:"+test4);
				}
		//has class scope and is protected- can be accessed by any class in the same package and
		//by subclasses even if they are even if they are in other packages
		protected void printFinalTest(){
			System.out.println("FinalTest: "+grade);
		}
		public String Getter(){//Accessor- method that returns the value of the private member variable
			return person;
		}
		public void Setter(String myname){//Mutator- method that controls changes of variables
			person=myname;
		}
		//for loop
		public void forloop(){
			for(int i=0;i<3;i++){
				System.out.println("This is loop "+i);
			}
			}//entry check
		public void whileloop(){
			int i=0;
			while(i<3){
				System.out.println("This is loop "+i);
				i++;
			}
			
		}//exit check
		public void dowhileloop(){
			int i=0;
			do{
				System.out.println("This is loop "+i);
				i++;
			}while(i<3);
			
		}
		//nested loop
		public void nestedloop(){
			for(int i=0;i<4;i++){// rows-outer loop
				for(int j=0;j<10;j++){// columns-inner loop
					System.out.print("*");
				}
				System.out.println();
			}
		}
			//if-then statement
		public void ifthen(){
			  int value1 = 1;
		        int value2 = 2;
		      //equality,relational, and conditional operators
		        if(value1 == value2)
		            System.out.println("value1 == value2");
		        //Control Flow Statement
		        if(value1 != value2)
		            System.out.println("value1 != value2");
		        if(value1 > value2)
		            System.out.println("value1 > value2");
		        if(value1 < value2)
		            System.out.println("value1 < value2");
		        if(value1 <= value2)
		            System.out.println("value1 <= value2");
		        if((value1 == 1) && (value2 == 2))
		            System.out.println("value1 is 1 AND value2 is 2");
		        if((value1 == 1) || (value2 == 1))
		            System.out.println("value1 is 1 OR value2 is 1");
		    }
			//switch statement
		public void switchstatement(){
			   int testscore = 76;
		        String grade;
		        //Control Flow Statement
		        switch(testscore/10){
		        case 9: grade="A";
		            break;
		        case 8: grade= "B";
		            break;
		        case 7: grade="C";
		            break;
		        case 6: grade="D";
		            break;
		            
		        default:  grade = "F";
		        }
		        System.out.println("Grade = " + grade);
		    }
		//if-then-statement
		public void ifthenelse(){

	        int testscore = 76;
	        char grade;
	        //Control Flow Statement
	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
		
		}
		//(extends)Polymorphism and Single Inheritance and (implements) Interface
		abstract class Child extends Parent implements Myinterface{
			//abstraction hides irrelevant details from user
			//partial abstraction- some methods have body and some don't
			public Child(){
				//sets parent constructor grade=76
				super(76);
				
			}
			public void method1(){
				System.out.println("implementation of method 1");
			}
			//concrete method
			public void method2(){
				System.out.println("implementation of method 2");
			}
			//abstact method
			abstract public void NoBraceMethod();
}
		interface Myinterface{
			//full abstraction
			//only abstract methods which means methods without body
			public void method1();
			public void method2();
			
		}
		public void studentinfo(){
		try{//block is from brace to brace
		     // Set up scanner to input file
				Scanner inFile = new Scanner(new File("students.dat"));
	         
				System.out.println ("\n   Students on Academic Warning\n");
	        
	         // Process the input file, one token at a time
	         while (inFile.hasNext())
	         {
	            // Get the credit hours and quality points and
	            // determine if the student is on warning. If so,
	            // display the student's name.
					name = inFile.next();
					creditHrs = Integer.parseInt(inFile.next());
					qualityPts = Double.parseDouble(inFile.next());
			
				//  Insert gpa calculation 
					gpa=qualityPts/creditHrs;
				//	and statement to determine if the student name is listed.
					if(gpa<2)
						System.out.println(name);
					
	         }
				inFile.close();
			 //insert catch statements
	   }
	      //I will test for this by changing the name of the input file
	   catch(FileNotFoundException e)
		{
			System.out.println ("   File not found");
		}
	      //I will test for this by changing the data in the input file so that there will be a datatype mismatch
		catch(NumberFormatException e)
		{
			System.out.println ("   array index too large");
		}
		}
		public void StringTest(){
			 String college = new String ("GeorgeMason University");
			 String town = new String ("Fairfax, VA"); // part (a)
			 int stringLength;
			 String change1, change2, change3,change4,change5;
			 stringLength=college.length(); // length of string
			 System.out.println (college + " contains " + stringLength + " characters.");
			 change1 =college.toUpperCase(); // uppercase change
			 change1 =college.toLowerCase(); // lowercase change
			 change2 = college.replace('o','*') ;//replace o with *
			 change3 = college.concat(" "+town); //add town name to college name
			 System.out.println(college.substring(11));//GeorgeMason
			 System.out.println(college.substring(0,11));//University
			 //calling successive methods of the String class
			 System.out.println("GMU begins with "+college.toUpperCase().charAt(0));
			 System.out.println ("The final string is " + change3);
		}
		public void CompareStrings(){
			String s1, s2;
			boolean b=true;
		      Scanner in = new Scanner(System.in);
		 
		      System.out.println("Enter the first string");
		      s1 = in.nextLine();
		 
		      System.out.println("Enter the second string");
		      s2 = in.nextLine();
		      if(b=true)
		      if ( s1.compareTo(s2) > 0 )
		         System.out.println("First string is greater than second.");
		      else if ( s1.compareTo(s2) < 0 )
		         System.out.println("First string is smaller than second.");
		      else   
		         System.out.println("Both strings are equal.");
		}
		protected void TwoDimArray(){
			String[][] names = {
		            {"Mr. ", "Mrs. ", "Ms. "},
		            {"Smith", "Jones"}
		        };
		        // Mr. Smith
		        System.out.println(names[0][0] + names[1][0]);
		        // Ms. Jones
		        System.out.println(names[0][2] + names[1][1]);
		        //length of 2d array
		        System.out.println(names.length);
		}
		protected void OneDimArray(){
			// declares an array of integers
	        int[] anArray;

	        // allocates memory for 10 integers
	        anArray = new int[10];
	           
	        // initialize first element
	        anArray[0] = 100;
	        // initialize second element
	        anArray[1] = 200;
	        // and so forth
	        //shortcut syntax to create and initialize array
	        int[] anArray2 = { 100, 200};
	        //output both 1d arrays
	        System.out.println("Element at index 0: " + anArray[0]);
	        System.out.println("Element at index 0: " + anArray2[0]);
	        
			 
		}
		//Overriden method
		    public void cry(){
		        System.out.println("waaah ");
		    }
		    //inheritance- Object of AsianKid extends Parent
			public void kid() {
				Parent kid = new AsianKid();
		        kid.cry();
				
			}
			//inheritance
			class AsianKid extends Parent{
			    public void sniff(){
			        System.out.println("sniff ");
			    }
			 
			    public void cry(){//Overriding- Same method name and parameters
			        System.out.println("waaah");
			    
			   }
			
			}
			//set java compiler settings to 1.5 complaince level or higher
			//enum type is a special data type that enables
			//for a variable to be a set of predefined constants
			public enum Day {
				//Because they are constants, 
				//the names of an enum type's fields are in uppercase letters.
			    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
			    THURSDAY, FRIDAY, SATURDAY 
			}
			public class EnumTest {
			    Day day;
			    
			    public EnumTest(Day day) {
			        this.day = day;
			    }
			    
			    public void WeekDay() {
			        switch (day) {
			            case MONDAY:
			                System.out.println("Mondays are bad.");
			                break;
			                    
			            case FRIDAY:
			                System.out.println("Fridays are better.");
			                break;
			                         
			            case SATURDAY: case SUNDAY:
			                System.out.println("Weekends are best.");
			                break;
			                        
			            default:
			                System.out.println("Midweek days are so-so.");
			                break;
			        }
			    }
			}
			//static method belongs to class rather than object of a class
			public void format(){
		    	  final double OUNCES_PER_POUND = 16.0;
		 	      double pricePerPound; // price per pound
		 	      double weightOunces; // weight in ounces
		 	      double weight; // weight in pounds
		 	      double totalPrice; // total price for the item
		    Scanner scan = new Scanner(System.in);
		    // Declare money as a NumberFormat object and use the
		    // getCurrencyInstance method to assign it a value
		    NumberFormat money= NumberFormat.getCurrencyInstance();

		    // Declare fmt as a DecimalFormat object and instantiate
		    // it to format numbers with at least one digit to the left of the
		    // decimal and the fractional part rounded to two digits.
		    DecimalFormat fmt = new DecimalFormat("0.##");
		    // prompt the user and read in each input
		    System.out.println ("Welcome to the Whole Foods Deli!!\n ");

		    System.out.print ("Enter the price per pound of your item: ");
		    pricePerPound = scan.nextDouble();
		    System.out.print ("Enter the weight (ounces): ");
		    weightOunces = scan.nextDouble();
		    // Convert ounces to pounds and compute the total price
		    weight = weightOunces / OUNCES_PER_POUND;
		    totalPrice = pricePerPound * weight;

		    // Print the label using the formatting objects
		    // fmt for the weight in pounds and money for the prices
		    // \ n is a return escape secquence
		    System.out.println("\n***** Whole Foods *****");
		    System.out.println("\nUnit Price: " + money.format(pricePerPound) + " per pound");
		    System.out.println("Weight: " + fmt.format(weight) + " pounds");
		    System.out.println("\nTOTAL: " + money.format(totalPrice) );
		    
				}
			
}

