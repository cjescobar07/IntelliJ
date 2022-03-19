package com.syntax.class24;

public class Task1 {
    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented
    method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
    to open .doc file we need Microsoft word to be installed etc
     */
    public static void main(String[] args) {

        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File file : files) {
            file.open();
            file.edit();
            file.close();
            System.out.println("=========================");
        }
    }

}
abstract class File {
    void close() {
        System.out.println("Closing");
    }

    void edit() {
        System.out.println("Editing");
    }

    abstract void open();
}

class JavaFile extends File {

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("to open .pdf we need a pdf reader");
    }
}
