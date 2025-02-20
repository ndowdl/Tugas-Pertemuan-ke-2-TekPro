
public class Strings {
    public static void main(String[] args) {
        String myString = "hello java";
        String[] words = myString.split(" ");
        
       int count = 0;
       for(String word : words) {
        count += word.length();
       }
       System.out.println("The length of Strings in array words are " + count);

       String A = "hello";
       String B = "java";
       int perbandingan = A.compareTo(B);
       if(perbandingan < 0) {
            System.out.print("NO\n");
       } else {
            System.out.print("YES\n");
        }
        
        char[] array1 = A.toCharArray();
        char[] array2 = B.toCharArray();
        array1[0] = Character.toUpperCase(array1[0]);
        array2[0] = Character.toUpperCase(array2[0]);
        String str = new String(array1);
        String ing = new String(array2);
        System.out.println(str+" "+ing);
    }
}