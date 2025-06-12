#include<bits/stdc++.h>
using namespace std;


struct Node{
    int data;
    Node* left;
    Node* right;
    Node(int val) : data(val), left(nullptr),right(nullptr) {}
};

void preorder(Node* root){
    if(root == nullptr) return ;
    cout << root->data << " "; 
    preorder(root->left);
     
    preorder(root->right);
}

int main(){

    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(0);
    cout << "Binary tree uccessfully." << endl;
    preorder(root);
    cout << endl;



}