
public class CoreJava1 {

	public static void main(String[] args) {
		String Name = "vijay Pratap";
		char Gender = 'M';
		int Age = 28;
		double Weaight = 98.7;
		long Number = 999087703;
		/*
		 * System.out.println(Name + " is my name"); System.out.println(Gender +
		 * " is genedr "); System.out.println(Age + " is age");
		 * System.err.println(Weaight + " is weaight"); System.err.println(Number +
		 * " is mobile number");
		 */

		// Array
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		// System.out.println(arr[2]);
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 888, 99 };
		// System.out.println(arr2[4]);

		for (int i = 0; i < arr2.length; i++) {
			// System.out.println(arr2[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			// System.out.println(arr2[i]);

		}

		String[] name = { "vijay", "pratap", "sharma" };

		for (int i = 0; i < name.length; i++) {
			// System.out.println(name[i]);
		}
		for (String s : name) {
			System.out.println(s);// enhanced loop condition

		}
	}

}
