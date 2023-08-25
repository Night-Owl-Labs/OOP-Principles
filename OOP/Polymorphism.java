package OOP;

class Printer {
    void print(String content) {
        System.out.println("Printing: " + content);
    }
}

class LaserPrinter extends Printer {
    @Override
    void print(String content) {
        System.out.println("Laser printing: " + content);
    }
}

class InkjetPrinter extends Printer {
    @Override
    void print(String content) {
        System.out.println("Inkjet printing: " + content);
    }
}
