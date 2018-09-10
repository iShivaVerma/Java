package question2;

import java.util.Comparator;
import java.util.Date;

public class AscendingDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpDOB().toString().compareTo(o2.getEmpDOB().toString());
	}

}
