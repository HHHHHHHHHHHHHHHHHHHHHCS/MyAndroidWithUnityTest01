package com.hcs.androidstudy01.mylibrarytest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public double Add(double a, double b)
    {
        UnityPlayer.UnitySendMessage("Main Camera","ChangeColor","");
        return a + b;
    }

}
