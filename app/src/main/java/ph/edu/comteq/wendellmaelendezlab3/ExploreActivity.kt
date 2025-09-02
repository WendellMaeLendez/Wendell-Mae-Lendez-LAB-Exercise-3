package ph.edu.comteq.wendellmaelendezlab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ph.edu.comteq.wendellmaelendezlab3.ui.theme.WendellMaeLendezLAB3Theme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WendellMaeLendezLAB3Theme {
                ExplorePage()
            }
        }
    }
}

@Composable
fun ExplorePage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        // Title
        Text(
            text = "Explore",
            color = Color(0xFFE6C88B),
            fontSize = 28.sp,
            fontFamily = playfairdisplayregular
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Upcoming Event Section
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Upcoming Event", color = Color.White, fontSize = 18.sp)
            Text(text = "Tickets >", color = Color.White, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Event Image
        Image(
            painter = painterResource(id = R.drawable.renaissance),
            contentDescription = "Event Image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

    }
}