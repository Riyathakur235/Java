public class Linear {
   // public static int LinearSearch(int[] arr,target) {
     //   for(int i=0;i<arr.length;i++){
       //         if(arr[i]==target){
         //        return i;
           //     }
             //   else{
               //     return -1;
                //}
            //}
       // }
       public static void BinerayS(int[]arr,int target) {
        
        int low =0;
        int high=arr.length-1;
        while(low<=high){
           int mid=(low+high)/2;
        
        if(arr[mid]==target){
          System.out.println(mid);//return mid;
        }
        else if(arr[mid]>target){
          high=mid-1; 
        }
        else{
          low=mid+1;
        }
      }
      }
    
    public static void main(String[] args) {
        int[] arr={22,4,7,6,3,0};
        int target=7;
        BinerayS(arr,target);
    }  
}
