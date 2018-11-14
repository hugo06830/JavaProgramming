import java.lang.reflect.Field;

public class Tostring {

	
	static String toString(Object o) {
		
		String inbrackets = "";
		
		Field tabFields[] = o.getClass().getDeclaredFields();
		
		for(Field f : tabFields) {
			String oclass = o.getClass().getSimpleName();
			String name = f.getName();
			String type = f.getType().getSimpleName();
			if(tabFields.length !=0)inbrackets += name + ":" + type + " = " + getvalue(o, f) + ",";
			else {
				inbrackets =  " the specified objects doesn't have any fields ";
			}
			
		
			
		}
	return 	inbrackets.substring(0,inbrackets.length()-1);
		
		
		
	}
	
	
	private static String getvalue(Object o ,Field f) {
		f.setAccessible(true);
		
		if(f.getType().isArray()) {  //If f is an array
	    
	     return "some arraysvalue";
	     }
	     
	     
		
			
			
			
		else {
			
			try {
				return f.get(o).toString();
			} catch (IllegalArgumentException | IllegalAccessException e) {
				
				e.printStackTrace();
			}
			return "an error as occured";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
