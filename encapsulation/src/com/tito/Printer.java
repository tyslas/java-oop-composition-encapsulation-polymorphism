package com.tito;

public class Printer {
  private int tonerLvl;
  private int pagesPrinted;
  private boolean isDuplex;
  private int printerPaper;

  public Printer(int tonerLvl, boolean isDuplex, int printerPaper) {
    if (tonerLvl >= 0 && tonerLvl <= 100 && printerPaper >= 0 && printerPaper <= 100) {
      this.tonerLvl = tonerLvl;
      this.pagesPrinted = 0;
      this.isDuplex = isDuplex;
      this.printerPaper = printerPaper;
    } else {
      System.out.println("check to make sure that you are trying to initialize the new Printer object with a toner level from 0-100%, inclusive, and that the amount of printer paper is from 0-100 pages, inclusive");
    }
  }

  public void fillToner(int fillPercent) {
    if ((fillPercent + tonerLvl <= 0) || (fillPercent + tonerLvl > 100)) {
      System.out.println("toner level must be from 0-100%");
      System.out.println("please fill an amount that will result with the level from 0-100%");
    } else {
      this.tonerLvl += fillPercent;
      System.out.println("you filled the toner up " + fillPercent + "%");
    }
  }

  public void printPage(int numPages, boolean dblSided) {
    if (numPages < 0) {
      System.out.println("cannot print a negative number of pages");
    } else if (checkPrinterPaper(numPages)) {
      System.out.println("must reload printer paper before printing");
    }
    else if (numPages > 0 && tonerLvl < numPages){
      System.out.println("not enough toner to print all the pages, please fill toner before proceeding");
    } else if (dblSided == true) {
      int numPrinted = calcPagesUsed(numPages);
      this.pagesPrinted += numPages;
      this.printerPaper -= numPrinted;
      this.tonerLvl -= numPages;
      System.out.println("printing double-sided pages");
      System.out.println("printed " + numPages + " pages for this job");
      System.out.println("toner level: " + this.tonerLvl + "%");
      System.out.println("total pages printed: " + this.pagesPrinted);
      System.out.println("pages left: " + this.printerPaper);
    } else {
      this.pagesPrinted += numPages;
      this.printerPaper -= numPages;
      this.tonerLvl -= numPages;
      System.out.println("printing single-sided pages");
      System.out.println("printed " + numPages + " pages for this job");
      System.out.println("toner level: " + this.tonerLvl + "%");
      System.out.println("total pages printed: " + this.pagesPrinted);
      System.out.println("pages left: " + this.printerPaper);
    }
  }

  public void fillPaper(int numPages) {
    if ((numPages + this.printerPaper) > 100) {
      System.out.println("printer can hold a maximum of 100 pages in the paper reservoir");
      System.out.println("please try loading fewer pages");
    } else if (numPages < 1) {
      System.out.println("must load at least 1 page, cannot load negative pages");
    } else {
      this.printerPaper += numPages;
      System.out.println("you loaded " + numPages + " pages");
      System.out.println("total pages in printer: " + this.printerPaper);
    }
  }

  private boolean checkPrinterPaper(int printedPagesWanted) {
    if (printedPagesWanted > this.printerPaper) {
      return true;
    } else {
      return false;
    }
  }

  private int calcPagesUsed(int numPages) {
    if (numPages % 2 == 0) {
      return numPages / 2;
    } else {
      return (numPages / 2) + 1;
    }
  }

  public int getTonerLvl() {
    return tonerLvl;
  }

  public int PagesPrinted() {
    return pagesPrinted;
  }

  public boolean isDuplex() {
    return isDuplex;
  }

  public int getPrinterPaper() {
    return printerPaper;
  }
}
