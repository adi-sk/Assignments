package megha;
import java.io.*;
import java.util.*;

public class Megha {

	public static void main(String[] args) throws IOException{
		
		List<String> tokenList=new LinkedList<>();
		try{
		    BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\aditya.kurhade\\Desktop\\data.txt"));
		    StringBuilder builder=new StringBuilder();
		    String check=br.readLine();
		    while(check!=null){
			builder.append(check).append("\n");	
			check=br.readLine();
	          	}
	        StringTokenizer tokenizer=new StringTokenizer(builder.toString()," .;,\n\t");
	        while(tokenizer.hasMoreTokens()){
		    tokenList.add(tokenizer.nextToken());
	        }
//	        for(String s:tokenList)
//	        {
//	        	System.out.println(s);
//	        	}
	        
	        
		}catch(IOException ex){
			
		}
		
	}
}
