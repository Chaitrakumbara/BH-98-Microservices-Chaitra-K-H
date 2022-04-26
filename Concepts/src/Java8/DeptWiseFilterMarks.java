package Java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class DeptWiseFilterMarks {

	
		public static void main(String[] args) {
			
			Department d1 = new Department(111,"EEE");
			Department d2 = new Department(222,"ECE");
			Department d3 = new Department(333,"CSE");
			
			Student6 s1 = new Student6(101,"Sumit",120,45,95,93);
			Student6 s2 = new Student6(102,"Rajesh",121,87,95,93);
			Student6 s3 = new Student6(103,"Suraj",122,56,95,78);
			Student6 s4 = new Student6(104,"Tom",123,79,89,93);
			Student6 s5 = new Student6(105,"Shiva",124,89,78,93);
			Student6 s6 = new Student6(106,"Jay",125,90,95,93);
			Student6 s7 = new Student6(107,"Sagar",126,67,87,93);
			
			
			List<Student6> stlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7);
			
			for(Student6 st:stlist)
	            st.setTotal(st.getCmarks()+st.getMmarks()+st.getPmarks());
			
			Map<Integer, List<Student6>> result = stlist.stream().collect(Collectors.groupingBy(Student6::getDept_id));
			
		    for(List<Student6> st:result.values()) {
		    	Optional<Student6> maxmarks = st.stream().collect(Collectors.maxBy(Comparator.comparing(Student6::getTotal)));
			   System.out.println(maxmarks);
		    }
		}

	}
			
