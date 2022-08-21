import java.util.*;

class Solution{
    public static int solve(int num){
        if(num<=5)
            return 1;
        int bot=1,john=0;
        int x=1,count=0;
        while(x<=num){
            if(count%2==0){
                x+=3;
                if(x<=num)
                    john++;
            }else{
                x+=2;
                if(x<=num)
                    bot++;
            }
            count++;
        }
        
        return bot;

    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for(int i=1;i<=testCase;i++){
            int num=sc.nextInt();
            int ans=solve(num);
            System.out.println("Case #"+i+": "+ans);
        }
    }
}