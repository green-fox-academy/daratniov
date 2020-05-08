package com.greenfoxacademy.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CamelizerText {

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String text;
  private String translated;
  private String lang;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public void camelize() {
    if (lang.matches("hu")) {
      translated=convertToTeve(text);
      lang = "teve";
    } else if (lang.matches("en")) {
      translated=convertToGibberish(text);
      lang = "gibberish";
    }
  }

  private String convertToTeve(String text){
    String vowels="öüóúőoiueaéáűí";
    String convertedString="";
    String character="";
    for (int i = 0; i <text.length() ; i++) {
      convertedString+=text.charAt(i);
      character=text.substring(i,i+1).toLowerCase();
     if(vowels.contains(character)){
       convertedString+="v"+character;
     }
    }
    return convertedString;
  }

  private String convertToGibberish(String text){
    String vowels="aeiou";
    String convertedString="";
    String character="";
    for (int i = 0; i <text.length() ; i++) {
      character=text.substring(i,i+1).toLowerCase();
      if(vowels.contains(character)){
        convertedString+="aig";
      }
      convertedString+=text.charAt(i);
    }
    return convertedString;
  }
}
