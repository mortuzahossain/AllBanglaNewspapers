package io.github.mortuzahossain.allbanglanewspapers.model;
/*
 * Created by mortuza on 23/6/20 | 11:59 AM for All Bangla Newspapers
 * Junior Programmer
 * Flora Systems
 * Email : mortuzahossain1997@gmail.com
 * Phone : +8801719200957
 * */


public class NewspaperModel {
    private String title;
    private String url;
    private int imageId;

    public NewspaperModel() {
    }

    public NewspaperModel(String title, String url, int imageId) {
        this.title = title;
        this.url = url;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public int getImageId() {
        return imageId;
    }
}
