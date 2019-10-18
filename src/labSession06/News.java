package labSession06;

import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public static void main(String[] args) {
        News n = new News(1, "Title", "Today", "Me", "Content");
        n.calculate();
        n.display();
    }

    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public void calculate() {
        int[] rateList = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap danh gia dau tien: ");
        rateList[0] = scan.nextInt();
        System.out.println("Nhap danh gia thu hai: ");
        rateList[1] = scan.nextInt();
        System.out.println("Nhap danh gia thu ba: ");
        rateList[2] = scan.nextInt();
        averageRate = (rateList[0] + rateList[1] + rateList[2])/3;
    }

    @Override
    public void display() {
        System.out.printf("Title: %s%nPublish: %s%nAuthor: %s%nContent: %s%nAverage rate: %.1f",
                getTitle(), getPublishDate(), getAuthor(), getContent(), getAverageRate());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }
}
