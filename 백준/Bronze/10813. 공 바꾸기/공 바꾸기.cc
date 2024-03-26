#include <iostream>
using namespace std;
int main() {
	int N, M, i, j;
	int array[101] = {};
	cin >> N >> M;
	for (int a = 0; a < N; a++) {
		array[a] = a + 1;
	}
	for (int b = 0; b < M; b++) {
		cin >> i >> j;
		int k = array[i - 1];
		array[i - 1] = array[j - 1];
		array[j - 1] = k;
	}
	for (int a = 0; a < N; a++) {
		cout << array[a] << " ";
	}
	
}
