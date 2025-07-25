#include<iostream>
using namespace std;    

int main(){
    int n;
    cout<<"Enter the value of n: "<<endl;
    cin>>n;
    cout<<endl;
    int rows = n;
    cout<<"Right-angled Triangle Pattern: "<<endl;
    // This code prints a reverse right-angled triangle pattern using while loops
    while(rows>=1){
        int i = 1;
        while(i <= rows){
            cout<<"*";
            i++;
        }
        cout<<endl;
        rows--;
    }
    // cout<<endl;
    // This code prints a right-angled triangle pattern using while loops
    rows += 2; // Reset rows to original value plus 2 for the next pattern
    while(rows<=n){
        int i = 1;
        while(i <= rows){
            cout<<"*";
            i++;
        }
        cout<<endl;
        rows++;
    }
    cout<<endl;
// This code prints a diamond pattern using while loops
    cout<<"Diamond Pattern: "<<endl;
    int rows2 = 1;
    while(rows2 <= n){
        int  i = 1;
        while(i<=rows2){
            cout<<"*";
            i++;
        }
        cout<<endl;
        rows2++;
    }

    rows2 = n - 1;
    while (rows2 >= 1)
    {
        int i = 1;
        while(i <= rows2){
            cout<<"*";
            i++;
        }
        cout<<endl;
        rows2--;
    }
    

}