package com.example.android.orlandoorientation;

public class TourGuide {

    /**
     * Title for each list item
     */
    private String mTourTitle;

    /**
     * Body text for each list item
     */
    private String mTourInformation;

    /**
     * Phone Numbers for the restaurants
     */
    private String mContactNumber;

    /**
     * Resource Id fetching the image for each list item
     */
    private int mImageResourceId;

    public TourGuide(String tourTitle, String tourInformation, int imageResourceId) {
        mTourTitle = tourTitle;
        mTourInformation = tourInformation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Creats a new TourGuide object
     * @param tourTitle is the title of each location
     * @param tourInformation is a description of each location
     * @param contactNumber is a phone number for the restaurant locations
     * @param imageResourceId is the drawable resource ID for the image associated with each location
     */
    public TourGuide(String tourTitle, String tourInformation, String contactNumber, int imageResourceId) {
        mTourTitle = tourTitle;
        mTourInformation = tourInformation;
        mContactNumber = contactNumber;
        mImageResourceId = imageResourceId;
    }

    public String getTourTitle() {
        return mTourTitle;
    }

    public String getTourInformation() {
        return mTourInformation;
    }

    public String getContactNumber() {
        return mContactNumber;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}