#include <iostream>
#include <string>
#include <memory>
#include <unordered_map>
class Node
{
public:
    std::string value;
    std::shared_ptr<Node> left;
    std::shared_ptr<Node> right;

    Node(std::string val, std::shared_ptr<Node> l = nullptr,
         std::shared_ptr<Node> r = nullptr)
        : value(val), left(l), right(r) {}
};
void printDAG(const std::shared_ptr<Node> &node, int level = 0, std::string prefix = "")
{
    if (!node)
        return;
    // Print current node
    for (int i = 0; i < level - 1; i++)
    {
        std::cout << " ";
    }
    if (level > 0)
    {
        std::cout << prefix;
    }
    std::cout << node->value << std::endl;
    // Print children with connection lines
    if (node->left)
    {
        printDAG(node->left, level + 1, "L--");
    }
    if (node->right)
    {
        printDAG(node->right, level + 1, "R--");
    }
}
std::shared_ptr<Node> createDAG()
{
    auto a1 = std::make_shared<Node>("a");
    auto b1 = std::make_shared<Node>("b");
    auto c = std::make_shared<Node>("c");
    auto d = std::make_shared<Node>("d");
    auto plus = std::make_shared<Node>("+", a1, b1);
    auto multiply = std::make_shared<Node>("*", plus, c);
    auto divide = std::make_shared<Node>("/", plus, d);
    auto root = std::make_shared<Node>("-", multiply, divide);
    return root;
}
double evaluateDAG(const std::shared_ptr<Node> &node,
                   const std::unordered_map<std::string, double> &values)
{
    if (!node->left && !node->right)
    {
        return values.at(node->value);
    }
    double leftVal = evaluateDAG(node->left, values);
    double rightVal = evaluateDAG(node->right, values);
    if (node->value == "+")
        return leftVal + rightVal;
    if (node->value == "-")
        return leftVal - rightVal;
    if (node->value == "*")
        return leftVal * rightVal;
    if (node->value == "/")
        return leftVal / rightVal;
    return 0.0;
}
int main()
{
    auto dag = createDAG();
    std::cout << "DAG structure with connections:" << std::endl;
    printDAG(dag);
    std::unordered_map<std::string, double> values = {
        {"a", 2.0},
        {"b", 3.0},
        {"c", 4.0},
        {"d", 5.0}};
    double result = evaluateDAG(dag, values);
    std::cout << "\nResult: " << result << std::endl;
    return 0;
}