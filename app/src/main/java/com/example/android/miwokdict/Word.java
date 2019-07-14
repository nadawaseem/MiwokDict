package com.example.android.miwokdict;

public class Word {
    // param for english or default word
    private String mDefaultWord;

    //@param for miwok word
    private String mMiwokWord;

    //constructor for initializing values to the two Strings
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultWord = defaultTranslation;
        mMiwokWord = miwokTranslation;
    }

        /**
         * Get the default translation of the word.
         */
        public String getDefaultWord() {
            return mDefaultWord;
        }

        /**
         * Get the Miwok translation of the word.
         */
        public String getMiwokWord () {
            return mMiwokWord;
        }

    }

