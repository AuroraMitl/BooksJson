package model;

import java.util.List;

public class Root {
    private String booksShop;
    private List<Writers> writers;
    private List<Integer> listOfNumbers;

    public String getBooksShop(String booksShop){
        return booksShop;
    }

    public List<Writers> getWriters(){
        return writers;
    }

    public  void setListOfNumbers(List<Integer> listOfNumbers){
        this.listOfNumbers = listOfNumbers;
    }

    public  void setBooksShop(String booksShop){
        this.booksShop = booksShop;
    }

    public void setWriters(List<Writers> writers){
        this.writers = writers;
    }
    @Override
    public String toString(){
        return "Root{" +
                "booksShop= " + booksShop + '\''+
                ", writers=" + writers+
                        '}';
    }

}
