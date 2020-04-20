#include<iostream>
using namespace std;
int main()
{
  int w,a,c,b;
  std::cin>>w>>a>>c;
  b=((a*75)+(c*30));
  if(b<=w)
  {
    std::cout<<"Boat is stable";
}
  else
  {
    std::cout<<"Boat will drow";
  }
  return 0;
}