public class Compare {
    public static void main(String[] args) {
        int[]arr1={2,4,6};
        int[]arr2={2,4,6};
        
        for(int i=0;i<arr1.length;i++){
           if(arr1[i]==arr2[i]) {
            System.out.println("is Equal");
           }
           else
            System.out.println("is not Equal"); 
        }
    }
}
