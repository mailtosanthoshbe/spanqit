package pers.aprakash.spanqit.constraint;

/**
 * Represents a SPARQL connective operation, which takes an arbitrary number of
 * arguments
 * 
 * @author Ankit
 *
 */
class ConnectiveOperation extends Operation<ConnectiveOperation> {
	ConnectiveOperation(ConnectiveOperator operator) {
		super(operator);
	}
}