package Strings;
public class Platform {
	public static void main(String[] args){
		int arr[] ={900, 940, 950, 1100, 1500, 1800};
		int dep[] ={910, 1200, 1120,1130, 1900, 2000};
		int n = 6;
		int plat_needed = 1, result = 1;
		for (int i = 0; i < n; i++) {
			plat_needed = 1;
			for (int j = 0; j < n; j++) {
				if (i != j)
					if (arr[i] >= arr[j] && dep[j] >= arr [i])
						plat_needed++;
				}
			result = Math.max(result, plat_needed);
			}
		System.out.println(result);}
}
