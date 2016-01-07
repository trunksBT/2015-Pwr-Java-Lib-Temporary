package Bt.Core.Reflections;

import java.lang.reflect.Field;

import Bt.Core.FileOperations.Strumien;

public class Debug implements Strumien{
	public static void fields(Object aObj)
	{
		StringBuffer info = new StringBuffer();
		Field[] fields = aObj.getClass().getDeclaredFields();
		 
		for(Field it : fields)
		{
			it.setAccessible(true);
			info.append("Pole: ");
		
			info.append(it.getName());	
			info.append(" => ");
			
			info.append(it.getType().getSimpleName());	
			info.append(", ");

			try{
				info.append(it.get(aObj));
			}catch (NullPointerException e ) {
				wyj.println("NullPtrExcep");
			}catch (IllegalArgumentException e ){
				wyj.println("Wrong type in argument");
			}catch (IllegalAccessException e) {
				wyj.println("You don't have access to this");
			}

			if( it.isAccessible() )
				it.setAccessible(false);
				
			wyj.println( info );
		}
	}

}
