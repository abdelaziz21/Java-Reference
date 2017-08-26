import javax.swing.*;

//Abdelaziz[************@gmail.com]
/**
* Overview: Use classes and methods to display output
* Input: n/a
* Output: n/a
* Variables:many
* Plan:
* 1.declare variables
* 2.call methods
* 3.ask for input
* 4.print output
* 
*@version: 1.0 April 25, 2017 (today's date)
*@author: Abdelaziz
*/
	public class Driver{
		
		//the program starts with the main method and code is executed chronologically
	public static void main(String[]args){
		int test=10;
		
		//Crete new object of Parent class named scope
		Parent scope= new Parent();
		//Crete new object of Parent class named loop
		Parent loop= new Parent();
		//Crete new object of Parent class named flow
		Parent flow= new Parent();
		//Crete new object of Parent class named String
		Parent string= new Parent();
		//Crete new object of Parent class named array
		Parent array= new Parent();
		//Crete new object of Parent class named call
		Parent call= new Parent();
		//Crete new object of Parent class named method
		Parent tool= new Parent();
		//Crete new object of Parent class named method
		Parent media= new Parent();
		//System.out object is calling the println method for output
		System.out.println("main: test="+test);
		//scope object method calls
		scope.printLocalTest();
		scope.printClassTest();
		scope.printParamTest(60);
		scope.printProtectedTest();
		scope.printFinalTest();
		//loop object method calls
		loop.forloop();
		loop.whileloop();
		loop.dowhileloop();
		loop.nestedloop();
		//flow object method calls
		flow.ifthen();
		flow.switchstatement();
		flow.ifthenelse();
		//string object method calls
		string.StringTest();
		string.CompareStrings();
		//array object method calls
		array.TwoDimArray();
		array.OneDimArray();
		//call object method calls
		call.kid();
		call.format();
		call.toString();
		//tool object method calls
		tool.Setter();
		System.out.println(tool.Getter());
		//media object method calls
	    JFrame frame = new JFrame();
			frame.setTitle("Picture");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GraphicPanel panel = new GraphicPanel();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setSize(859, 524);			// set the size of the frame
			frame.setVisible(true);
		
} 
		
	}
