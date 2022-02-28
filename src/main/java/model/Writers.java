package model;

public class Writers {
    private String writerName;
    private String book;
    private int price;

    public Writers(String writerName, String book, int price){
        this.writerName = writerName;
        this.book = book;
        this.price = price;
    }
    public String getWriterName(){
        return writerName;
    }
    public String getBook(){
        return book;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Writers{" +
                "writerName= " + writerName + '\''+
                ", book=" + book + '\''+
                ", price=" + price+
                '}';
    }

}
