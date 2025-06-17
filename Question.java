public class Question {
    
//    public static void main(String[] args) {
//     //collection framwork
//     String str1="hello";
//    // String str2="llohe";
//        int count=0;
//     for(int i=0;i<str1.length();i++){
//         char ch=str1.charAt(i);
//         if(ch=='h'|| ch=='e'||ch=='l'||ch=='o'){
//             count++;
//         }
//     }
//     System.out.println(count);
//     System.out.println(str1.length()-count);
//    }

//1 2 3
//4 5 6                 //output-123698745
//7 8 9
//compress the element
    public static void main(String[] args) {
                String  str ="aaabbbccc";
                StringBuilder newstr= new StringBuilder();
                int count=1;
                for(int i=1;i<=str.length();i++){
                    if(str.charAt(i)==str.charAt(i-1)){
                        count++;
                    }
                    else{
                        newstr.append(str.charAt(i-1)).append(count);
                        count=1;
                    }
                }
                System.out.println(newstr);
            }
        }


