package com.sumit.playjava;

import com.sumit.playjava.defaultMethod.ImplementInterfaceWithDefaultMethod;
import com.sumit.playjava.staticMethod.InterfaceWithStaticMethod;

public class MainClass {

	public static void main(String[] args) {
		
		// below class implement the default method from one of the interface(s) 
		ImplementInterfaceWithDefaultMethod defaultClass=new ImplementInterfaceWithDefaultMethod();
		defaultClass.getDefault();
		
		/*Static method of interface can be directly called with the interface
		 * No need to create object of class implementing it.
		 */
		InterfaceWithStaticMethod.getStaticData();
	}

}
