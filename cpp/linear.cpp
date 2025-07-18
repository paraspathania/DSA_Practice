#include<iostream>
using namespace std;


int linearSearch(int arr[], int n, int x){
    for(int i = 0; i< n; i++){
        if(arr[i] == x){
            return i; // Return the index if found
        }
    }
    return -1; // Return -1 if not found
}


int main(){
    int n , x;
    cout<<"Enter the size of an array: "<<endl;
    cin>>n;
    int arr [n];
    cout<<"Enter the elements of the array: "<<endl;
    for(int i = 0; i< n; i++){
        cin>>arr[i];
    }
    cout<<"Enter the element to search: "<<endl;
    cin>>x;
    int result = linearSearch(arr, n, x);
    cout<<"Element found at index: "<<result<<endl;
    return 0;
}