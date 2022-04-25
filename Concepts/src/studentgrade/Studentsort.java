package studentgrade;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	
	 private int rollno;
	 private String name;
     private int marks;
     
     public Students(int rollno, String name, int marks) {
 		super();
 		this.rollno = rollno;
 		this.name = name;
 		this.marks = marks;
 	}
		 
	 public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


}
public class Studentsort{
	public static void sortList(Students[] arr) {

		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getRollno() > arr[j + 1].getRollno()) {
                    
                    Students temp = arr[j];
                    arr[j]=arr[j + 1];
                    arr[j + 1]=temp ;
                }
		
		for(int i = 0;i<3;i++) {
			System.out.println(arr[i].getRollno());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(122,"Chaitra",67);
		Students s2 = new Students(222,"Halashree",78);
		Students s3 = new Students(32,"Sanu",88);


		Students[] arr = new Students[3];


		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		sortList(arr);
		

	}

}




