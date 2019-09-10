package com.sumit.playjava.defaultMethod;

/**
 * while implementing both the interfaces the user is asked to 
 * override the default from one of the interface.
 *  
 * @author sumitkumar04
 *
 */
public class ImplementInterfaceWithDefaultMethod implements DefaultInterface1,DefaultInterface2{

	@Override
	public void getDefault() {
		// TODO Auto-generated method stub
		DefaultInterface1.super.getDefault();
	}

}
