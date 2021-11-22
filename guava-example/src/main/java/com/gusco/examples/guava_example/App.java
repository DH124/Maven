package com.gusco.examples.guava_example;

import com.google.common.collect.HashMultiset;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HashMultiset<String> animals =  HashMultiset.create();
    	
    	animals.add("Horse");
    	animals.add("Cat");
    	animals.add("Dog");
    	
    	
    	animals.forEach(System.out::println);
    }
}
