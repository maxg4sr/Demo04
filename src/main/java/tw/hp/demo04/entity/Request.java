package tw.hp.demo04.entity;

import java.util.Date;

public class Request {
    private Integer id;
    private String name;
    private String phone;
    private String person;
    private String line;
    private Date date;
    private String project;
    private String how;
    private String location;
    private String sayHow;
    private String datetime; // 新增這個字段
    private String message; // 新增這個字段

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSayHow() {
        return sayHow;
    }

    public void setSayHow(String sayHow) {
        this.sayHow = sayHow;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", person='" + person + '\'' +
                ", line='" + line + '\'' +
                ", date=" + date +
                ", project='" + project + '\'' +
                ", how='" + how + '\'' +
                ", location='" + location + '\'' +
                ", sayHow='" + sayHow + '\'' +
                ", datetime='" + datetime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
