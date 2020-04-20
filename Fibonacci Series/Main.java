//Fibonacci Series using Recursion 
#include<bits/stdc++.h>
      using namespace std;
 
  int main()
 {
     long long n;
      
           std::cin>>n;
       
       int dp[n+1];
       
      
       dp[1]=0; // Base Case
       
       dp[2]=1; // Base Case
       
       for(long i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
            
            std::cout<<"The term "<<n<<" in the fibonacci series is "<<dp[n];
  }