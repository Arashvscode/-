import java.util.*;

public class Main
{
	public static void main(String[] args){
		
		Num("Ninja","Coder");
		final String massges = Sort("one","tow","tree");
		System.out.println(massges);
		Pos("hello" ,30);
		
	}
	public static void Num(String first , String last){
		
		System.out.println( "hello to " + first +" " +last);
		
	}
	
	
	public static String Sort(String one , String boll , String ros){
		
		return "hello to " + one + " " + boll +  " " + ros;
	}
	
	public static boolean Pos(String word , int Number){
		
		if(Number != 30){
			
			System.out.println(word);
			
		}else{
			
			System.out.println(Number);
		}
		
		return true;
	}
	
}
