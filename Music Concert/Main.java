#include <iostream>
using namespace std;
int main()
{
    int arr[100];
    int i,size,odd=0,even=0;
    cin>>size;//read input from the user for array size
    for(i=0; i<size; i++)
    {
        cin>>arr[i];//read input from the user for array elements
    }
    for(i=0; i<size; i++)
    {
        if(arr[i]%2==0)
        {
            even++;
        }
        else{
            odd++;
        }
    }
    cout<<odd<<"\n";
    cout<<even;
    return 0;
}