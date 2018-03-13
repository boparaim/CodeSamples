package com.gurbanivision.mboparai.blog

class SelectionStatements(_administrativeCostPercentage: Int = 0, _searchTerm: String) {

    var administrativeCostPercentage = _administrativeCostPercentage
    var searchTerm = _searchTerm

    private fun donate(amount: Int): Int {
        println("donate $$amount to charity A")
        return amount
    }

    private fun showPictures(relatedTo: String) {
        println("images of $relatedTo")
    }

    fun oneWayIfStatement() {
        if (this.administrativeCostPercentage < 5)
            this.donate(50)

        if (this.administrativeCostPercentage < 5) {
            this.donate(50)
        }
    }

    fun twoWayIfStatement() {
        if (this.administrativeCostPercentage < 5)
            this.donate(50)
        else
            this.donate(30)

        if (this.administrativeCostPercentage < 5) {
            this.donate(50)
        }
        else {
            this.donate(30)
        }
    }

    fun multiWayIfStatement() {
        if (this.administrativeCostPercentage < 5)
            this.donate(50)
        else if (this.administrativeCostPercentage < 10)
            this.donate(40)
        else
            this.donate(30)

        if (this.administrativeCostPercentage < 5) {
            this.donate(50)
        }
        else if (this.administrativeCostPercentage < 10) {
            this.donate(40)
        }
        else {
            this.donate(30)
        }
    }

    fun whenStatement() {
        when (this.searchTerm) {
            "dog" -> {
                this.showPictures("dog")
            }
            "cat" -> {
                this.showPictures("cat")
            }
            else -> {
                this.showPictures("scorpion")
            }
        }

        // single action: no curly braces
        // can use is Type or in Range or in Collection
        when (this.searchTerm) {
            "dog", "puppy" -> this.showPictures("dog")
            "CAT".toLowerCase() -> this.showPictures("cat")
            is String -> print("any expression can be used")
            in "a".."z" -> println()
            else -> this.showPictures("scorpion")
        }

        // no argument: if/else
        when {
            this.searchTerm.equals("dog") -> this.showPictures("dog")
            this.searchTerm.equals("cat") -> this.showPictures("cat")
            else -> this.showPictures("scorpion")
        }
    }

    fun ifConditionalExpressionStatement() {
        var donatedAmount = if (this.administrativeCostPercentage < 5) this.donate(50) else this.donate(40)
        donatedAmount = if (this.administrativeCostPercentage < 5) this.donate(50)
                        else if (this.administrativeCostPercentage < 10) this.donate(40)
                        else this.donate(30)
    }

}