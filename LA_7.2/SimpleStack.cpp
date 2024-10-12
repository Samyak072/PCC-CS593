#include <iostream>
#include <stdexcept>
#include <string>
using namespace std;
class StackFullException : public exception {
public:
    int size;
    StackFullException(int s) : size(s) {}
    const char* what() const noexcept override {
        return "[Full-5] ";
    }
};
class StackEmptyException : public exception {
public:
    const char* what() const noexcept override {
        return "[Empty]";
    }
};
template <typename T>
class GenSimpleStack {
    T* data;
    int tos;
    int maxSize;
public:
    GenSimpleStack(T* ds, int max) : data(ds), maxSize(max), tos(0) {}
    void push(T item) {
        if (isFull()) {
            throw StackFullException(maxSize);
        }
        data[tos++] = item;
    }
    void pop() {
        if (isEmpty()) {
            throw StackEmptyException();
        }
        cout << data[--tos] << " ";
    }
    bool isFull() const {
        return tos == maxSize;
    }
    bool isEmpty() const {
        return tos == 0;
    }
};
int main() {
    const int max = 5;
    string st[max];
    GenSimpleStack<string> stack(st, max);
    while (true) {
        int ch;
        cout << "Enter 0 to exit, 1 to push, 2 to pop: ";
        cin >> ch;

        switch (ch) {
            case 0:
                exit(0);
            case 1: {
                string item;
                cout << "Enter item to push: ";
                cin >> item;
                try {
                    stack.push(item);
                } catch (const StackFullException& e) {
                    cout << e.what();
                }
                break;
            }
            case 2:
                try {
                    stack.pop();
                } catch (const StackEmptyException& e) {
                    cout << e.what();
                }
                break;
        }
        cout << endl;
    }
    return 0;
}
