package org.happys.model;

public enum Language {
    ZH_CN("简体中文"),
    EN("English");

    Language(String display) {
    }
    public static Language str2lang(String lang){
        switch (lang){
            case "zh_CN":
                return Language.ZH_CN;
            default:
                return Language.EN;
        }
    }

}
