package com.hcs.androidstudy01.mylibrarytest02;

import com.unity3d.player.UnityPlayer;

/**
 * Created by Administrator on 2018/2/27.
 */

public class Test02
{
    public double Add(double a,double b)
    {
        UnityPlayer.UnitySendMessage("Main Camera","ChangeColor","");
        return  a+b;
    }

    public static double Multiply(double a,double b)
    {
        UnityPlayer.UnitySendMessage("Main Camera","ChangeColor","");
        return  a*b;
    }
}
