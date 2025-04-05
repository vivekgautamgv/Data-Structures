#include <iostream>
#include <regex>
#include <string>

using namespace std;

int main(){

    string str;

    getline(cin, str);

    regex patter1("(xy)+");
    regex pattern2("(yx)+");

    if(regex_match(str,patter1) || regex_match(str, pattern2)){
        cout<<"The string is recognized by the regular expression."<<endl;
    }else{
        cout<<"The string is NOT recognized by the regular expression."<<endl;
    }

    return 0;
}