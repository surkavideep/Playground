#include<iostream>
int main()
{
  int num,digit=0;

    std:: cin>>num;
 
    do
    {
            num=num/10;
            digit++;
    }
  while(num!=0);
  {
    
    std::cout<<digit;
}
  return 0;
}