package org.proper.day2.library;

public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;
    public void setTheName(String inputName){
        if (inputName.length()<5)
        {
            System.out.println("Book name is invalid");
        } else {
            this.name = inputName;
        }
        Book libraryBook = new Book();
        libraryBook.setTheName("SpiderMan");
    }
}
