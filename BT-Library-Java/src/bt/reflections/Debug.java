package bt.reflections;

import java.lang.reflect.Field;

import bt.streams.Strumien;

public class Debug implements Strumien {
	public static void fields(Object aObj) {
		if (aObj != null) {
			StringBuffer info = null;
			Field[] fields = aObj.getClass().getDeclaredFields();

			for (Field it : fields) {
				info = new StringBuffer();
				boolean wasAccess = it.isAccessible();

				it.setAccessible(true);

				info.append("Pole: ");

				info.append(it.getName());
				info.append(" => ");

				info.append(it.getType().getTypeName());
				info.append(", ");

				try {
					info.append(it.get(aObj));
				} catch (NullPointerException e) {
					wyj.println("NullPtrExcep");
				} catch (IllegalArgumentException e) {
					wyj.println("Wrong type in argument");
				} catch (IllegalAccessException e) {
					wyj.println("You don't have access to this");
				}

				if (!wasAccess)
					it.setAccessible(false);

				wyj.println(info);
			}
		}
	}
}
