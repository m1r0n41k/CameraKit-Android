package com.flurgle.camerakit;

import android.media.MediaRecorder;

import java.io.File;

import android.support.annotation.Nullable;

abstract class CameraImpl {

    protected final CameraListener mCameraListener;
    protected final PreviewImpl mPreview;

    CameraImpl(CameraListener callback, PreviewImpl preview) {
        mCameraListener = callback;
        mPreview = preview;
    }

    abstract void start();
    abstract void stop();

    abstract void setDisplayOrientation(int displayOrientation);

    abstract void setFacing(@Facing int facing);
    abstract @Flash int setFlash(@Flash int flash);
    abstract void setFocus(@Focus int focus);
    abstract void setMethod(@Method int method);
    abstract void setZoom(@Zoom int zoom);
    abstract void setVideoQuality(@VideoQuality int videoQuality);
    abstract void setAudioEnabled(boolean audioEnabled);
    abstract void setVideoOutputFile(File outputFile);

    abstract void captureImage();
    abstract void startVideo();
    abstract void endVideo();

    abstract Size getCaptureResolution();
    abstract Size getPreviewResolution();
    abstract boolean isCameraOpened();

    @Nullable
    abstract CameraProperties getCameraProperties();

}
