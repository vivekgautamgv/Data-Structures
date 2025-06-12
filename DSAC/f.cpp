#include <bits/stdc++.h>
using namespace std;

int di(int dive, int divi) {
    int count = 0;

    while (dive >= divi) {
        dive = dive - divi;
        count++;
    }

    return count;
}

int main() {
    int n = 40;
    int m = 8;
    int result = di(n, m);
    cout << "The result of dividing " << n << " by " << m << " is: " << result << endl;

    return 0;
}
