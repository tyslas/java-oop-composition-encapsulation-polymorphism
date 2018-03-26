package com.tito;

public class Printer {
  private int tonerLvl;
  private int pagesPrinted;
  private boolean isDuplex;
  private int printerPaper;

  public Printer(int tonerLvl, int pagesPrinted, boolean isDuplex, int printerPaper) {
    this.tonerLvl = tonerLvl;
    this.pagesPrinted = pagesPrinted;
    this.isDuplex = isDuplex;
    this.printerPaper = printerPaper;
  }

  public void fillToner(int fillPercent) {
    if ((fillPercent + tonerLvl <= 0) || (fillPercent + tonerLvl > 100)) {
      System.out.println("toner level must be from 0-100%");
      System.out.println("please fill a different amount");
    } else {
      this.tonerLvl += fillPercent;
    }
    System.out.println("the toner level is now at " + this.tonerLvl + "%");
  }

  public void printPage(int numPages, boolean dblSided) {
    if (numPages < 0) {
      System.out.println("cannot print a negative number of pages");
    } else if (checkPrinterPaper(numPages)) {
      System.out.println("must reload printer paper before printing");
    }
    else if (numPages > 0 && tonerLvl < numPages){
      System.out.println("the toner must be filled before printing");
    } else if (dblSided == true) {
      this.pagesPrinted += numPages;
      this.printerPaper -= (numPages/2);
      this.tonerLvl -= numPages;
      System.out.println("this printer has now printed " + this.pagesPrinted + " pages");
      System.out.println("toner level: " + this.tonerLvl);
      System.out.println("pages printed: " + this.pagesPrinted);
      System.out.println("pages left: " + this.printerPaper);
    } else {
      this.pagesPrinted += numPages;
      this.printerPaper -= numPages;
      this.tonerLvl -= numPages;
      System.out.println("this printer has now printed " + this.pagesPrinted + " pages");
      System.out.println("toner level: " + this.tonerLvl);
      System.out.println("pages printed: " + this.pagesPrinted);
      System.out.println("pages left: " + this.printerPaper);
    }
  }

  private boolean checkPrinterPaper(int printedPagesWanted) {
    if (printedPagesWanted > this.printerPaper) {
      return true;
    } else {
      return false;
    }
  }

  public int getTonerLvl() {
    return tonerLvl;
  }

  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public boolean isDuplex() {
    return isDuplex;
  }

  public int getPrinterPaper() {
    return printerPaper;
  }
}
