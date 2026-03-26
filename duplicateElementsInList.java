Find duplicate elements in a list

import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,3,45,3,45,2,7,8);

		Set<Integer> duplicates = nums.stream()
		                          .filter(i -> Collections.frequency(nums, i) > 1)
		                          .collect(Collectors.toSet());

		System.out.println(duplicates);
	}
}
