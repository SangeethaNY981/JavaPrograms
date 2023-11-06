package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	int eid;
	String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}
}

public class StreamAPIExample2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Emp> a = new ArrayList<>();
				a.add(new Emp(12, "Bob"));
				a.add(new Emp(13, "Jhon"));
				a.add(new Emp(16, "Alice"));
				a.add(new Emp(16, "Alice"));
				System.out.println(a);
				
				//count
				long count = a.stream().count();
				System.out.println("no. of employees =   "+count);
				
//				
				long start_with_s = a.stream().filter(b -> b.getEname().startsWith("A")).count();
				System.out.println( start_with_s);
				
				Object max = a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b -> b.eid)));
				System.out.println(max);
				
				Object avg = a.stream().collect(Collectors.averagingDouble(b -> b.eid));
				System.out.println(avg);
				
				Optional<Emp> aso = a.stream().collect(Collectors.maxBy(Comparator.comparingDouble(b -> b.eid)));
				System.out.println("Max id "+aso);
				
				Stream<Emp> s = a.stream().filter(name -> name.getEname().startsWith("C"));
				System.out.println("name starts with c "+s.collect(Collectors.toList()));
			}

}

