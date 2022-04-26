package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student6 {
	private int id;
	private String name;
	private int dept_id;
	private int cmarks,pmarks,mmarks;
	public Student6(int id, String name, int dept_id, int cmarks, int pmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.cmarks = cmarks;
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}
	public Student6(int id2, String name2, Department d1, int cmarks2, int pmarks2, int mmarks2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getCmarks() {
		return cmarks;
	}
	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}
	public int getPmarks() {
		return pmarks;
	}
	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}
	public int getMmarks() {
		return mmarks;
	}
	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	public int getTmarks() {
		return this.cmarks+this.pmarks+this.mmarks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", dept_id=" + dept_id + ", cmarks=" + cmarks + ", pmarks="
				+ pmarks + ", mmarks=" + mmarks + "]";
	}
	public void setTotal(int i) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
	
  public class Demo {
	    public static void main(String[] args) {
	    	
		Student6 s1 = new Student6(101,"Sumit",120,45,95,93);
		Student6 s2 = new Student6(102,"Rajesh",121,87,95,93);
		Student6 s3 = new Student6(103,"Suraj",122,56,95,78);
		Student6 s4 = new Student6(104,"Tom",123,79,89,93);
		Student6 s5 = new Student6(105,"Shiva",124,89,78,93);
		Student6 s6 = new Student6(106,"Jay",125,90,95,93);
		Student6 s7 = new Student6(107,"Sagar",126,67,87,93);
		
		List<Student6> Student1s = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
		Map<Integer, List<Student6>> Student6DeptWise = Student1s.stream().collect(Collectors.groupingBy(Student6::getDept_id));
	

		for(Integer st : Student6DeptWise.keySet())
			System.out.println(st+" = "+Student6DeptWise.get(st));
		}
	}



