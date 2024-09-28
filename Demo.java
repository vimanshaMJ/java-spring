
public class Demo {
    public static void main(String a[]) {
        int nums[] = {3,7,5,9};
        System.out.println(nums[1]);

        nums[1] = 8;
        System.out.println(nums[1]);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
