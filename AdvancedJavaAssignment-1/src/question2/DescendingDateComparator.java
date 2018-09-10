package question2;

import java.util.Comparator;

public class DescendingDateComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getEmpDOB().toString().compareTo(o1.getEmpDOB().toString());
	}

}
