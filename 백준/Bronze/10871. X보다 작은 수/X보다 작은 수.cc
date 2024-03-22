#include <iostream>
using namespace std;
int main() {
	int n, m = 0;
	int array[10000];
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		cin >> array[i];
	}
	for (int k = 0; k < n; k++) {
		if (array[k] < m) {
			cout << array[k] << " ";
		}
	}
	
}
