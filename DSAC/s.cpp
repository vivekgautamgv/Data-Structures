#include<bits/stdc++.h>
using namespace std;

void vectorpair()
{
    

    vector<int> j(2,100);
    j.insert(j.begin(),300);

    j.insert(j.begin()+1,4,200);
    // for(int x :j){
    //     cout<<x<<" ";
    // }
    for(auto x : j){
        cout<<x<<" ";
    }   

    cout<<"\n"<<j.size()<<endl;

}

void deq(){

    deque<int> d;
    d.push_back(1);
    d.push_front(2);
    d.push_back(3); 
    d.push_front(4);

    for(auto x : d){
        cout<<x<<" ";
    }
}

void st(){
    stack<int> s;
    s.push(1);
    s.push(2);

      while(!s.empty()){
        cout << s.top() << " ";
        s.pop();
    }
}
int main(){
    st();
    cout<<"\n"<<endl;
    deq();

    vectorpair();
    return 0;
}



 

