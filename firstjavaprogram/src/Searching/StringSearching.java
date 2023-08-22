package Searching;

public class StringSearching {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'k';
        System.out.println(Search(name,target));
    }
    static boolean Search(String str,char target){
        if(str.length() == 0){
            return false;
        }
//        for(int i=0;i<str.length();i++){
//            int element = str.charAt(i);
//            if(target == element){
//                return true;
//            }
//        }

        // usig for each loop :
         for(char ch : str.toCharArray()){
             if(ch == target){
                 return true;
             }
         }
        return false;
    }
}
