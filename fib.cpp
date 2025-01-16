#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct SymbolTableEntry {
    string name;
    string dataType;
    string scope;
};

int main() {
    // Create a vector to hold the symbol table entries
    vector<SymbolTableEntry> symbolTable;

    // Function identifiers
    symbolTable.push_back({"main", "int", "Global"});

    // Variable identifiers for Fibonacci series
    symbolTable.push_back({"numTerms", "int", "Local (main)"});
    symbolTable.push_back({"i", "int", "Local (main)"});
    symbolTable.push_back({"a", "int", "Local (main)"});
    symbolTable.push_back({"b", "int", "Local (main)"});
    symbolTable.push_back({"nextTerm", "int", "Local (main)"});
    symbolTable.push_back({"fibonacci", "int[]", "Local (main)"});

    // Display the symbol table
    cout << "Symbol Table:" << endl;
    cout << "Name\t\tData Type\tScope" << endl;
    for (const auto& entry : symbolTable) {
        cout << entry.name << "\t\t" << entry.dataType << "\t\t" << entry.scope << endl;
    }

    return 0;
}
