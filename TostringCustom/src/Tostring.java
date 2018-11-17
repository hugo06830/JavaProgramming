import java.lang.reflect.Field;

public class Tostring {

	
	static String toString(Object o) {
		
		String inbrackets = "";
		
		Field tabFields[] = o.getClass().getDeclaredFields();
		
	
		for(Field f : tabFields) { //field processing
			
			String name = f.getName();
			String type = f.getType().getSimpleName();
			if(tabFields.length !=0)inbrackets += name + ":" + type + " = " + getvalue(o, f) + ",";
			else {
				inbrackets =  " the specified objects doesn't have any fields ";
			}
			
		
			
		}
		inbrackets.substring(0,inbrackets.length()-1);
		return o.getClass().getSimpleName()+ " " + "{" + inbrackets.substring(0,inbrackets.length()-1) + "}";
		//substring used to delete the ','
		
		
	}
	
	
	private static String getvalue(Object o ,Field f) {
		f.setAccessible(true);
		
		
		if(f.getClass().isPrimitive()) {
			if(f.getType().isArray()) {
				return "";
			}else {
				try {
					return f.get(o).toString();
				} catch (IllegalArgumentException | IllegalAccessException e) {
					
					e.printStackTrace();
				}
				return "an error as occured";
			}
			
			  
		}else {
			try {
				return toString((Object)f);
			}catch(Exception e) {
				return "unable to convert to a string this object";
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
