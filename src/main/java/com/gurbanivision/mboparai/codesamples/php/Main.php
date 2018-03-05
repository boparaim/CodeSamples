<?php

namespace com\gurbanivision\mboparai\codesamples\php;

include 'SelectionStatements.php';

use com\gurbanivision\mboparai\codesamples\php\SelectionStatements as SelectionStatements;

/**
 * @author boparaim
 */
function selectionStatementsIf() {
    $selectionStatements = new SelectionStatements(5, 'dog');
    $selectionStatements->oneWayIfStatement();
    $selectionStatements->twoWayIfStatement();
    $selectionStatements->multiWayIfStatement();
    $selectionStatements->switchStatement();
    $selectionStatements->conditionalExpressionStatement();

}

selectionStatementsIf();