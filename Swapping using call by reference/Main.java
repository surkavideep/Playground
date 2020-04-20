#include<iostream>
using namespace std;
void swap (int &num1, int &num2) //&num1 and &bnum2 are Reference variables
{
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
}
int main()
{
        int a,b;
        std::cin>>a>>b;
        std::cout<<"Before swapping"<<" a= "<<a<<" and b="<<b;
        swap(a,b);
        std::cout<<"\nAfter swapping"<<" a= "<<a<<" and b="<<b;
        return 0;
}