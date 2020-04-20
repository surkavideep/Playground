#include <iostream>
int main()
{
  int max,wt;
  std::cin>>max;
  std::cin>>wt;
  if(wt==max)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if (wt<max)
  {
    std::cout<<"Yes, you can enter.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
  return 0;
}
    