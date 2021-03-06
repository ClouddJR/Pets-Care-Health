package com.clouddroid.petscarehealth;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.StorageReference;
import java.io.InputStream;

/**
 * Created by arkadiusz on 17.02.18
 */

@GlideModule
public class MyAppGlideModule extends AppGlideModule {

  @Override
  public void registerComponents(@NonNull Context context, @NonNull Glide glide,
      @NonNull Registry registry) {
    registry.append(StorageReference.class, InputStream.class,
        new FirebaseImageLoader.Factory());
  }
}