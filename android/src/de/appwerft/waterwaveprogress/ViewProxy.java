/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.waterwaveprogress;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.TiApplication;

import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.app.Activity;
import cn.modificator.waterwave_progress.*;



@Kroll.proxy(creatableInModule = WaterwaveprogressModule.class)
public class ViewProxy extends TiViewProxy {
	// Standard Debugging variables
	private static final String LCAT = "WaWaView";

	WaterWaveProgress mWaterWaveProgress;
	private int mRingColor, mRingBgColor, mWaterColor, mWaterBgColor,
			mFontSize, mTextColor;
	float mCrestCount = 1.5f;
	int mProgress = 10, mMaxProgress = 100;
	private float mRingWidth, mRing2WaterWidth;
	private boolean mShowNumerical = true, mShowRing = true;

	private int mWaveFactor = 0;
	private boolean mIsWaving = false;
	private float mAmplitude = 30.0F; // 20F
	private float mWaveSpeed = 0.070F; // 0.020F
	private int mWaterAlpha = 255; // 255

	private class progressView extends TiUIView {
		WaterWaveProgress mWaterWaveProgress;
		public progressView(TiViewProxy proxy) {
			super(proxy);
			LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT);
			LinearLayout container = new LinearLayout(proxy.getActivity());
			container.setLayoutParams(lp);
			
			mWaterWaveProgress = new WaterWaveProgress(TiApplication.getInstance()
					.getApplicationContext());
			mWaterWaveProgress.setAmplitude(mAmplitude);
			mWaterWaveProgress.setCrestCount(mCrestCount);
			mWaterWaveProgress.setFontSize(mFontSize);
			mWaterWaveProgress.setIsWaving(mIsWaving);
			mWaterWaveProgress.setProgress(mProgress);
			mWaterWaveProgress.setRingWidth(mRingWidth);
			mWaterWaveProgress.setShowRing(mShowRing);
			mWaterWaveProgress.setShowNumerical(mShowNumerical);
			mWaterWaveProgress.setWaterColor(mWaterColor);
			mWaterWaveProgress.setWaterBgColor(mWaterBgColor);
			mWaterWaveProgress.setRingColor(mRingColor);
			mWaterWaveProgress.setRingBgColor(mRingBgColor);
			mWaterWaveProgress.setTextColor(mTextColor);
			mWaterWaveProgress.setRingWidth(mRingWidth);
			mWaterWaveProgress.setRing2WaterWidth(mRing2WaterWidth);
			
			mWaterWaveProgress.setWaveFactor(mWaveFactor);
			mWaterWaveProgress.setWaveSpeed(mWaveSpeed);
			mWaterWaveProgress.setWaterAlpha(mWaterAlpha);
			container.addView(mWaterWaveProgress);
			setNativeView(container);
		}

		@Override
		public void processProperties(KrollDict d) {
			super.processProperties(d);
		}
	}

	// Constructor
	public ViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		TiUIView mView = new progressView(this);
		mView.getLayoutParams().autoFillsHeight = true;
		mView.getLayoutParams().autoFillsWidth = true;
		return mView;
	}

	// Handle creation options
	// copy from interace to proxy vars
	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
		if (options.containsKeyAndNotNull("progress")) {
			mProgress = TiConvert.toInt(options, "progress");
		}
		if (options.containsKeyAndNotNull("maxProgress")) {
			mMaxProgress = TiConvert.toInt(options, "maxProgress");
		}
		if (options.containsKeyAndNotNull("ringWidth")) {
			mRingWidth = TiConvert.toFloat(options, "ringWidth");
		}
		if (options.containsKeyAndNotNull("fontSize")) {
			mFontSize = TiConvert.toInt(options, "fontSize");
		}
		if (options.containsKeyAndNotNull("ring2WaterWidth")) {
			mRing2WaterWidth = TiConvert.toFloat(options, "ring2WaterWidth");
		}
		if (options.containsKeyAndNotNull("ringColor")) {
			mRingColor = TiConvert.toColor(options, "ringColor");
		}
		if (options.containsKeyAndNotNull("ringBgColor")) {
			mRingBgColor = TiConvert.toColor(options, "ringBgColor");
		}
		if (options.containsKeyAndNotNull("waterColor")) {
			mWaterColor = TiConvert.toColor(options, "waterColor");
		}
		if (options.containsKeyAndNotNull("waterBgColor")) {
			mWaterBgColor = TiConvert.toColor(options, "waterBgColor");
		}
		if (options.containsKeyAndNotNull("textColor")) {
			mTextColor = TiConvert.toColor(options, "textColor");
		}
		if (options.containsKeyAndNotNull("showNumerical")) {
			mShowNumerical = TiConvert.toBoolean(options, "showNumerical");
		}
		if (options.containsKeyAndNotNull("showRing")) {
			mShowRing = TiConvert.toBoolean(options, "showRing");
		}
		if (options.containsKeyAndNotNull("crestCount")) {
			mCrestCount = TiConvert.toFloat(options, "crestCount");
		}
		if (options.containsKeyAndNotNull("amplitude")) {
			mAmplitude = TiConvert.toFloat(options, "amplitude");
		}
		if (options.containsKeyAndNotNull("α")) {
			mWaterAlpha = TiConvert.toInt(options, "α");
		}
		if (options.containsKeyAndNotNull("waveFactor")) {
			mWaveFactor = TiConvert.toInt(options, "waveFactor");
		}

	}

	@Kroll.method
	public void hideNumerical() {
		mWaterWaveProgress.setShowNumerical(false);
	}

	@Kroll.method
	public void showNumerical() {
		mWaterWaveProgress.setShowNumerical(true);
	}

	@Kroll.method
	public void setShowRingVisibility(boolean arg) {
		mWaterWaveProgress.setShowRing(arg);
	}

	@Kroll.method
	public void hideRing() {
		mWaterWaveProgress.setShowRing(false);
	}

	@Kroll.method
	public void showRing() {
		mWaterWaveProgress.setShowRing(true);
	}

	@Kroll.method
	public void setCrestCount(int crestCount) {
		mWaterWaveProgress.setCrestCount(crestCount);
	}

	@Kroll.method
	public void setProgress(int arg) {
		Log.d(LCAT, "mProgress=" + arg);
		mWaterWaveProgress.setProgress(arg);
	}

	@Kroll.method
	public void setRingWidth(float width) {
		mWaterWaveProgress.setRingWidth(width);
	}

	@Kroll.method
	public void setCrestCount(float crestCount) {
		mWaterWaveProgress.setCrestCount(crestCount);
	}

	@Kroll.method
	public void setAmplitude(float amp) {
		mWaterWaveProgress.setAmplitude(amp);
	}

	@Kroll.method
	public void setWaveSpeed(float arg) {
		mWaterWaveProgress.setWaveSpeed(arg);
	}

	@Kroll.method
	public void setWaterAlpha(float arg) {
		mWaterWaveProgress.setWaterAlpha(arg);
	}
}