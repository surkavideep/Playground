#include<iostream>
int main(){
  int i, num1, num2, div,num, sum=0;
    std::cin >> num1>>num2;
    num=num1+num2;
    for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        std::cout <<"They can read the message";
    else
        std::cout <<"They can't read the message";
}