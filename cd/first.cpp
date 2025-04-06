#include <iostream>
#include <map>
#include <set>
#include <vector>
#include <string>

using namespace std;

map<string, vector<vector<string>>> grammar;
map<string, set<string>> first;

// Check if a symbol is terminal
bool isTerminal(const string& symbol) {
    return !(symbol[0] >= 'A' && symbol[0] <= 'Z');
}

// Compute FIRST of a non-terminal
void computeFirst(const string& symbol) {
    //if (!first[symbol].empty()) return;

    for (auto prod : grammar[symbol]) {
        bool epsilonPossible = true;

        for (auto part : prod) {
            if (isTerminal(part)) {
                first[symbol].insert(part);
                epsilonPossible = false;
                break;
            } else {
                computeFirst(part);
                for (auto f : first[part]) {
                    if (f != "ε") first[symbol].insert(f);
                }
                if (first[part].count("ε") == 0) {
                    epsilonPossible = false;
                    break;
                }
            }
        }

        if (epsilonPossible)
            first[symbol].insert("ε");
    }
}

int main() {
 
    grammar["E"]  = { {"T", "E'"} };
    grammar["E'"] = { {"+", "T", "E'"}, {"ε"} };
    grammar["T"]  = { {"F", "T'"} };
    grammar["T'"] = { {"*", "F", "T'"}, {"ε"} };
    grammar["F"]  = { {"(", "E", ")"}, {"id"} };

    // Compute FIRST sets
    for (auto& rule : grammar) {
        computeFirst(rule.first);
    }

    // Print FIRST sets
    for (auto& f : first) {
        cout << "First(" << f.first << ") = { ";
        for (auto& s : f.second) {
            cout << s << " ";
        }
        cout << "}" << endl;
    }

    return 0;
}
