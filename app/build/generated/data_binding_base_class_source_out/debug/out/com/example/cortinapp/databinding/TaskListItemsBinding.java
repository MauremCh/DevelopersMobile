// Generated by view binder compiler. Do not edit!
package com.example.cortinapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cortinapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TaskListItemsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textViewarticle;

  @NonNull
  public final TextView textViewday;

  private TaskListItemsBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageView2,
      @NonNull TextView textViewarticle, @NonNull TextView textViewday) {
    this.rootView = rootView;
    this.imageView2 = imageView2;
    this.textViewarticle = textViewarticle;
    this.textViewday = textViewday;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TaskListItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TaskListItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.task_list_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TaskListItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textViewarticle;
      TextView textViewarticle = ViewBindings.findChildViewById(rootView, id);
      if (textViewarticle == null) {
        break missingId;
      }

      id = R.id.textViewday;
      TextView textViewday = ViewBindings.findChildViewById(rootView, id);
      if (textViewday == null) {
        break missingId;
      }

      return new TaskListItemsBinding((LinearLayout) rootView, imageView2, textViewarticle,
          textViewday);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
