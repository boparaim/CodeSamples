package com.gurbanivision.mboparai.codesamples.java;

/**
 * @author boparaim
 */
public class SelectionStatements {

    private int administrativeCostPercentage;
    private String searchTerm;
    
    public SelectionStatements(int costShare, String search) {
        this.administrativeCostPercentage = costShare;
        this.searchTerm = search;
    }
    
    private int donate(int amount) {
        System.out.println("donate $"+amount+" to charity A");
        return amount;
    }
    
    private void showPictures(String relatedTo) {
        System.out.println("images of "+relatedTo);
    }
    
    private void oneWayIfStatement() {
        if (this.administrativeCostPercentage < 5) {
            this.donate(50);
        }
        
        if (this.administrativeCostPercentage < 5)
            this.donate(50);
    }
    
    private void twoWayIfStatement() {
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
    }
    
    private void multiWayIfStatement() {
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
    }
    
    private void switchStatement() {
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
    }
    
    private void conditionalExpressionStatement() {
        int donatedAmount = (this.administrativeCostPercentage < 5) ? this.donate(50) : this.donate(40);
        
        donatedAmount = (this.administrativeCostPercentage < 5) ? this.donate(50) 
                            : (this.administrativeCostPercentage < 10) ? this.donate(40) : this.donate(30);
    }
    
    public static void main(String[] args) {
        SelectionStatements selectionStatements = new SelectionStatements(5, "dog");
        selectionStatements.oneWayIfStatement();
        selectionStatements.twoWayIfStatement();
        selectionStatements.multiWayIfStatement();
        selectionStatements.switchStatement();
        selectionStatements.conditionalExpressionStatement();
    }
}
