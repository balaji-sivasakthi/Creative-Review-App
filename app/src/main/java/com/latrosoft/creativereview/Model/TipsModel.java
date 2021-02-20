package com.latrosoft.creativereview.Model;

public class TipsModel  {
    private int mCardImgId;
    private String mTips;

    public TipsModel(int cardImgId, String tips) {
        mCardImgId = cardImgId;
        mTips = tips;
    }

    public int getCardImgId() {
        return mCardImgId;
    }

    public void setCardImgId(int cardImgId) {
        mCardImgId = cardImgId;
    }

    public String getTips() {
        return mTips;
    }

    public void setTips(String tips) {
        mTips = tips;
    }
}
