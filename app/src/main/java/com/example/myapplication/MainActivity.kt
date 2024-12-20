package com.example.myapplication

import android.media.midi.MidiDevice
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.util.Log
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.modifier.modifierLocalMapOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
                ForFun()
            }
        }
    }
}
@Composable
fun ForFun() {
    var counter by remember { mutableStateOf(1) }
    Card (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth().clickable {
                    counter++
            }

        , elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
    ){
        Box(){
            Row() {
                Image(painter = painterResource(id = R.drawable.image)
                    , contentDescription = "image", contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(66.dp)
                        .clip(CircleShape))

                Column (modifier = Modifier
                    .padding(start = 16.dp)
                    .padding(top = 18.dp)){
                    Text(text = counter.toString(), fontStyle = FontStyle.Italic,fontSize = 17.sp)
                    Text(text = "without work", fontSize = 12.sp)
                }
            }
        }
    }
}
