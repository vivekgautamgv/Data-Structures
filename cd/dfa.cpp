#include <iostream>
#include <string>

using namespace std;

// DFA simulation for (x|y)*yy
bool isAcceptedByDFA(const string& input) {
    string state = "q0";

    for(char ch : input){
    
        // Check for invalid character
        if (ch != 'x' && ch != 'y') {
            return false; // Only 'x' and 'y' are allowed
        }
    
        // Transition based on current state and input character
        if (state == "q0") {
            if (ch == 'x') {
                state = "q0";
            } else if (ch == 'y') {
                state = "q1";
            }
        } else if (state == "q1") {
            if (ch == 'x') {
                state = "q0";
            } else if (ch == 'y') {
                state = "q2";
            }
        } else if (state == "q2") {
            if (ch == 'x') {
                state = "q0";
            } else if (ch == 'y') {
                state = "q2";
            }
        }
    }
    

    return state == "q2"; // Accept only if final state is q2
}

int main() {
    string input;
    cout << "Enter a string over {x, y}: ";
    cin >> input;

    if (isAcceptedByDFA(input)) {
        cout << "✅ The string is ACCEPTED by the DFA.\n";
    } else {
        cout << "❌ The string is REJECTED by the DFA.\n";
    }

    return 0;
}
