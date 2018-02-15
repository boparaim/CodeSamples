/**
 * node SelectionStatements.js
 * @author boparaim
 */

'use srict';
console.log('Init (using strict mode)');

function SelectionStatements(costShare, search) {
    this.administrativeCostPercentage = costShare;
    this.searchTerm = search;
}

SelectionStatements.prototype.donate = function(amount) {
    console.log('donate $'+amount+' to charity A');
    return amount;
};

SelectionStatements.prototype.showPictures = function(relatedTo) {
    console.log('images of '+relatedTo);
};

SelectionStatements.prototype.oneWayIfStatement = function() {
    if (this.administrativeCostPercentage < 5) {
        this.donate(50);
    }

    if (this.administrativeCostPercentage < 5)
        this.donate(50);
};

SelectionStatements.prototype.twoWayIfStatement = function() {
    if (this.administrativeCostPercentage < 5) {
        this.donate(50);
    }
    else {
        this.donate(30);
    }

    if (this.administrativeCostPercentage < 5)
        this.donate(50);
    else
        this.donate(30);
};

SelectionStatements.prototype.multiWayIfStatement = function() {
    if (this.administrativeCostPercentage < 5) {
        this.donate(50);
    }
    else if (this.administrativeCostPercentage < 10) {
        this.donate(40);
    }
    else {
        this.donate(30);
    }

    if (this.administrativeCostPercentage < 5)
        this.donate(50);
    else if (this.administrativeCostPercentage < 10)
        this.donate(40);
    else
        this.donate(30);
};

SelectionStatements.prototype.switchStatement = function() {
    switch (this.searchTerm) {
        case "dog":
            this.showPictures("dog");
            break;
        case "cat":
            this.showPictures("cat");
            break;
        default:
            this.showPictures("scorpion");
            break;
    }

    switch (this.searchTerm) {
        case "dog":
        case "puppy":
            this.showPictures("dog");
            break;
        default:
            this.showPictures("scorpion");
    }
};

SelectionStatements.prototype.conditionalExpression = function() {
    var donatedAmount = (this.administrativeCostPercentage < 5) ? this.donate(50) : this.donate(40);
        
    donatedAmount = (this.administrativeCostPercentage < 5) ? this.donate(50) 
                                : (this.administrativeCostPercentage < 10) ? this.donate(40) : this.donate(30);
};

var selectionStatements = new SelectionStatements(5, 'dog');
selectionStatements.oneWayIfStatement();
selectionStatements.twoWayIfStatement();
selectionStatements.multiWayIfStatement();
selectionStatements.switchStatement();
selectionStatements.conditionalExpression();