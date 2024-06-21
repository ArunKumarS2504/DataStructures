/**
 * StringReverse
 */
// Reverse by buffer

public class StringReverse {

    public static String ReverseString(String str){

       StringBuffer sb = new StringBuffer(str);
       sb.reverse();
       return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(StringReverse.ReverseString("Arun"));
    }
}


/// iterate by character



// public class StringReverse {

//     public static String ReverseString(String str){

//       char ch[] = str.toCharArray();

//       String rev = "";
//       for(int i=ch.length-1;i>=0;i--){
//         rev+= ch[i];
//       }
//       return rev;


//     }
//     public static void main(String[] args) {
//         System.out.println(StringReverse.ReverseString("Arun"));
//     }
// }