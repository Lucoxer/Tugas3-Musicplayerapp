package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

@Composable
fun ProfileScreen(){
    Column(modifier = Modifier
        .background(Color(3, 15, 21))
        .fillMaxSize()
    ){
        Row(modifier = Modifier
            .padding(start = 20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.circledpicture),
                contentDescription = "circledpicture",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = "Rudi Saputra",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp)
            )
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.baseline_settings_24),
                contentDescription = "download",
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.padding(start = 130.dp, top = 20.dp)
            )
        }
        Divider(color=Color.White, thickness = 0.5.dp, modifier = Modifier.padding(top = 24.dp))
        //navbar choice
        Row(modifier = Modifier
            .padding(top = 32.dp)
        ) {
            Text(
                text = stringResource(R.string.Library),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(
                text = stringResource(R.string.Following),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 15.dp)
            )
            Text(
                text = stringResource(R.string.RecentP),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 19.dp)
            )
            Text(
                text = stringResource(R.string.Download),
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 23.dp)
            )
        }
//            List Music
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.fav3),
                contentDescription = "fav3",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.padding(top = 24.dp)
            )
            Text(
                text = stringResource(R.string.Kpop),
                fontSize = 17.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 24.dp, start = 22.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.fav2),
                contentDescription = "fav2",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = stringResource(id = R.string.jpop),
                fontSize = 17.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 20.dp, start = 22.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.fav1),
                contentDescription = "fav1",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = stringResource(R.string.TheBeatlesAlbum),
                fontSize = 17.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 20.dp, start = 22.dp)
            )
        }

        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.fav1),
                contentDescription = "fav1",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = stringResource(R.string.VintageS),
                fontSize = 17.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 20.dp, start = 22.dp)
            )
        }
    }
}