#include<iostream>
using namespace std;

// int binartSearch(int arr [], int n, int t){
    
// }

int main(){
    int n, t;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array: "<<endl;
    for(int i =0; i<n; i++){
        cin>>arr[i];
    }
    cout<<"Enter the element to be searched: ";
    cin>>t;

    cout<<"The size of an array is: "<<sizeof(arr)/sizeof(arr[0]);
}