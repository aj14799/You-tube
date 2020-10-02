#include<iostream>
using namespace std;
 
int fact(int n) 
{
    if( n==0)
    {
        return 1;
    }

    else
    {
        return(n*fact(n-1));
    }
}
int main()
{
    int n1;
    cout<<"Enter Value: ";
    cin>>n1;
    cout<<fact(n1)<<endl;
}

