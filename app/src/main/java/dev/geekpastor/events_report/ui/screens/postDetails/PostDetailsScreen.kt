package dev.geekpastor.events_report.ui.screens.postDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.Recommend
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import dev.geekpastor.events_report.R


@Composable
fun PostDetailsScreenRoute(
    modifier: Modifier = Modifier
){
    PostDetailsScreen()
}

@Composable
fun PostDetailsScreen(
    modifier: Modifier = Modifier
){

    val verticalScroll = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(verticalScroll)
    ){
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

            Spacer(
                modifier = Modifier
                    .height(10.dp)
            )

            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." +
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                lineHeight = 24.sp
            )
        }

        Column(
            modifier = modifier
                .padding(top = 10.dp, end = 10.dp, start = 10.dp)
                .fillMaxWidth()
                .background(color = Color.Transparent)
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
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
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PostDetailsScreenPreview(){
    PostDetailsScreen()
}