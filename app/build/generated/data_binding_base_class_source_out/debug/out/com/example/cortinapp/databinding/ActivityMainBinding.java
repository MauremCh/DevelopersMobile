// Generated by view binder compiler. Do not edit!
package com.example.cortinapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   *   <li>layout-sw480dp/</li>
   *   <li>layout-sw480dp-land/</li>
   *   <li>layout-sw600dp/</li>
   *   <li>layout-sw600dp-land/</li>
   * </ul>
   */
  @Nullable
  public final Button btnOnce;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   *   <li>layout-sw480dp/</li>
   *   <li>layout-sw480dp-land/</li>
   *   <li>layout-sw600dp/</li>
   *   <li>layout-sw600dp-land/</li>
   * </ul>
   */
  @Nullable
  public final Button btnUno;

  @NonNull
  public final EditText edtarea;

  @NonNull
  public final EditText edtcodarticulo;

  @NonNull
  public final EditText edtcolor;

  @NonNull
  public final EditText edtvalormc;

  @NonNull
  public final ImageView imageView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   *   <li>layout-sw480dp/</li>
   *   <li>layout-sw480dp-land/</li>
   *   <li>layout-sw600dp/</li>
   *   <li>layout-sw600dp-land/</li>
   * </ul>
   */
  @Nullable
  public final Toolbar myToolbar;

  @NonNull
  public final TextView textView;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @Nullable Button btnOnce,
      @Nullable Button btnUno, @NonNull EditText edtarea, @NonNull EditText edtcodarticulo,
      @NonNull EditText edtcolor, @NonNull EditText edtvalormc, @NonNull ImageView imageView,
      @Nullable Toolbar myToolbar, @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnOnce = btnOnce;
    this.btnUno = btnUno;
    this.edtarea = edtarea;
    this.edtcodarticulo = edtcodarticulo;
    this.edtcolor = edtcolor;
    this.edtvalormc = edtvalormc;
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
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_once;
      Button btnOnce = ViewBindings.findChildViewById(rootView, id);

      id = R.id.btn_uno;
      Button btnUno = ViewBindings.findChildViewById(rootView, id);

      id = R.id.edtarea;
      EditText edtarea = ViewBindings.findChildViewById(rootView, id);
      if (edtarea == null) {
        break missingId;
      }

      id = R.id.edtcodarticulo;
      EditText edtcodarticulo = ViewBindings.findChildViewById(rootView, id);
      if (edtcodarticulo == null) {
        break missingId;
      }

      id = R.id.edtcolor;
      EditText edtcolor = ViewBindings.findChildViewById(rootView, id);
      if (edtcolor == null) {
        break missingId;
      }

      id = R.id.edtvalormc;
      EditText edtvalormc = ViewBindings.findChildViewById(rootView, id);
      if (edtvalormc == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.my_toolbar;
      Toolbar myToolbar = ViewBindings.findChildViewById(rootView, id);

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnOnce, btnUno, edtarea,
          edtcodarticulo, edtcolor, edtvalormc, imageView, myToolbar, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
