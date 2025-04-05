#include<iostream>
#include<regex>
#include<string>
using namespace std;


bool isValidString(string s) {
    
}



int main() {
    string input;
    cout << "Enter a string over the alphabet {x, y}: ";
    cin >> input;

    if (isValidString(input)) {
        cout << "The string is recognized by the regular expression.\n";
    } else {
        cout << "The string is NOT recognized by the regular expression.\n";
    }

    return 0;
}