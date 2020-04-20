#include<iostream>
int main()
{
    int n1,n2,m,r;
    std::cout<<"Enter first number : Enter second number :";
    std::cin>>n1>>n2;
    std::cout<<" Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
    std::cin>>m;
    switch(m)
    {
        case 1 : 
        r=n1+n2;
        std::cout<<r;
        break;
        case 2 :
        r=n1-n2;
        std::cout<<r;
        break;
        case 3 :
        r=n1*n2;
        std::cout<<r;
        break;
        case 4 :
        r=n1/n2;
        std::cout<<r;
        break;
        case 5 :
        r=n1%n2;
        std::cout<<r;
        break;
        default : std::cout<<"Invalid operation";
        break;
    }
}