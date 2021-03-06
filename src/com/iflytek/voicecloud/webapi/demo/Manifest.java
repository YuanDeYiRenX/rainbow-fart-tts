package com.iflytek.voicecloud.webapi.demo;

import java.util.List;

/**
 *  清单文件
 * @author jqpeng
 */
public class Manifest {

    private String name;

    private String displayName;

    private String avatar;

    private String avatarDark;
    private String version;
    private String description;
    private List languages;
    private String author;
    private String gender;
    private String locale;
    private List<Contribute> contributes;

    public Manifest(){

    }

    public Manifest(String name, String displayName, String avatar, String avatarDark, String version, String description, List languages, String author, String gender, String locale) {
        this.name = name;
        this.displayName = displayName;
        this.avatar = avatar;
        this.avatarDark = avatarDark;
        this.version = version;
        this.description = description;
        this.languages = languages;
        this.author = author;
        this.gender = gender;
        this.locale = locale;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarDark() {
        return avatarDark;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public List getLanguages() {
        return languages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public String getLocale() {
        return locale;
    }

    public List<Contribute> getContributes() {
        return contributes;
    }

    public void setContributes(List<Contribute> contributes) {
        this.contributes = contributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAvatarDark(String avatarDark) {
        this.avatarDark = avatarDark;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguages(List languages) {
        this.languages = languages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
