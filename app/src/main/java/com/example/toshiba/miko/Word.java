package com.example.toshiba.miko;

/**
 * Created by TOSHIBA on 25/06/2018.
 */

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

            /** Miwok translation for the word */
           private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }



    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int audioResourceId ) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
