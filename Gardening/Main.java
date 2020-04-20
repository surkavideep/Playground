#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r>>c>>t;
  if((t>=(r+1))&&(t<=(2*r)))
  {
    std::cout<<"It is a mango tree";
  }
  else if((t>=((r*c)-(2*r)))&&(t<=(r*c)-r))
     {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
  return 0;
}
  