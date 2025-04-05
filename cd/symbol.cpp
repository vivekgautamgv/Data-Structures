#include <iostream>
#include <iomanip> // For formatting table
using namespace std;

// Function to calculate factorial
int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

// Function to display the symbol table
void displaySymbolTable() {
    cout << "\nSymbol Table:\n";
    cout << left << setw(10) << "Address" 
         << setw(15) << "Name" 
         << setw(15) << "Type" 
         << setw(15) << "Scope" << endl;

    cout << "---------------------------------------------" << endl;

    cout << left << setw(10) << "1" 
         << setw(15) << "n" 
         << setw(15) << "int" 
         << setw(15) << "local (main)" << endl;

    cout << left << setw(10) << "2" 
         << setw(15) << "result" 
         << setw(15) << "int" 
         << setw(15) << "local (factorial)" << endl;

    cout << left << setw(10) << "3" 
         << setw(15) << "i" 
         << setw(15) << "int" 
         << setw(15) << "local (factorial)" << endl;

    cout << left << setw(10) << "4" 
         << setw(15) << "factorial" 
         << setw(15) << "function" 
         << setw(15) << "global" << endl;

    cout << left << setw(10) << "5" 
         << setw(15) << "main" 
         << setw(15) << "function" 
         << setw(15) << "global" << endl;
}

int main() {
    int n;
    cout << "Factorial Program Example:\n";
    cout << "Enter a number: ";
    cin >> n;

    int fact = factorial(n);
    cout << "Factorial of " << n << " is " << fact << endl;

    displaySymbolTable();

    return 0;
}
