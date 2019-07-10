package com.example.android.miwokdict;

public class Word {
    // param for english or default word
    private String mDefaultWord;

    //@param for miwok word
    private String mMiwokWord;

//constructor for initializing values to the two Strings
  public Word(String defaultWord,String miwokWord){
      defaultWord=mDefaultWord;
      miwokWord=mMiwokWord;
  }

//method for returning  english word
public String getDefaultWord(){
   return mDefaultWord;
}
//method for returning miwok word
public String getMiwokWord(){

    return mMiwokWord;
}

}
