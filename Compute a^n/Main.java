#include<iostream>
using namespace std;
int power(int x, int y) {  
   int i,power=1;
   if(y == 0)
      return 1;
   for(i=1;i<=y;i++)
      power=power*x;
   return power;
} 
int main() { 
   int a,n;
   std::cout<<"Enter the value of a";
   std::cin>>a;
   std::cout<<"\nEnter the value of n";
   std::cin>>n;
   std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<power(a,n);
   return 0; 
} 