<?php

namespace com\gurbanivision\mboparai\codesamples\php;

/**
 * @author boparaim
 */
class SelectionStatements {
    
    private $administrativeCostPercentage = '';
    private $searchTerm = 0;
    
    public function __construct($administrativeCostPercentage, $searchTerm) {
        $this->administrativeCostPercentage = $administrativeCostPercentage;
        $this->searchTerm = $searchTerm;
    }
    
    private function donate($amount) {
        print "donate \$$amount to charity A\n";
        return $amount;
    }

    private function showPictures($relatedTo) {
        print "images of $relatedTo\n";
    }

    public function oneWayIfStatement() {
        if ( $this->administrativeCostPercentage < 5) {
            $this->donate(50);
        }
        
        if ( $this->administrativeCostPercentage < 5)
            $this->donate(50);
    }

    public function twoWayIfStatement() {
        if ( $this->administrativeCostPercentage < 5) {
            $this->donate(50);
        }
        else {
            $this->donate(30);
        }
        
        if ( $this->administrativeCostPercentage < 5)
            $this->donate(50);
        else
            $this->donate(30);
    }

    public function multiWayIfStatement() {
        if ( $this->administrativeCostPercentage < 5) {
            $this->donate(50);
        }
        else if ( $this->administrativeCostPercentage < 10) {
            $this->donate(40);
        }
        else {
            $this->donate(30);
        }        
        
        if ( $this->administrativeCostPercentage < 5)
            $this->donate(50);
        else if ( $this->administrativeCostPercentage < 10)
            $this->donate(40);
        else
            $this->donate(30);
    }
    
    public function switchStatement() {
        switch ($this->searchTerm) {
            case "dog":
                $this->showPictures("dog");
                break;
            case "cat":
                $this->showPictures("cat");
                break;
            default:
                $this->showPictures("scorpion");
                break;
        }
        
        switch ($this->searchTerm) {
            case "dog":
            case "puppy":
                $this->showPictures("dog");
                break;
            default:
                $this->showPictures("scorpion");
        }
    }
    
    public function conditionalExpressionStatement() {
        $donatedAmount = ($this->administrativeCostPercentage < 5) ? $this->donate(50) : $this->donate(40);
        
        $donatedAmount = ($this->administrativeCostPercentage < 5) ? $this->donate(50) 
                            : ($this->administrativeCostPercentage < 10) ? $this->donate(40) : $this->donate(30);
    }
    
}