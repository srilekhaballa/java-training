package optionalexample;

import java.util.Optional;
import java.util.logging.Logger;
public class OptionalEx {
	
	private static final Logger logger = java.util.logging.Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args)
	    {
	        String[] str = new String[5];
	  
	        str[2] = "Geeks Classes are coming soon";
	  
	        Optional<String> empty = Optional.empty();
	        System.out.println(empty);
	  
	        Optional<String> value = Optional.of(str[2]);
	        System.out.println(value.get());
	        
	        System.out.println(value.hashCode());
	        
	        System.out.println(value.isEmpty());
	    }
	}

