package dev.geekpastor.events_report.ui.screens.createPost

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

@Composable
fun CreatePostScreenRoute(){
    CreatePostScreen()
}

@Composable
fun CreatePostScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ){
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            placeholder = {
                Text(
                    text = "Nom de L’evenement"
                )
            }
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            placeholder = {
                Text(
                    text = "Lieu de L’evenement"
                )
            }
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            placeholder = {
                Text(
                    text = "Date de L’evenement"
                )
            }
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            placeholder = {
                Text(
                    text = "Description de L’evenement"
                )
            }
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            placeholder = {
                Text(
                    text = "Lien du site web de L’evenement (Facultatif)"
                )
            }
        )

        Spacer(
            modifier = Modifier
                .height(10.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            placeholder = {
                Text(
                    text = "Ajouter des images (au moins 1 image)"
                )
            }
        )



        Spacer(
            modifier = Modifier
                .height(50.dp)
        )

        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.White,
                containerColor = Color(0xFF00204A)
            ),
            modifier = Modifier
                .height(50.dp)
                .width(200.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Creer le post")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CreatePostScreenPreview(){
    CreatePostScreen()
}