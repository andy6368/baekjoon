#include <iostream>
using namespace std;
int main() {
	int h, m, w;
	cin >> h >> m;
	cin >> w;

	m = m + w;
	h = h + m / 60;

	if (m < 60) {
		cout << h << " " << m;
	}
	else if (m >= 60) {
		if (h >= 23) {
			h = h % 24;

		}
		m = m % 60;

		cout << h << " " << m;
	}
	
}
