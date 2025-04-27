public class Convert {
    public static void main(String[] args) {
     int[][] arr={{1,2,3},{3,4,5}};
     int totalCount=0;
     for(int i=0;i<arr.length;i++) {
       totalCount=totalCount+arr[i].length;
     }  
     System.out.println(totalCount);
      int arr1[]= new int[totalCount];
      int x=0;
     for(int k=0;k<=arr.length;k++){
        for(int p=0;p<arr[k].length;p++){
            arr1[x++]=arr[k][p];
        }
     }
     for(int i=0;i<arr1.length;i++){
      System.out.println(arr1[i] +" ");
     }
     }
}
    

