#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	int n, v;
	cin >> n;
	int array[101];
	for (int i = 0; i < n; i++) {
		cin >> array[i];
	}
	cin >> v;
	cout << count(array, array + n, v);
	
}
