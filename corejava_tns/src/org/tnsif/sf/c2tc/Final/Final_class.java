package org.tnsif.sf.c2tc.Final;

// Government ID generator
class AadhaarGenerator
{
    final void generateID()  // method can't be overridden
    {
        System.out.println("Generated Aadhaar card ");
    }
}

class Myaadhar extends AadhaarGenerator
{
    // Can't override generateID() because it's final in parent
    void showInfo()
    {
        System.out.println("This is my Aadhaar");
    }
}

public class Final_class {

    public static void main(String[] args) {
        Myaadhar obj = new Myaadhar();
        obj.generateID();  // from parent
        obj.showInfo();    // from child
    }
}
