import java.util.*;

class Solution{
    public static int[] solve(int[] array, int N){
        int[] answer=new int[N];
        TreeSet<Integer> ts=new TreeSet<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            ts.add(array[i]);
            if(hm.containsKey(array[i]))
                hm.put(array[i],hm.get(array[i])+1);
            else
                hm.put(array[i],1);
        }
        for(int i=0;i<N;i++){
            int x=array[i]*2;
            int y=ts.floor(x)==null?-1:ts.floor(x);
            if(y==array[i] && hm.get(array[i])==1){
                y=ts.floor(array[i]-1)==null?-1:ts.floor(array[i]-1);
            }
            if(y==-1)
                answer[i]=-1;
            else{
                answer[i]=y;
            }
        }
        return answer;
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for(int j=1;j<=testCase;j++){
            int N=sc.nextInt();
            int[] array=new int[N];
            for(int i=0;i<N;i++)
                array[i]=sc.nextInt();
            int[] answer=solve(array,N);
            System.out.print("Case #"+j+": ");
            for(int i=0;i<N;i++)
                System.out.print(answer[i]+" ");
            System.out.println();
        }
    }
}