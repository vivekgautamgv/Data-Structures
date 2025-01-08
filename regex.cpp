#include <iostream>
#include <regex>
using namespace std;

int main() {
    string str;
    cin >> str;
    regex pattern("^x.*yy$");
    if (regex_match(str, pattern))
        cout << "Valid" << endl;
    else
        cout << "Invalid op" << endl;
    return 0;
}