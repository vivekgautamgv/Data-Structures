#include <iostream>
#include <string>

using namespace std;

// Function to check if a string starts with 'x' and ends with 'y'
bool isValidString(const string& str) {
    if (str.length() < 2) return false; // minimum length for valid string
    if (str[0] == 'x' && str[str.length() - 1] == 'y') {
        for (char ch : str) {
            if (ch != 'x' && ch != 'y') {
                return false; // invalid character
            }
        }
        return true;
    }
    return false;
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
