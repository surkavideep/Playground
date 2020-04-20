#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c;
  std::cin>>n;
  a=n/1000;
  b=n%10;
  c=a+b;
  std::cout<<c;
}