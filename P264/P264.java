import java.util.*;

// Ugly Number II

class P264 {
	public static void main(String[] args) {
		
		System.out.println(nthUglyNumber(10000));
	}

	public static int nthUglyNumber(int n) {

		List<Double> list = new ArrayList();

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}
		
		list.add(1.0);

		for (int i = 0; i < n; i++) {
			
			Double current = list.get(i);
			
			Double i2 = current * 2.0;
			
			if (list.size() >= n && i2 >= list.get(n - 1)) {
								
				return list.get(n - 1).intValue();
			}
			
			Double i3 = current * 3.0;
			Double i5 = current * 5.0;

			if (list.contains(i2) == false) {
				
				int size = list.size();
				
				if (list.get(size - 1) <= i2) {
					list.add(i2);
					list.add(i3);					
					list.add(i5);
					continue;
				} else {
				
					for (int j = i + 1; j < size; j++) {
						if (list.get(j) >= i2) {
							list.add(j, i2);
							break;
						}
					}
				}
			}
			
			if (list.contains(i3) == false) {
				
				if (list.get(list.size() - 1) <= i3) {
					list.add(i3);
					list.add(i5);
					continue;
				} else {
				
					for (int j = i + 1; j < list.size(); j++) {
						if (list.get(j) >= i3) {
							list.add(j, i3);
							break;
						}
					}
				}
			}
			
			if (list.contains(i5) == false) {
				
				if (list.get(list.size() - 1) <= i5) {
					list.add(i5);
				} else {
				
					for (int j = i + 1; j < list.size(); j++) {
						if (list.get(j) >= i5) {
							list.add(j, i5);
							break;
						}
					}
				}
			}
		}

		return list.get(n - 1).intValue();
	}
}
