package io.codelex.oop.summary.exercise2;


public class Invoice {
    private Order order;
    private int invoiceNumber;
    private InvoiceStatus invoiceStatus = InvoiceStatus.APPROVED;
    private double priceWithoutVat;
    private double priceWithVat;

    public Invoice(Order order, int invoiceNumber) throws WrongOrderException {
        if (order.items.size() == 0) {
            throw new WrongOrderException("Order is empty, please add items to order.");
        } else {
            this.order = order;
            this.invoiceNumber = invoiceNumber;
        }
    }

    public void send() {
        this.invoiceStatus = InvoiceStatus.SENT;
    }

    public String printInvoice() {
        double sum = order.items.stream().map(i -> i.getPrice()).reduce(Double.valueOf(0), Double::sum);
        double vat = sum * 0.21;
        double total = sum + (sum * 0.21);
        String fullLine = "===================================================\n";
        StringBuilder details = new StringBuilder();

        details.append(fullLine);

        String invoiceNumberString = String.format("= INVOICE NUMBER: %s", invoiceNumber);
        details.append(invoiceNumberString + String.format("%s", " ".repeat(fullLine.length() - invoiceNumberString.length() - 2)) + "=\n");

        String invoiceStatusString = String.format("= STATUS: %s", invoiceStatus);
        details.append(invoiceStatusString + String.format("%s", " ".repeat(fullLine.length() - invoiceStatusString.length() - 2)) + "=\n");

        int c = 0;
        for (Item item : order.items) {
            c++;
            String itemString = String.format("= %s. %s", c, item.getFullInfo());
            details.append(itemString + String.format("%s", " ".repeat(fullLine.length() - itemString.length() - 2)) + "=\n");
        }

        String invoiceSumString = String.format("= SUM: %.2f EUR", sum);
        details.append(invoiceSumString + String.format("%s", " ".repeat(fullLine.length() - invoiceSumString.length() - 2)) + "=\n");

        String invoiceVatString = String.format("= VAT (21%%) %.2f EUR", vat);
        details.append(invoiceVatString + String.format("%s", " ".repeat(fullLine.length() - invoiceVatString.length() - 2)) + "=\n");

        String invoiceTotalString = String.format("= TOTAL: %.2f EUR", total);
        details.append(invoiceTotalString + String.format("%s", " ".repeat(fullLine.length() - invoiceTotalString.length() - 2)) + "=\n");

        details.append(fullLine);

        return details.toString();
    }
}
