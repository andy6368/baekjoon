#include <iostream>
using namespace std;
int main() {
	int N, M, i, j, k;
	int array[101] = {};
	cin >> N >> M;
	for (int a = 0; a < M; a++) {
		cin >> i >> j >> k;
		i = i - 1;
		for (i; i < j; i++) {
			array[i] = k;
		}
	}
	for (int a = 0; a < N; a++) {
		cout << array[a] << " ";
	}
	
}
