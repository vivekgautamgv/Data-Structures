#include<bits/stdc++.h>
using namespace std;


int di(int dive,int divi){

        
    while(dive-divi> divi){
        int left = dive-divi;
        int count++;
        if(left == 0){
            return count;
        }

        else if (left<divi){
            return count;
        }
    
    }

    }
int main(){
    int n = 40;
    int m=8;
    int result = di(n,m);
    cout << "The result of dividing " << n << " by " << m << " is: " << result << endl;
    
}