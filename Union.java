public class Union {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        int[] tempunion=new int[arr1.length + arr2.length];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            tempunion[index]=arr1[i];
            index++;
        }
        for (int i=0;i<arr2.length;i++){
            boolean isDuplicate = false;
            for (int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate){
                tempunion[index]=arr2[i];
                index++;
            }
        }
        System.out.println("Union of the array: ");
        for(int i=0;i<index;i++){
            System.out.print(tempunion[i]+ " ");
        }
    }
}

