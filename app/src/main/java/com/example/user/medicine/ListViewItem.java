package com.example.user.medicine;

public class ListViewItem {
    private String title1str;
    private String title2str;
    private String title3str;

    public void setTitle1(String title1){
        title1str = title1;
    }
    public void setTitle2(String title2){
        title2str = title2;
    }
    public void setTitle3(String title3){
        title3str = title3;
    }

    public String getTitle1(){
        return this.title1str;
    }
    public String getTitle2(){return this.title2str;}
    public String getTitle3(){
        return this.title3str;
    }
}
