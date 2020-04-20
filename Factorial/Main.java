#include <iostream>

using namespace std;
int main()
{
    
    void factorial();
    factorial();//call the metod 
   
    return 0;
}
void factorial(){//define a user define method to find factorial
int fact=1,n,i;
cin>>n;//get input from user
for(i=1; i<=n; i++){
   fact=fact*i;//find factorial using for loop
}
   cout<<"The factorial of "<<n<<" is "<<fact;
     //display factorial
}