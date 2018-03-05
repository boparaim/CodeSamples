#!/usr/bin/perl
#
# @File Main.pl
# @Author root
# @Created 23-Feb-2018 3:29:24 PM
#

use strict;
use warnings;
use Data::Dumper;
use File::Basename qw(dirname);
use Cwd  qw(abs_path);

use lib dirname(abs_path $0);
use SelectionStatements; #qw(:everyting);

my $selectionStatements = new SelectionStatements(5, 'dog');
$selectionStatements->oneWayIfStatement();
$selectionStatements->twoWayIfStatement();
$selectionStatements->multiWayIfStatement();
#$selectionStatements->switchStatement();
$selectionStatements->conditionalExpression();
$selectionStatements->oneWayUnlessStatement();
$selectionStatements->twoWayUnlessStatement();
$selectionStatements->multiWayUnlessStatement();