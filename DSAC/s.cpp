#include<bits/stdc++.h>
using namespace std;

int sum(int a , int b){
    return a-b;
}

void print(){
    cout<<"raj"<<endl;
}


void exppair(){
    pair<int,int> p = {1,2};
    cout<<p.first<<" "<<p.second<<endl;

    pair<int, pair<int,int>> p1 = {1,{1,2}};
    cout<<p1.first<<" "<<p1.second.first<<" "<<p1.second.second<<endl;

    pair<int,int> p2[] = {{1,2},{2,3},{3,4}};
    cout<<p2[0].first<<" "<<p2[0].second<<endl;



}


void vectorpair()
{
    vector<int> v;

    v.push_back(2);
    v.emplace_back(3);
    cout<<v[0]<<" "<<v[1]<<endl;



}
int main(){
    
    print();
    cout<<sum(10,20)<<endl;
    vectorpair();
    exppair();
    return 0;
}



 

