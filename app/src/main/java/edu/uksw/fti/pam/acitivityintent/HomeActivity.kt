package edu.uksw.fti.pam.acitivityintent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import androidx.compose.material.Scaffold as Scaffold1


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme() {
                ScaffoldCompose()

            }
        }
    }

    //modifier = Modifier.width(250.dp)

}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldCompose()
{
    val navController = rememberNavController()
    Scaffold1(
        contentColor = Color.White,
        backgroundColor = Color.Black,
        topBar = {TopAppBarCompose()},
        content = { Contents()},
        bottomBar = { BottomNavigationBar(navController) }

    )

}

sealed class Screen(val route:String, val label:String, val icon: ImageVector)
{
    object DestinationA: Screen("destinationA", "profile", Icons.Default.Home)
    object DestinationB: Screen("destinationB", "profile", Icons.Default.Search)
    object DestinationC: Screen("destinationC", "profile", Icons.Default.Notifications)
    object DestinationD: Screen("destinationC", "profile", Icons.Default.Favorite)

}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val destinations = listOf(Screen.DestinationA, Screen.DestinationB, Screen.DestinationC, Screen.DestinationD)
    BottomNavigation(backgroundColor = Color(24, 104, 106)){

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        destinations.forEach{
                item -> BottomNavigationItem(
            icon = { Icon(item.icon, contentDescription = null)},
            label = {Text(text = item.label)},
            selectedContentColor = Color.White,
            unselectedContentColor = Color.White,
            alwaysShowLabel = false,
            selected = currentRoute == item.route,
            onClick = {
                navController.navigate(item.route)
                {
                    navController.graph.startDestinationRoute?.let { route -> popUpTo(route)
                    {
                        saveState = true
                    }}
                    launchSingleTop = true
                    restoreState = true
                }
            }

        )

        }
    }
}


@Composable
fun Navigation(navController: NavHostController)
{

}


@Composable
fun TopAppBarCompose()
{
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        contentColor = Color.White,
        backgroundColor = Color.Black,
        title = { Text(text = "Home",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 80.dp, end = 80.dp))},

        navigationIcon = {
            IconButton(
                onClick = { /*TODO*/ }) {
                Icon(Icons.Default.AccountCircle, "Menu",
                    modifier = Modifier
                        .width(48.dp)
                        .height(48.dp));

            }
        },
        actions = {
            Box(modifier = Modifier.size(width = 92.dp, height = 48.dp))
            {
                Image(painterResource(id = R.drawable.title),"title",
                    modifier = Modifier.size(width = 92.dp, height = 48.dp))
            }


        },

        )

}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMAcitivityIntentTheme {
        ScaffoldCompose()
    }
}

@Composable
fun Contents()
{

    //Latest Update Anime
    Column( modifier = Modifier.fillMaxWidth(),) {
        Text(text = "Latest Update", modifier = Modifier
            .padding(top = 60.dp)
            .padding(start = 10.dp), fontSize = 24.sp)
        Image(painterResource(id = R.drawable.r__1_),"title",
            modifier = Modifier.size(width = 400.dp, height = 210.dp))

    }
    Column() {
        Text(text = "People Also Search", modifier = Modifier
            .padding(top = 310.dp)
            .padding(start = 10.dp),
            fontSize = 24.sp)
        LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
            content ={
                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.one_piece_film_red),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "One Piece Film: Red", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.oip__1_),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Bocchi The Rock", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.rectangle_24),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Kimetsu No Yaiba", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.rectangle_24),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Kimetsu No Yaiba", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }


            } )







    }

    Column(modifier = Modifier.padding(top = 200.dp)) {

        Text(text = "For You", modifier = Modifier
            .padding(top = 410.dp)
            .padding(start = 10.dp),
            fontSize = 24.sp)
        LazyVerticalGrid(columns = GridCells.Adaptive(100.dp),
            content ={
                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.one_piece_film_red),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "One Piece Film: Red", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.oip__1_),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Bocchi The Rock", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.rectangle_24),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Kimetsu No Yaiba", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }

                items(1){
                    Box(modifier = Modifier
                        .size(width = 150.dp, height = 230.dp)
                        .padding(start = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(25, 104, 106)))
                    {
                        Image(painterResource(id = R.drawable.rectangle_24),"title",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(25.dp)))

                        Text(text = "Kimetsu No Yaiba", modifier = Modifier
                            .padding(top = 165.dp)
                            .padding(6.dp), fontSize = 14.sp)
                        Text(text = "2M", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 25.dp), fontSize = 10.sp)

                        Image(painterResource(id = R.drawable.outline_remove_red_eye_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 6.dp))
                        Image(painterResource(id = R.drawable.outline_bookmark_add_24), "Views", modifier = Modifier
                            .padding(top = 210.dp)
                            .padding(start = 100.dp))



                    }

                }


            } )


    }





}
