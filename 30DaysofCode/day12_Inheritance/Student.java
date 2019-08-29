package day12_Inheritance;

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
	Student(String firstName, String lastName, int identification, int[] scores) {
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.idNumber = identification;
		super(firstName, lastName, identification);
		this.testScores = scores;
	}
	
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    char calculate() {
    	int length = testScores.length;
    	int sum = 0;
    	char grade = 'O';
    	
    	for (int i = 0; i < length; i++) {
    		sum += testScores[i];
    	}
    	
    	int average = sum / length;
    	
    	if ((90 <= average) && (average <= 100)) {
    		grade = 'O';
    		
    	} else if ((80 <= average) && (average < 90)) {
    		grade = 'E';
    		
    	} else if ((70 <= average) && (average < 80)) {
    		grade = 'A';
    		
    	} else if ((55 <= average) && (average < 70)) {
    		grade = 'P';
    		
    	} else if ((40 <= average) && (average < 55)) {
    		grade = 'D';
    		
    	} else if (average < 40) {
    		grade = 'T';
   
    	}
		return grade;
    	
    }
}