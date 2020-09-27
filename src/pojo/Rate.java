package pojo;

import java.util.Date;

public class Rate {
    private Integer userid;

    private String movname;

    private String pinglun;

    private Integer rate;

    private Date time;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMovname() {
        return movname;
    }

    public void setMovname(String movname) {
        this.movname = movname == null ? null : movname.trim();
    }

    public String getPinglun() {
        return pinglun;
    }

    public void setPinglun(String pinglun) {
        this.pinglun = pinglun == null ? null : pinglun.trim();
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}