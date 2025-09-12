// class Solution {
//     public boolean doesAliceWin(String s) {
//         if(s.length()==0){
//             return false;
//         }

//         int countvow = 0;

//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);

//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 countvow++;
//             }
//         }

//         if(countvow==0){
//             return false;
//         }
//         if(countvow>0){
//             return true;
//         }

//          return false;  
//      }
// }

class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
                return true;
            }
        }
        return false;
    }
}