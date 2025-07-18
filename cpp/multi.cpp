#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the value of n: "<<endl;
    cin>>n;
    while(n <= 5){
        int i = 1;
        while(i <= 5){
            cout<<"( "<<n<<", "<<i<<" )";
            i++;
        }
        cout<<endl;
        n++;
    }
}