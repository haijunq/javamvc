package com.sattone;

public class StrModel {
    private String str = ""; 
    private String revstr = "";
    
    public StrModel(String str) {
        this.str = str;
        this.revstr = reverse(str);
    }
    
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
        this.revstr = reverse(str);
    }
    public String getRevstr() {
        return revstr;
    }
    
    public String reverse(String str) {
        char [] arr = str.toCharArray();
        reverse(arr);
        return new String(arr);
    }
    
    public void reverse(char [] arr) {
        int len = arr.length;
        char temp;
        for (int i=0; i<len/2; ++i) {
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
}
