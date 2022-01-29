package com.example.foodie

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxSize()   //for  full width and height
                .background(color = Color(0xffd3d3d3))
                .verticalScroll(rememberScrollState())) { //for scrollable column
                Image(painterResource(R.drawable.happy_meal),"just test",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(300.dp))  //img height

                Column(modifier = Modifier.padding(10.dp)) {

                    Text(text = "humberger here",fontSize = 30.sp)
                    Spacer(modifier = Modifier.padding(top = 10.dp,))

                    Text(text = "cholestrol free",fontSize = 25.sp)
                    Spacer(modifier = Modifier.padding(top = 10.dp,))

                    Text(text = "ksh 40" ,fontSize = 20.sp,color = Color(0xff0d4f07))
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                }

                Column(modifier = Modifier.padding(10.dp)) {

                    Text(text = "humberger here",fontSize = 30.sp)
                    Spacer(modifier = Modifier.padding(top = 10.dp,))

                    Text(text = "cholestrol free",fontSize = 25.sp)
                    Spacer(modifier = Modifier.padding(top = 10.dp,))

                    Text(text = "ksh 40" ,fontSize = 20.sp,color = Color(0xff0d4f07))
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                }
            }

               
            }
        }

    }
