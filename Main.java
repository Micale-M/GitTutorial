public class Main {
public static void main(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};
System.out.println("The average is: " +
average(numbers));
}
// Non-working average function (needs a fix)
public static double average(int[] nums) {
// Placeholder: This function is incomplete and
currently returns 0
if(nums.length == 0) {
	return 0;
	}
int total = 0;
for (int n:nums){
	total+=n;
}
return (double) total/nums.length;

}
}
