// Generated by view binder compiler. Do not edit!
package com.example.cortinapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cortinapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnNueve;

  @NonNull
  public final Button btnOcho;

  @NonNull
  public final Button btnSeis;

  @NonNull
  public final Button btnSiete;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Toolbar myToolbar;

  @NonNull
  public final TextView textView;

  private ActivityMain2Binding(@NonNull LinearLayout rootView, @NonNull Button btnNueve,
      @NonNull Button btnOcho, @NonNull Button btnSeis, @NonNull Button btnSiete,
      @NonNull ImageView imageView, @NonNull Toolbar myToolbar, @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnNueve = btnNueve;
    this.btnOcho = btnOcho;
    this.btnSeis = btnSeis;
    this.btnSiete = btnSiete;
    this.imageView = imageView;
    this.myToolbar = myToolbar;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_nueve;
      Button btnNueve = ViewBindings.findChildViewById(rootView, id);
      if (btnNueve == null) {
        break missingId;
      }

      id = R.id.btn_ocho;
      Button btnOcho = ViewBindings.findChildViewById(rootView, id);
      if (btnOcho == null) {
        break missingId;
      }

      id = R.id.btn_seis;
      Button btnSeis = ViewBindings.findChildViewById(rootView, id);
      if (btnSeis == null) {
        break missingId;
      }

      id = R.id.btn_siete;
      Button btnSiete = ViewBindings.findChildViewById(rootView, id);
      if (btnSiete == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.my_toolbar;
      Toolbar myToolbar = ViewBindings.findChildViewById(rootView, id);
      if (myToolbar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMain2Binding((LinearLayout) rootView, btnNueve, btnOcho, btnSeis, btnSiete,
          imageView, myToolbar, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
