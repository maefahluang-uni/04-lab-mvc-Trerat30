package th.mfu;

import java.util.Date;

public class Concert {

    // TODO: add attributes
    private int id;
    private String title;
    private String perform;
    private String description;
    private Date date;

    public Concert() {
    }

    public Concert(String title, String description) {
        // TODO: set attributes
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        // TODO: return title
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        // TODO: return description
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerfrom(String perfrom) {
        return perfrom;
    }

    public void setPerfrom(String perform) {
        this.perform = perform;
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate(Date date) {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
