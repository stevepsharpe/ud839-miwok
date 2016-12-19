package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation of the word.
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation of the word.
     */
    private String mMiwokTranslation;

    /**
     * Image resource id of the word.
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Audio resource id of the word.
     */
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in teh language the user is using
     * @param miwokTranslation is the word in the Miwok language.
     * @param audioResourceId is the resource id for the audio asset for the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in teh language the user is using
     * @param miwokTranslation is the word in the Miwok language.
     * @param imageResourceId is the resource id for the image asset for the word.
     * @param audioResourceId is the resource id for the audio asset for the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
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
     * Get the image resource id of the word.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Get the audio resource id of the word.
     */
    public int getAudioResourceId() { return mAudioResourceId; }

    /**
     * Returns whether or not there is an image for this Word.
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
