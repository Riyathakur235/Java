public class BubbleS {
    static void Sort(String[]str){
        for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-i-1;j++){
               if( (int) str[j].charAt(0)> (int)str[j+1].charAt(0)){
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
               }
            }
        }
        for(String i:str){
       System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String[] str={"m","a","b"};
       // System.out.println(str[0].charAt(0));
        Sort(str);
    }
}

