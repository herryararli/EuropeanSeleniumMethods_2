package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.awt.Button;

public class Sel_036_CustomizeXpath {

	public static void main(String[] args) {
		//Absolute xpath: it finds the location by mapping the html tags
		//But this way is brittle 
		//Relative xpath:It locates the tlements by different combinations
		//Trio Formula://tagname[@attribute='value']
		// //tagname[@attribute='value']//tagname[@attribute='value']
		//input[@placeholder='Please enter your Message']
		// //div[@class='form-group']//input[@placeholder='Please enter your Message']
	   
		/*
		 *  We use this concept especially for finding specific group of elements which belongs to one 
		 form or attribute
		 */
		 // //tagname[contains(@attribute,‘value’)] : it returns elements with specified attribute and value
		// //button[contains(@onclick,'return total())']
		/*
		 * // Absolute xpath : It finds the location by mapping the html tags.
		// But this way is brittle
		
		// Relative xpath : It locates the elements by different combinations
		
		// Trio Formula : //tagname[@attribute=‘value’]
		
		/* Chain
		 //tagname[@attribute=‘value’]//tagname[@attribute=‘value’]
		 We use this concept especially for finding specific group of elements which belongs to one 
		 form or attribute
		*/
		
		////tagname[contains(@attribute,‘value’)] : it returns elements with specified attribute and value
		
		 
          // //tagname[starts-with(@attribute,'value')]
		 //We can locate the by first letters of the specific attribute
		 //Start-with method   //tagname[starts-with(@id,'user')]
		 
		 //Or,and operator
		 // //tagname[@attribute='value' or @attribute2='value2' ]--It will return the elements at least one of the listed attributes
		 // //*[@id='user-message' and @class='form-control']
		 ////tagname[@attribute='value' and  @attribute2='value2' ] 
		 
		 
		 // //tagname[text()='text value'] :Returns the element by its text
		 //  //button[text()='Get Total']
		 //ancestor: it returns target node's ancestor nodes---
		 //child:selects all children elements of the current node
		 //preceding:
		 //following:It locates the elements following the given node.            //form[@id='gettotal']//following::input
		 //descendant :It returns the parent of the element
		 //parent :
	}

}
