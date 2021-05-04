package optionalexample;

import java.util.Optional;

import org.apache.log4j.Logger;  
public class OptionalNullableEx {
	
	private static final Logger log = Logger.getLogger(OptionalNullableEx.class);
	public static void main(String[] args) {  
	        String[] words = new String[10];  
	        Optional<String> checkNull = 
	                      Optional.ofNullable(words[5]);  
	        if (checkNull.isPresent()) {  
	            String word = words[5].toLowerCase();  
	            log.info(word);  
	        } else  
	            log.info("word is null");  
	}  
}
