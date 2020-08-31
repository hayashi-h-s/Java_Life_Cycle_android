package com.haya.java_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

  private static final String TAG = SubActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub);

    Log.v(TAG, "onCreate");

    Button button2 = findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);

        // SubActivityの終了
        finish();
      }
    });
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.v(TAG, "onRestart");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.v(TAG, "onStart");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.v(TAG, "onResume");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.v(TAG, "onPause");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.v(TAG, "onStop");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.v(TAG, "onDestroy");
  }
}