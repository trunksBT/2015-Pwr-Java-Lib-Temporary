package bt.wrox.algosFromBegg;

import java.io.File;
import java.util.Iterator;

public class RecursiveFolderTreeProcessing {
	private static final String SPACES = "  ";
	
    public static void print(File file, String indent) {

        System.out.print(indent);
        System.out.println(file.getName());

        if (file.isDirectory())
            print(file.listFiles(), indent + SPACES);
    }

    public static void print(File[] files, String indent) {
    	for (int i = 0; i < files.length; ++i)
    		print(files[i], indent);
    }

    private static void print(Iterator files, String indent) {
        files.forEachRemaining( file -> print((File)file,indent));
    }
}
