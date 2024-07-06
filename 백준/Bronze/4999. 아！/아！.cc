#include <iostream>
#include <string>
using namespace std;

int main() {
	string x, y;
	getline(cin, x, '\n');
	getline(cin, y, '\n');

	if (x.size() >= y.size()) cout << "go";
	else cout << "no";




}