// #include<iostream>
// #include<unordered_map>
// #include<unordered_set>
// #include<stack>
// #include<vector>

// using namespace std;

#include <iostream>
#include <vector>
using namespace std;

struct Node {
    string op, arg1, arg2, result;
};

int main() {
    vector<Node> dag = {{"+", "a", "b", "t1"}, {"*", "t1", "c", "t2"}};
    cout << "DAG Representation:\n";
    for (auto &node : dag) {
        cout << node.result << " = " << node.arg1 << " " << node.op << " " << node.arg2 << "\n";
    }
    return 0;
}