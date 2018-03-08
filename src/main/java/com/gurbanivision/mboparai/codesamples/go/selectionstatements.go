//go install utils/blog

package blog

import "fmt"

type SelectionStatements struct {
	AdministrativeCostPercentage int
	SearchTerm                   string
}

func (this *SelectionStatements) donate(amount int) int {
	fmt.Printf("donate $%d to charity A\n", amount)
	return amount
}

func (this *SelectionStatements) showPictures(relatedTo string) {
	fmt.Printf("images of %s\n", relatedTo)
}

func (this *SelectionStatements) OneWayIfStatement() {
	// parantheses are optional
	if this.AdministrativeCostPercentage < 5 {
		this.donate(50)
	}

	if (this.AdministrativeCostPercentage < 5) {
		this.donate(50)
	}
}

func (this *SelectionStatements) TwoWayIfStatement() {
	if this.AdministrativeCostPercentage < 5 {
		this.donate(50)
	} else {
		this.donate(30)
	}

	if (this.AdministrativeCostPercentage < 5) {
		this.donate(50)
	} else {
		this.donate(30)
	}
}

func (this *SelectionStatements) MultiWayIfStatement() {
	if this.AdministrativeCostPercentage < 5 {
		this.donate(50)
	} else if this.AdministrativeCostPercentage < 10 {
		this.donate(40)
	} else {
		this.donate(30)
	}

	if (this.AdministrativeCostPercentage < 5) {
		this.donate(50)
	} else if (this.AdministrativeCostPercentage < 10) {
		this.donate(40)
	} else {
		this.donate(30)
	}
}

func (this *SelectionStatements) SwitchStatement() {
	// go only executes the matched case and then exits
	switch this.SearchTerm {
	case "dog":
		this.showPictures("dog")
	case "cat":
		this.showPictures("cat")
	default:
		this.showPictures("scorpion")
	}
}

func (this *SelectionStatements) ConditionalExpressionStatement() {
	//go doesn't have conditional expression equivalent
}
