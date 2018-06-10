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
		   
		   double[] student1 = new double[] {44, 46, 34, 31, 68, 70, 58, 53};
		   double[] student2 = new double[] {40, 42, 50, 48, 72, 67, 65, 69};
		   double[] student3 = new double[] {33, 38, 44, 30, 51, 62, 49, 56};
		   double[] student4 = new double[] {50, 45, 47, 48, 60, 58, 63, 68};
		   double[] student5 = new double[] {30, 41, 44, 36, 46, 49, 54, 55};
		   double[] student6 = new double[] {26, 31, 36, 32, 41, 44, 46, 42};
		   double[] student7 = new double[] {48, 42, 47, 45, 72, 70, 66, 69};
		   double[] student8 = new double[] {45, 40, 38, 47, 68, 62, 65, 66};
		   double[] student9 = new double[] {38, 42, 35, 40, 54, 56, 63, 60};
		   double[] student10 = new double[] {42, 39, 44, 45, 64, 68, 70, 62};
		   
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
			   if (scoreArray[counter] >= gradeAverage + (2*(standardDeviation))) {
				   finalGrade = "A";
			   }
			   else if (scoreArray[counter] >= gradeAverage + (standardDeviation)) {
				   finalGrade = "B";
			   }
			   else if (scoreArray[counter] >= gradeAverage) {
				   finalGrade = "C";
			   }
			   else if (scoreArray[counter] >= gradeAverage - (standardDeviation)) {
				   finalGrade = "D";
			   }
			   else {
				   finalGrade = "F";
			   }
			   System.out.println(scoreArray[counter] + " " + finalGrade);
		   }
		   			   
	   }
}
