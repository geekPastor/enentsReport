package dev.geekpastor.events_report.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.Recommend
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import dev.geekpastor.events_report.ui.theme.EventsreportTheme
import dev.geekpastor.events_report.R

@Composable
fun PostComponent(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(top = 10.dp, end = 10.dp, start = 10.dp)
            .fillMaxWidth()
            .background(color = Color(0xFFBCC6D7))
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Transparent),
        ) {
            Image(
                painter = painterResource(R.drawable.default_image),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Column(
            modifier = Modifier
                .padding(10.dp)
        ){
            Text(
                text = "DevFest Lubumbashi 2024",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Row {
                    OutlinedButton(
                        onClick = {},
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = Color.White,
                            containerColor = Color(0xFF00204A)
                        ),
                        modifier = Modifier
                            .height(50.dp)
                            .width(100.dp),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Icon(
                            imageVector = Icons.Default.Recommend,
                            contentDescription = "Like",
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "12"
                        )
                    }

                    OutlinedButton(
                        onClick = {},
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = Color.White,
                            containerColor = Color(0xFF00204A)
                        ),
                        modifier = Modifier
                            .height(50.dp)
                            .width(100.dp),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Icon(
                            imageVector = Icons.Default.AddComment,
                            contentDescription = "Like",
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "12"
                        )
                    }
                }
                OutlinedButton(
                    onClick = {},
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.White,
                        containerColor = Color(0xFF00204A)
                    ),
                    modifier = Modifier
                        .height(50.dp)
                        .width(150.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Lire Plus")
                }
            }
        }
    }
}

@Composable
@Preview()
fun PostComponentPreview(){
    EventsreportTheme {
        PostComponent()
    }
}