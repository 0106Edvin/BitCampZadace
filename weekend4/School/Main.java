package ba.bitcamp.edvin.weekend4.School;

public class Main {

	public static void main(String[] args) {
		/**
		 * Creating directors of schools
		 */
		Director d1 = new Director("Borislav Petrovic", 61);
		Director d2 = new Director("Zeljko Sain", 55);
		Director d3 = new Director("Sacir Filandra", 50);

		/**
		 * Creating classes of schools
		 */
		Class c1 = new Class("Class number 1", 44);
		Class c2 = new Class("Class number 2", 52);
		Class c3 = new Class("Class number 3", 12);
		Class c4 = new Class("Class number 4", 5);
		Class c5 = new Class("Class number 5", 32);

		/**
		 * Creating schools
		 */
		School s1 = new School();
		s1.name = "Law School";
		s1.director = d1;
		s1.classes = new Class[2];
		s1.classes[0] = c1;
		s1.classes[1] = c2;

		School s2 = new School();
		s2.name = "Economy School";
		s2.director = d2;
		s2.classes = new Class[2];
		s2.classes[0] = c3;
		s2.classes[1] = c4;

		School s3 = new School();
		s3.name = "Political Science School";
		s3.director = d3;
		s3.classes = new Class[1];
		s3.classes[0] = c5;

		/**
		 * Creating an array of schools
		 */

		School[] arr = new School[3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;

		/**
		 * Printing which class have more students
		 */
		System.out.println("Class with more students is: \n"
				+ getNameOfCLassWithTheMostStudents(s1));

		System.out.println();

		System.out.println("This school have the youngest Director: \n\n"
				+ getSchoolWithYoungestDirector(arr));

		System.out.println();

		System.out.println("The school with more students is: \n\n"
				+ getNameOfSchoolWithMoreStudents(s2, s3));
	}

	/**
	 * Finds which class in school have more students
	 * 
	 * @param s
	 *            school
	 * @return results
	 */

	public static Class getNameOfCLassWithTheMostStudents(School s) {

		Class withTheMostStudents = s.classes[0];

		for (int i = 0; i < s.classes.length; i++) {
			if (withTheMostStudents.number < s.classes[i].number) {
				withTheMostStudents = s.classes[i];

			}
		}
		return withTheMostStudents;
	}

	/**
	 * Return school with youngest Director
	 * 
	 * @param schools
	 * @return results
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {

		School youngestDirector = schools[0];
		for (int i = 0; i < schools.length; i++) {
			if (youngestDirector.director.year > schools[i].director.year) {
				youngestDirector = schools[i];

			}
		}
		return youngestDirector;
	}

	/**
	 * Returns school which have more students
	 * 
	 * @param s1
	 *            First school
	 * @param s2
	 *            Second School
	 * @return results
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {
		Integer numberOfStudents1 = 0;
		Integer numberOfStudents2 = 0;
		for (int i = 0; i < s1.classes.length; i++) {
			numberOfStudents1 += s1.classes[i].number;
		}
		for (int j = 0; j < s2.classes.length; j++) {
			numberOfStudents2 += s2.classes[j].number;

		}
		if (numberOfStudents1 > numberOfStudents2) {

			return s1.name;
		}

		return s2.name;
	}
}
