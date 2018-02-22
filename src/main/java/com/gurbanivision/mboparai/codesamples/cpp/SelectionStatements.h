/*
 * SelectionStatements.h
 *
 *  Created on: Feb 22, 2018
 *      Author: boparaim
 */

#ifndef SELECTIONSTATEMENTS_H_
#define SELECTIONSTATEMENTS_H_

#include <iostream>

using namespace std;

namespace blog_mboparai_utilities {
	class SelectionStatements {
		public:
			SelectionStatements(const int& constShare, const string& search);
			int donate(const int& amount);
			void showPictures(const string& relatedTo);
			void oneWayIfStatement();
			void twoWayIfStatement();
			void multiWayIfStatement();
			void switchStatement();
			void conditionalExpression();
			static void log(const string& msg);
		private:
			int administrativeCostPercentage;
			string searchTerm;
	};
}


#endif /* SELECTIONSTATEMENTS_H_ */
