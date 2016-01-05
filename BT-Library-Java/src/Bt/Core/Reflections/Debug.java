package Bt.Core.Reflections;

import java.lang.reflect.Field;

import Bt.Core.FileOperations.Strumien;

public class Debug implements Strumien{
	public static void fields(Object aObj)
	{
		String wordToDel = "class ";
		StringBuffer info = new StringBuffer();
		Field[] fields = aObj.getClass().getDeclaredFields();
		
		for(Field it : fields)
		{
			info.append("Pole: ");
			it.setAccessible(true);
			
			info.append(it.getName());	
			info.append(" => ");
			
			info.append(it.getType());	
			info.append(", ");

			try {
				info.append(it.get(aObj));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
			int startToDel = info.indexOf(wordToDel);
			if(startToDel!= -1)
				info.delete(startToDel, startToDel+wordToDel.length());
			
			wyj.println( info );
			info.delete(0, info.length());
		}
	}
}
