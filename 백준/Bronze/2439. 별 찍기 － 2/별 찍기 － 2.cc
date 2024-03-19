#include <iostream>
using namespace std;
int main() {
	int T;
	cin >> T;
	for (int i = 1; i < T+1; i++) {
		for (int k = 0; k < T - i; k++) {
			cout << " ";
		}
		for (int k = 0; k < i; k++) {
			cout << "*";
		}
		cout << endl;
	}
}
