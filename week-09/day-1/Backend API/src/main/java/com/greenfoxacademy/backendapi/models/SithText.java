package com.greenfoxacademy.backendapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SithText {

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String text;
  @JsonProperty("sith_text")
  private String sithText;
  @JsonIgnore
  private List<String> yodaWords;

  public SithText() {
    this.yodaWords = Arrays.asList("Arrgh.", "Uhmm.", "Err..err.err.", "Hmmm.");
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void convertToYodaSpeak() {
    sithText = text;
    String[] listOfSentences =sithText.split("\\.");
    sithText = "";
    boolean isFirstSentence=true;
    for (String sentence : listOfSentences) {
      if (!isFirstSentence) {
       sentence=sentence.substring(1);
      }
      List<String> words = Arrays.asList(sentence.split(" "));
      words.set(0, words.get(0).toLowerCase());
      for (int i = 0; i < words.size() - 1; i += 2) {
        Collections.swap(words, i, i + 1);
      }
      sentence = String.join(" ", words);
      sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
      sentence += ".";
      int rand = (int) (Math.random() * 2);
      for (int i = 0; i <= rand; i++) {
        sentence += " " + yodaWords.get((int) (Math.random() * yodaWords.size()));
      }
      if(!isFirstSentence){
        sithText+=" ";
      }
      sithText += sentence;
      isFirstSentence=false;
    }
  }
}
