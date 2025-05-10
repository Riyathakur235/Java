public class Sorted {
    public static void main(String[] args) {
        int[]arr={2,3,5,6,8,9};
        int max=arr[0];
        for(int i=0;i<6;i++){
           if(max<=arr[i]){
            max=arr[i];
           } 
        }
        System.out.println("Array is soted");
       
    }
}
