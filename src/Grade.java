//**********************************************************************
// James Rangel
// Assignment 4
//**********************************************************************

public class Grade {
	
	   public static void main(String[] args)
	   {
		  
		   /* 
		      Arrays for 10 students  
		      Indexes 0-3 for Exam Scores
		      Indexes 4-7 for Assignment Scores
		      Exams 0-50 points possible
		      Assignments 0=75 points possible
		   */
		   
		   double[] student1 = new double[] {30, 35, 22, 31, 45, 50, 52, 56};
		   double[] student2 = new double[] {32, 36, 40, 42, 64, 55, 60, 54};
		   double[] student3 = new double[] {27, 29, 32, 25, 40, 50, 60, 55};
		   double[] student4 = new double[] {36, 41, 30, 33, 52, 50, 56, 54};
		   double[] student5 = new double[] {15, 22, 28, 30, 40, 38, 44, 45};
		   double[] student6 = new double[] {17, 22, 24, 30, 35, 33, 40, 44};
		   double[] student7 = new double[] {35, 38, 32, 35, 65, 54, 49, 55};
		   double[] student8 = new double[] {28, 30, 22, 32, 57, 52, 50, 55};
		   double[] student9 = new double[] {21, 26, 32, 35, 45, 50, 53, 56};
		   double[] student10 = new double[] {30, 32, 35, 28, 53, 56, 65, 57};
		   
		   double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0,
				   sum6 = 0, sum7 = 0, sum8 = 0, sum9 = 0, sum10 = 0;
				   
		   for(int counter=0; counter<student1.length; counter++) {
			   sum1+=student1[counter];
		   }
		   
		   for(int counter=0; counter<student2.length; counter++) {
			   sum2+=student2[counter];
		   }
		   
		   for(int counter=0; counter<student3.length; counter++) {
			   sum3+=student3[counter];
		   }
		   
		   for(int counter=0; counter<student4.length; counter++) {
			   sum4+=student4[counter];
		   }
		   
		   for(int counter=0; counter<student5.length; counter++) {
			   sum5+=student5[counter];
		   }
		   
		   for(int counter=0; counter<student6.length; counter++) {
			   sum6+=student6[counter];
		   }
		   
		   for(int counter=0; counter<student7.length; counter++) {
			   sum7+=student7[counter];
		   }
		   
		   for(int counter=0; counter<student8.length; counter++) {
			   sum8+=student8[counter];
		   }
		   
		   for(int counter=0; counter<student9.length; counter++) {
			   sum9+=student9[counter];
		   }
		   
		   for(int counter=0; counter<student10.length; counter++) {
			   sum10+=student10[counter];
		   }
		   
		   // Array for student scores. Index 0 is Student1, Index 1 is student2, etc.
		   double[] scoreArray = new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		   
		   scoreArray[0] = sum1;
		   scoreArray[1] = sum2;
		   scoreArray[2] = sum3;
		   scoreArray[3] = sum4;
		   scoreArray[4] = sum5;
		   scoreArray[5] = sum6;
		   scoreArray[6] = sum7;
		   scoreArray[7] = sum8;
		   scoreArray[8] = sum9;
		   scoreArray[9] = sum10;
		   
		   String letterGrade = "";
		   
		   System.out.println("Students 1 through 10 total scores and grades pre-curve:");
		   
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   if (scoreArray[counter] >= 450) {
				   letterGrade = "A";
			   }
			   else if (scoreArray[counter] >= 400) {
				   letterGrade = "B";
			   }
			   else if (scoreArray[counter] >= 350) {
				   letterGrade = "C";
			   }
			   else if (scoreArray[counter] >= 300) {
				   letterGrade = "D";
			   }
			   else {
				   letterGrade = "F";
			   }
			   System.out.println(scoreArray[counter] + " " + letterGrade);
		   }
		   
		   double gradeAverage = 0;
				   
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   gradeAverage+=scoreArray[counter] / 10;
		   }
		   System.out.println("Average score: " + gradeAverage);
		   
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   scoreArray[counter] -= gradeAverage;
		   }
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   scoreArray[counter] = Math.pow(scoreArray[counter], 2);
		   }
		   
		   double sdAverage = 0;
		   
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   sdAverage+=scoreArray[counter] / 10;
		   }
		   
		   double standardDeviation = Math.sqrt(sdAverage);
		   System.out.println("Standard deviation is " + standardDeviation);

		   scoreArray[0] = sum1;
		   scoreArray[1] = sum2;
		   scoreArray[2] = sum3;
		   scoreArray[3] = sum4;
		   scoreArray[4] = sum5;
		   scoreArray[5] = sum6;
		   scoreArray[6] = sum7;
		   scoreArray[7] = sum8;
		   scoreArray[8] = sum9;
		   scoreArray[9] = sum10;
		   
		   String finalGrade = "";
		   
		   System.out.println("Students 1 through 10 total scores and grades with curve:");
		   
		   for(int counter=0; counter<scoreArray.length; counter++) {
			   if (scoreArray[counter] >= gradeAverage + (standardDeviation)) {
				   finalGrade = "A";
			   }
			   else if (scoreArray[counter] >= gradeAverage + (standardDeviation/2)) {
				   finalGrade = "B";
			   }
			   else if (scoreArray[counter] >= gradeAverage) {
				   finalGrade = "C";
			   }
			   else if (scoreArray[counter] >= gradeAverage - (standardDeviation/2)) {
				   finalGrade = "D";
			   }
			   else {
				   finalGrade = "F";
			   }
			   System.out.println(scoreArray[counter] + " " + finalGrade);
		   }
		   			   
	   }
}
