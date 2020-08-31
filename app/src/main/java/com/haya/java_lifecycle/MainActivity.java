package com.haya.java_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  private final static int REQUEST_MAIN = 100;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.v(TAG, "onCreate");

    Button button = findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // SubActivityの呼び出し
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivityForResult(intent, REQUEST_MAIN);
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

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == RESULT_OK) {
      if (requestCode == REQUEST_MAIN) {
        Log.v(TAG, "onActivityResult");
      }
    }
  }
}