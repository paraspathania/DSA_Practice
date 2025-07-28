#include <iostream>
using namespace std;
//using for-each loop to iteration

int main(){
int n;
cout << "Enter the value of n: " << endl;
cin >> n;   

int nums[n];
cout << "Enter " << n << " elements: " << endl;
for(int i = 0; i < n; i++) {
    cin >> nums[i];    
}

int count = 0;
int me  = nums[0];
for(int val : nums){
    if(count == 0){
        me = val;
    }
    if(val == me){
        count++;
    }else{
        count--;
    }
}
if(count > 0 && me != 0) {
    cout << "The majority element is: " << me << endl;
}
}