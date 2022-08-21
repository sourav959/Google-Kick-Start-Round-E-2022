#include<bits/stdc++.h> 
using namespace std; 
#define int long long 
#define sg signed
sg main(){ 
    int t;  
    cin>>t;  
    for (int i = 0; i < t; i++)  
    {  
        int n; 
        cin>>n; 
        string s; 
        cin>>s; 
        cout<<"Case #"<<q + 1 << ":" << " ";  
        vector <int> arr(n); 
        int i = 1; 
        int j = 0; 
        while(i < n){ 
            if(s[i] == s[j]){ 
                arr[i] = j+1; 
                i++; 
                j++; 
            } else { 
                if(j > 0){ 
                j = arr[j-1]; 
                } else { 
                arr[i] = 0; 
                i++; 
                } 
            } 
        } 
        string ans; 
        if(arr[n - 1] && n % (n - arr[n-1]) == 0){ 
            ans = s.substr(0, n - arr[n-1]); 
        } 
        else{ 
            ans=s; 
        } 
        cout<<ans<<endl; 
    }  
 
    return 0; 
}
