import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Number[] data1 = {1, 2, 3, 4, 5, 6};
		//Number[] data2 = {1, 2, 3, 4, 5, 6};
		//List<Number> list = Arrays.asList(data);

		//*/
		// Get average
		NumJava nj = new NumJava();
		//System.out.println(nj.average(list));
		//System.out.println(nj.max(list));
		//System.out.println(nj.min(list));
		//System.out.println(nj.sample(list, 3, false));
		//System.out.println(nj.sample(list, 3, true));

		Matrix a = new Matrix(data1, 2, 3);
		//Matrix b = new Matrix(data2, 2, 3);
		a.printElem();
		System.out.println("----------------------------");

		Matrix c = new Matrix(2, 3);
		c = nj.divmat(a, 0);
		c.printElem();
		System.out.println("----------------------------");
		//System.out.println(myrandmat.getElem(1, 1));
		//*/
	}
}
