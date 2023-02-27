package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.R

@Composable
fun FavoriteScreen() {
    Row(
        modifier = Modifier
            .background(Color(3, 15, 21))
            .fillMaxSize()
    )
    {
        Text(
            text = stringResource(R.string.Sunday),
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = stringResource(id = R.string.DailyMix),
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 170.dp, top = 20.dp),
        )
    }
    Column(modifier = Modifier.padding(start = 20.dp)) {
        Text(
            text = stringResource(R.string.greet),
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 80.dp, bottom = 40.dp)
        )
        //Your Favourite
        Column(
            modifier = Modifier
                .size(355.dp, 300.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(Color(6, 29, 41, 153))
        ) {

            Text(
                text = stringResource(R.string.YFav),
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 10.dp, start = 5.dp)
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                content = {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp, bottom = 20.dp, top = 15.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture1),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(R.string.edm),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 73.dp)
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp, bottom = 20.dp, top = 15.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture2),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(R.string.moodboos),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 73.dp)
                            )

                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp, bottom = 20.dp, top = 15.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture3),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(id = R.string.Kpop),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 73.dp)
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture4),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(R.string.jpop),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 67.dp)
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture5),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(R.string.ninetysong),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 67.dp)
                            )
                        }
                    }
                    items(1) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp, end = 5.dp)
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(5.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picture6),
                                contentDescription = "picture",
                                contentScale = ContentScale.FillHeight,
                                modifier = Modifier.fillMaxSize()
                            )
                            Text(
                                text = stringResource(R.string.rap),
                                color = Color.White,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(top = 67.dp)
                            )
                        }
                    }
                }
            )
        }
        //hits
        Spacer(modifier = Modifier.padding(top = 40.dp))
        Column(
            modifier = Modifier
                .size(355.dp)
                .fillMaxHeight()
                .clip(RoundedCornerShape(15.dp))
                .background(Color(6, 29, 41, 153))
        ){

        Text(
            text = stringResource(R.string.hits),
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            content = {
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(10.dp, end = 15.dp, bottom = 20.dp, top = 15.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture2h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = stringResource(R.string.reggae),
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 67.dp)
                        )
                    }
                }
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(10.dp, end = 15.dp, bottom = 20.dp, top = 15.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture3h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = stringResource(R.string.chill),
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 67.dp)
                        )
                    }
                }
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(10.dp, end = 15.dp, bottom = 20.dp, top = 15.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture1h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = stringResource(R.string.pop),
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 67.dp)
                        )
                    }
                }
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(5.dp, end = 20.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture1h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(5.dp, end = 20.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture2h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                items(1) {
                    Box(
                        modifier = Modifier
                            .padding(5.dp, end = 20.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.picture3h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "POP",
                            color = Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top = 71.dp)
                        )
                    }
                }

                items(3){
                    Box(
                        modifier = Modifier
                            .padding(5.dp, end = 20.dp, bottom = 20.dp, top = 20.dp)
                            .aspectRatio(1f)
                            .clip(RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.picture3h),
                            contentDescription = "picture",
                            contentScale = ContentScale.FillHeight,
                            modifier = Modifier.fillMaxSize()
                        )
                        Text(
                            text = "POP",
                            color =Color.White,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(top=71.dp)
                        )
                    }
                }
            }
        )
    }
        }
}

