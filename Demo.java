
public class Demo {
    public static void main(String a[]) {
        int nums[][] = new int[3][4]; // multidimensional array

        int nums1[][] = new int[3][]; // jagged array, individually specified inner array sizes
        nums1[0] = new int[3];
        nums1[1] = new int[4];
        nums1[2] = new int[2];


        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                nums[i][j] = (int)(Math.random()*10);
            }
            
        }
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
