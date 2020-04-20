#include <iostream>
using namespace std;

int calculatePower(int, int);

int main()
{
    int m, n, req;

 
    std::cin >> m>>n>>req;

    int result = calculatePower(m,n);
  if(result>=req){
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
   

    return 0;
}

int calculatePower(int m, int n)
{
    if (n!= 0)
        return (m*calculatePower(m, n-1));
    else
        return 1;
}