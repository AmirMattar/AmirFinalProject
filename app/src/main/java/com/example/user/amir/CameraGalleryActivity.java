package com.example.user.amir;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraGalleryActivity extends AppCompatActivity implements View.OnClickListener {
    Button gallery, camera;
    ImageView cameraimage;

    Bitmap bitmap;

    public static final int CAMERA_REQUEST = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_gallery);

        gallery = findViewById(R.id.gallery);
        gallery.setOnClickListener(this);


        camera = findViewById(R.id.camera);
        camera.setOnClickListener(this);

        cameraimage = findViewById(R.id.cameraimage);

    }

    @Override
    public void onClick(View v) {
        if (v == camera) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i, CAMERA_REQUEST);
        } else {
            //later
        }

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            cameraimage.setImageBitmap(photo);
        }
    }
}

