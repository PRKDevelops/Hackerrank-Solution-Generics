import java.io.*;
	import java.util.*;
	public class Generics{
	public static void main(String args[]) {
	Integer[] intArr = {1,2,3};
	String[] strArr = {"Hello","World"};
	    Printer.printArray(intArr);
	    Printer.printArray(strArr);
	    }
	}

	class Printer {
	    public static <T> void printArray(T[] arr) {
	        for (T e : arr)
	            System.out.println(e);
	    }
	}


