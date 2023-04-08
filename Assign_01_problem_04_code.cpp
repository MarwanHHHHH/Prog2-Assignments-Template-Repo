//Marwan Waleed Mamdouh
//202106258
 
#include <iostream>
using namespace std;
 
int main() {
    int a, b, c;
    
    cin >> a >> b >> c;
    
    if (a <= b && a <= c) {
        cout << a << endl;
        if (b <= c) {
            cout << b << endl << c << endl;
        } else {
            cout << c << endl << b << endl;
        }
    } else if (b <= a && b <= c) {
        cout << b << endl;
        if (a <= c) {
            cout << a << endl << c << endl;
        } else {
            cout << c << endl << a << endl;
        }
    } else {
        cout << c << endl;
        if (a <= b) {
            cout << a << endl << b << endl;
        } else {
            cout << b << endl << a << endl;
        }
    }
    
    cout << endl;
    cout << a << endl << b << endl << c << endl;
    
    return 0;
}