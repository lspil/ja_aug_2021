package delivery.services;

import invoicing.services.InvoicingService;

public class DeliveryService {

  private InvoicingService invoiceService = new InvoicingService();

  public void deliver() {
    invoiceService.generateInvoice();
  }
}
