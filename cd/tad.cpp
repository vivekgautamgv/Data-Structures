#include <iostream>
#include <stack>
#include <vector>
#include <map>
#include <cctype>

using namespace std;

struct Quadruple {
    string op, arg1, arg2, result;
};

struct Triple {
    string op, arg1, arg2;
};

int precedence(char op) {
    if (op == '+' || op == '-') return 1;
    if (op == '*' || op == '/') return 2;
    return 0;
}

bool isOperator(char ch) {
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}

vector<string> infixToPostfix(const string& expr) {
    vector<string> output;
    stack<char> ops;
    for (int i = 0; i < expr.length(); ++i) {
        char ch = expr[i];

        if (isspace(ch)) continue;

        if (isalnum(ch)) {
            string operand(1, ch);
            output.push_back(operand);
        }
        else if (ch == '(') {
            ops.push(ch);
        }
        else if (ch == ')') {
            while (!ops.empty() && ops.top() != '(') {
                output.push_back(string(1, ops.top()));
                ops.pop();
            }
            if (!ops.empty()) ops.pop(); // pop '('
        }
        else if (isOperator(ch)) {
            while (!ops.empty() && precedence(ops.top()) >= precedence(ch)) {
                output.push_back(string(1, ops.top()));
                ops.pop();
            }
            ops.push(ch);
        }
    }

    while (!ops.empty()) {
        output.push_back(string(1, ops.top()));
        ops.pop();
    }

    return output;
}

void generateIR(const vector<string>& postfix) {
    stack<string> st;
    vector<string> tac;
    vector<Quadruple> quads;
    vector<Triple> triples;
    int tempCount = 1;

    for (const auto& token : postfix) {
        if (isOperator(token[0]) && token.length() == 1) {
            string arg2 = st.top(); st.pop();
            string arg1 = st.top(); st.pop();
            string result = "t" + to_string(tempCount++);

            tac.push_back(result + " = " + arg1 + " " + token + " " + arg2);
            quads.push_back({ token, arg1, arg2, result });
            triples.push_back({ token, arg1, arg2 });

            st.push(result);
        }
        else {
            st.push(token);
        }
    }

    cout << "\n--- Three Address Code (TAC) ---\n";
    for (auto& line : tac) cout << line << endl;

    cout << "\n--- Quadruple Representation ---\n";
    cout << "Index\tOp\tArg1\tArg2\tResult\n";
    for (int i = 0; i < quads.size(); ++i) {
        cout << i + 1 << "\t" << quads[i].op << "\t" << quads[i].arg1 << "\t" << quads[i].arg2 << "\t" << quads[i].result << endl;
    }

    cout << "\n--- Triple Representation ---\n";
    cout << "Index\tOp\tArg1\tArg2\n";
    for (int i = 0; i < triples.size(); ++i) {
        cout << i << "\t" << triples[i].op << "\t" << triples[i].arg1 << "\t" << triples[i].arg2 << endl;
    }
}

int main() {
    string expr;
    cout << "Enter a valid arithmetic expression (e.g., (a+b)*(c+d)): ";
    getline(cin, expr);

    auto postfix = infixToPostfix(expr);

    cout << "\nPostfix: ";
    for (const auto& token : postfix) cout << token << " ";
    cout << endl;

    generateIR(postfix);

    return 0;
}
