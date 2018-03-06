package com.ape.rxjavadoc.entitiy;

/**
 * Created by android on 18-3-6.
 */

public class Operator {
    /**
     * Not-null value.
     */
    private String name;
    /**
     * Not-null value.
     */
    private String thread;
    /**
     * Not-null value.
     */
    private String desc;
    /**
     * Not-null value.
     */
    private String img;
    /**
     * Not-null value.
     */
    private String url;

    public Operator(String name, String thread, String desc, String img, String url) {
        this.name = name;
        this.thread = thread;
        this.desc = desc;
        this.img = img;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
