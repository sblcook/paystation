/**
 * Implementation of Receipt.
 *
 *
 * This source code is from the book "Flexible, Reliable Software: Using
 * Patterns and Agile Development" published 2010 by CRC Press. Author: Henrik B
 * Christensen Computer Science Department Aarhus University
 *
 * This source code is provided WITHOUT ANY WARRANTY either expressed or
 * implied. You may study, use, modify, and distribute it for non-commercial
 * purposes. For any commercial use, see http://www.baerbak.com/
 */
package paystation.domain;

public class ReceiptImpl implements Receipt {

    private double value;

    public ReceiptImpl(double value) {
        this.value = value;
    }

    @Override
    public double value() {
        return value;
    }
}
