#!/usr/bin/perl
#
# @File SelectionStatements.pl
# @Author boparaim
# @Created 23-Feb-2018 11:39:48 AM
#
# perl /path/SelectionStatements.pl
#

package SelectionStatements;

use strict;
use warnings;
use Data::Dumper;
#use Switch;

# constructor
sub new {
    my $class = shift;
    my $self = {
            _administrativeCostPercentage => shift,
            _searchTerm => shift
        };
    bless $self, $class;
    return $self;
}

# methods
sub donate {
    my ($self, $amount) = @_;
    print "donate \$$amount to charity A\n";
    return $amount;
}

sub showPictures {
    my ($self, $relatedTo) = @_;
    print "images of $relatedTo";
};

sub oneWayIfStatement {
    my ($self) = @_;
    # braces are required with even single action
    if ( $self->{_administrativeCostPercentage} < 5) {
        $self->donate(50);
    }
};

sub twoWayIfStatement {
    my ($self) = @_;
    if ( $self->{_administrativeCostPercentage} < 5) {
        $self->donate(50);
    }
    else {
        $self->donate(30);
    }
};

sub multiWayIfStatement {
    my ($self) = @_;
    if ( $self->{_administrativeCostPercentage} < 5) {
        $self->donate(50);
    }
    elsif ( $self->{_administrativeCostPercentage} < 10) {
        $self->donate(40);
    }
    else {
        $self->donate(30);
    }
};

=sdf
# requires Switch module
sub switchStatement {
    my ($self) = @_;
    switch($self->_searchTerm) {
        case ('dog') {
            $self->showPictures('dog');
        }
        case ('cat') {
            $self->showPictures('cat');
        }
        case 0 { 
            print "0";
        }
        case "a" {
            print "a";
        }
        case [0..5,10] {
            print "0..5 or 10";
        }
        case (\@array){
            print "number is in list";
        }
        case (\%hash) {
            print "key in hash";
        }
        case (\&sub) {
            print "arg to subroutine";
        }
        # default case
        else {
            print "previous case not true";
        }
    }
};
=cut

sub conditionalExpression {
    my ($self) = @_;
    my $donatedAmount = ($self->{_administrativeCostPercentage} < 5) ? $self->donate(50) : $self->donate(40);
    $donatedAmount = ($self->{_administrativeCostPercentage} < 5) ? $self->donate(50) : ($self->{_administrativeCostPercentage} < 10) ? $self->donate(40) : $self->donate(40);
}

sub oneWayUnlessStatement {
    my ($self) = @_;
    # opposite of if (executes if expression is false)
    unless ( $self->{_administrativeCostPercentage} < 10) {
        $self->donate(30);
    }
}

sub twoWayUnlessStatement {
    my ($self) = @_;
    unless ( $self->{_administrativeCostPercentage} < 10) {
        $self->donate(30);
    }
    else {
        $self->donate(50);
    }
};

sub multiWayUnlessStatement {
    my ($self) = @_;
    unless ( $self->{_administrativeCostPercentage} < 10) {
        $self->donate(30);
    }
    elsif ( $self->{_administrativeCostPercentage} < 5) {
        $self->donate(40);
    }
    else {
        $self->donate(50);
    }
};

# perl module must return TRUE
1;

# this works too
#package main;
#my $selectionStatements = new SelectionStatements(5, 'dog');
#$selectionStatements->oneWayIfStatement();