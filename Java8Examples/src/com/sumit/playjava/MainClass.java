package com.sumit.playjava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		
		/*
		 * Functional Interfaces are as follows:
		 */
		
		//1.Predicate: return boolean value
		Predicate<String> pred=new Predicate<String>() {
			@Override
			public boolean test(String str) {
				return str.length()>10;
			}
		};
		
		String s="PlayJava !!!";
		System.out.println("Boolean value from predicate: "+pred.test(s));
		
		//2.Consumer: this accepts a single argument and returns no result.
		Consumer<Integer> consumer=new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println("Nothing is returned in case of consumer");
			}
		};
		consumer.accept(10);
		
		//3.Function: this interface accepts one argument and return one result.
		Function<Integer,String> function=new Function<Integer,String>() {
			@Override
			public String apply(Integer t) {
				return "The data is: "+t;
			}
		};
		System.out.println(function.apply(100));
		
		//4.Supplier: this accepts nothing but return a value.
		Supplier<String> supplier=new Supplier<String>() {
			@Override
			public String get() {
				return "Data from supplier functional interface: "+Math.random();
			}
		};
		System.out.println(supplier.get());
	}

}
