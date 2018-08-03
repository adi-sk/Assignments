import java.util.*;

public class Main {
	public static void main(String[] args){
		String title="Let us C++";
		System.out.println(title.toLowerCase());
		System.out.println(title);
	    title=title.toUpperCase();
	    title="the title is:" +title;
	    StringBuffer builder=new StringBuffer();
	    builder.append("Mahendra");
	    builder.insert(0, "Mr").append(" ").append("Shinde");
	    System.out.println(builder.toString());
	    
	    StringTokenizer tokenizer=new StringTokenizer("the fox jumped over the river.");
	    while(tokenizer.hasMoreTokens()){
	    	System.out.println(tokenizer.nextToken());
	    }
	    
	    
	
	
	}


}
