/**
 * cpp SelectionStatements.cpp
 * @author boparaim
 */

#include <cstdlib>

#include "SelectionStatements.h"

using namespace blog_mboparai_utilities;

SelectionStatements::SelectionStatements(const int& costShare, const string& search) {
	this->administrativeCostPercentage = costShare;
	this->searchTerm = search;
}

int SelectionStatements::donate(const int& amount) {
	SelectionStatements::log("donate $"+to_string(amount)+" to charity A");
	return amount;
}

void SelectionStatements::showPictures(const string& relatedTo) {
	SelectionStatements::log("images of "+relatedTo);
}

void SelectionStatements::oneWayIfStatement() {
	if (this->administrativeCostPercentage < 5) {
		this->donate(50);
	}

	if (this->administrativeCostPercentage < 5)
		this->donate(50);
}

void SelectionStatements::twoWayIfStatement() {
	if (this->administrativeCostPercentage < 5) {
		this->donate(50);
	}
	else {
		this->donate(30);
	}

	if (this->administrativeCostPercentage < 5)
		this->donate(50);
	else
		this->donate(30);
}

void SelectionStatements::multiWayIfStatement() {
	if (this->administrativeCostPercentage < 5) {
		this->donate(50);
	}
	else if (this->administrativeCostPercentage < 10) {
		this->donate(40);
	}
	else {
		this->donate(30);
	}

	if (this->administrativeCostPercentage < 5)
		this->donate(50);
	else if (this->administrativeCostPercentage < 10)
		this->donate(40);
	else
		this->donate(30);
}

void SelectionStatements::switchStatement() {
	//any expression of integral or enumeration type, or of a class type contextually
	//implicitly convertible to an integral or enumeration type, or a declaration of
	//a single non-array variable of such type with a brace-or-equals initializer.
	int integer = 200;
	switch (integer) {
		case 100:
			this->showPictures("dog");
			break;
		case 200:
			this->showPictures("cat");
			break;
		default:
			this->showPictures("scorpion");
			break;
	}

	switch (integer) {
		case 100:
		case 200:
			this->showPictures("dog");
			break;
		default:
			this->showPictures("scorpion");
	}
}

void SelectionStatements::conditionalExpression() {
	int donatedAmount = (this->administrativeCostPercentage < 5) ? this->donate(50) : this->donate(40);

	donatedAmount = (this->administrativeCostPercentage < 5) ? this->donate(50)
								: (this->administrativeCostPercentage < 10) ? this->donate(40) : this->donate(30);
}

void SelectionStatements::log(const string& msg) {
	cout << msg << endl;
}

