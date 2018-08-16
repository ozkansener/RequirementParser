/*
 * Author Ozkan Sener
 * ozkansener@gmail.com
 */

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class demo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in).useDelimiter("\\n");
		PrintWriter pw = new PrintWriter(new File("test.csv"));
		StringBuilder sb = new StringBuilder();
		sb.append("id");
		sb.append(',');
		sb.append("Description");
		sb.append(',');
		sb.append("Type");
		sb.append(',');
		sb.append("Prio");
		sb.append(',');
		sb.append("Source");
		sb.append(',');
		sb.append("Rational");
		sb.append(',');
		sb.append("Verfication");
		sb.append(',');
		sb.append("Validation");
		sb.append('\n');
		char a;
		int i = 1;
		do {
			String strI = Integer.toString(i);
			sb.append(strI);
			sb.append(',');
			System.out.print("A one sentence statement of the intention of the requirement : ");
			String des = scan.next();
			sb.append(des);
			sb.append(',');
			System.out.print("Requirement Type:(non/fun) : ");
			String type = scan.next();
			sb.append(type);
			sb.append(',');
			System.out.print("How important is this requirement (m(must),s(should),c(could),w(want)");
			String prio = scan.next();
			sb.append(prio);
			sb.append(',');
			System.out.print("Who is the source of the requirements? : ");
			String source = scan.next();
			sb.append(source);
			sb.append(',');
			System.out.print("Why does the user want this requirement? : ");
			String rat = scan.next();
			sb.append(rat);
			sb.append(',');
			System.out.print("How do we verify that the software is conform specifications? : ");
			String ver = scan.next();
			sb.append(ver);
			sb.append(',');
			System.out.print("How do we validate that the software does what user really requires? : ");
			String val = scan.next();
			sb.append(val);
			sb.append('\n');
			System.out.println("Continue(Y/N)");
			a = scan.next(".").charAt(0);

			i++;

		} while (a == 'Y' || a == 'y');

		pw.write(sb.toString());
		pw.close();
		scan.close();
		System.out.println("done!");

	}
}

