package pojo;

import java.util.Date;

public class Movie {
    private Integer movieid;

    private String movname;

    private String movtype;

    private Date time;

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getMovname() {
        return movname;
    }

    public void setMovname(String movname) {
        this.movname = movname == null ? null : movname.trim();
    }

    public String getMovtype() {
        return movtype;
    }

    public void setMovtype(String movtype) {
        this.movtype = movtype == null ? null : movtype.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}