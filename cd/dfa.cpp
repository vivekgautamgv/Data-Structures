#include <iostream>
#include <string>

using namespace std;

// Function to simulate DFA for (x|y)*yy
bool isAcceptedByDFA(const string& str) {
    int state = 0;

    for (char ch : str) {
        switch (state) {
            case 0:
                if (ch == 'x' || ch == 'y') state = (ch == 'x') ? 0 : 1;
                else return false;
                break;
            case 1:
                if (ch == 'x') state = 0;
                else if (ch == 'y') state = 2;
                else return false;
                break;
            case 2:
                if (ch == 'x') state = 0;
                else if (ch == 'y') state = 2;
                else return false;
                break;
        }
    }

    return (state == 2); // Accept if final state is 2 (ends with 'yy')
}

int main() {
    int n;
    cout << "How many strings do you want to check? ";
    cin >> n;

    while (n--) {
        string input;
        cout << "Enter string over {x, y}: ";
        cin >> input;

        if (isAcceptedByDFA(input)) {
            cout << "✅ Accepted by the DFA (matches (x|y)*yy)\n";
        } else {
            cout << "❌ Not accepted by the DFA\n";
        }
    }

    return 0;
}
