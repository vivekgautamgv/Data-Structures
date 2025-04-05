#include<iostream>
#include<string>
#include<regex>

using namespace std;

// Move the function here
bool isvalid(const string& input) {
    string state = "q0";

    for (int i = 0; i < input.length(); i++) {
        char ch = input[i];

        if (ch != 'x' && ch != 'y') {
            return false;
        }

        if (state == "q0") {
            if (ch == 'x') state = "q0";
            else if (ch == 'y') state = "q1";
        } else if (state == "q1") {
            if (ch == 'x') state = "q0";
            else if (ch == 'y') state = "q2";
        } else if (state == "q2") {
            if (ch == 'x') state = "q0";
            else if (ch == 'y') state = "q2";
        }
    }

    return state == "q2"; // <== You forgot this line!
}

int main() {
    string input;
    cout << "Enter a string over {x, y}: ";
    cin >> input;

    if (isvalid(input)) {
        cout << "✅ The string is ACCEPTED by the DFA.\n";
    } else {
        cout << "❌ The string is REJECTED by the DFA.\n";
    }

    return 0;
}
