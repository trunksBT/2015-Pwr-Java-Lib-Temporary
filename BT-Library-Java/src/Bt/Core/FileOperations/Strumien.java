package Bt.Core.FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public interface Strumien
{ 
	PrintWriter wyj= new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)),true);
	BufferedReader wej= new BufferedReader( new InputStreamReader(System.in));
	StreamTokenizer st = new StreamTokenizer(wej);
	Scanner scan = new Scanner(System.in);
}
