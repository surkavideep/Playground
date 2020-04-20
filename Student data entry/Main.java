#include <iostream>
using namespace std;
struct Student{
   char name[30];
   int roll;
   int marks;
};
void printStudentInfo(Student);
int main(){
   Student s;
   cin.getline(s.name, 30);
   cin>>s.roll;
   cin>>s.marks;
   printStudentInfo(s);
   return 0;
}
void printStudentInfo(Student s){
   cout<<"\nStudent Details"<<endl;
   cout<<"Name: "<<s.name<<endl;
   cout<<"Roll: "<<s.roll<<endl;
   cout<<"Marks: "<<s.marks;
}