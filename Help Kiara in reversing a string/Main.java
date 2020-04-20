#include <iostream>
#include <cstdlib>
#include <cstring>
#include <vector>
#include <string>

using namespace std;
int main()
{



	//const int size = 128;
	string input;
	getline(cin, input);
	char *sa = new char[input.length()];

	for (int i = input.length(); i > 0; i--)
	{
		sa[i] = input[i-1];//this is getting the char's and storing them in an array
	}

	for (int i = input.length(); i > 0; i--)
	{
		cout << input[i-1];//all we are doing here is using the string to output the 

	}
	cout<< endl;

}