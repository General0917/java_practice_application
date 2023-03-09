package practice8_2;

import java.util.*;
import org.apache.commons.lang3.builder.*;

public class practice8_2 implements Comparable<practice8_2>, Cloneable{

    private String title;
    private Date publishDate;
    private String comment;

    public void setBook(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle(String title) {
        return this.title;
    }

    public String getComment(String comment) {
        return this.comment;
    }

    public Date getPublishDate(Date publishDate) {
        return this.publishDate;
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    public int compareTo(practice8_2 o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }

    public practice8_2 clone() {
        practice8_2 p2 = new practice8_2();
        p2.title = this.title;
        p2.comment = this.comment;
        p2.publishDate = (Date) this.publishDate.clone();
        return p2;
    }

    public static void main(String[] args) {
        practice8_2 p2 = new practice8_2();
        Date date = new Date();
        p2.setBook("test1", date, "test2");

        practice8_2 p3 = new practice8_2();
        practice8_2 p4 = new practice8_2();

        System.out.println(p2.getTitle(p2.title));
        System.out.println(p2.getComment(p2.comment));
        System.out.println(p2.getPublishDate(p2.publishDate));

        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(p4));
        System.out.println(p2.compareTo(p3));
        System.out.println(p2.compareTo(p4));
    }
}
