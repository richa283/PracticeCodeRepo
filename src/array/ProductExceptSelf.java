package array;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] leftProducts = new int[length];
        int[] rightProducts = new int[length];

        int[] result = new int[length];

        leftProducts[0] = 1;
        for(int i = 1; i<length; i++){
            leftProducts[i] = leftProducts[i-1] * nums[i-1];
        } 

        rightProducts[length-1] = 1;
        for(int i = length-2; i>=0; i--){
            rightProducts[i] = rightProducts[i+1] * nums[i+1];
        }

        for(int i=0; i<length; i++){
            result[i] = leftProducts[i]*rightProducts[i];
        }
        return result;
    }

    public static void main(String[] args){
    	ProductExceptSelf sol = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println("The product array except self is: ");
        for(int num : result) {
        	System.out.println(num+" ");
        }
    }
}
