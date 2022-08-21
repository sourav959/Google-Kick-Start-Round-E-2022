import java.util.*;

class Solution{
    static boolean isPalin(String str,int n){
        int i=0,j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static String solve(String str, int n){
        String Q="";
        int i=1;
        while(Q.length()<n){
            Q=str.substring(0,i);
            if(isPalin(Q,i)){
                Q=new StringBuilder(Q).reverse().toString();
                if(isPalin(str+Q,n+i))
                    return Q;
            }
            i++;
        }
        return str;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for(int i=1;i<=testCase;i++){
            int n=sc.nextInt();
            String str=sc.next();
            String ans=solve(str,n);
            System.out.println("Case #"+i+": "+ans);
        }
    }
}