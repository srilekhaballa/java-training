package optionalexample;

import java.util.Optional;

import org.apache.log4j.Logger;
public class OptionalEx {
	
	private static final Logger log = Logger.getLogger(OptionalEx.class);
	
	public static void main(String[] args)
	    {
	        String[] str = new String[5];
	  
	        str[2] = "Geeks Classes are coming soon";
	  
	        Optional<String> empty = Optional.empty();
	        log.info(empty);
	  
	        Optional<String> value = Optional.of(str[2]);
	        log.info(value.get());
	        
	        log.info(value.hashCode());
	        
	        log.info(value.isEmpty());
	    }
	}

