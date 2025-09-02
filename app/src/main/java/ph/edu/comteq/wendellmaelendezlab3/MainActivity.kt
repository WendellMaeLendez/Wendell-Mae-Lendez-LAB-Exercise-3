package ph.edu.comteq.wendellmaelendezlab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ph.edu.comteq.wendellmaelendezlab3.ui.theme.WendellMaeLendezLAB3Theme

//Fonts
val playfairdisplayregular = FontFamily(
    Font(resId = R.font.playfairdisplayregular, weight = FontWeight.Normal)
)



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WendellMaeLendezLAB3Theme {
                Homepage("")
            }
        }
    }
}

@Composable
fun Homepage(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Logo
        Image(
            painter = painterResource(id = R.drawable.logo), 
            contentDescription = "Gallery Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Title
        Text(
            text = "Gallery",
            color = Color.Yellow,
            fontFamily = playfairdisplayregular,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Louvre Image with overlay text
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.louvre), 
                contentDescription = "Louvre Arch",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            val optima = null
            Text(
                text = "Experience Art",
                color = Color.White,
                fontFamily = optima,
                fontSize = 28.sp,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))

        //Description
        Text(
            text = "We are thrilled to invite you to join us for an extraordinary event that will immerse you in the world of art.",
            color = Color.White,
            fontFamily = playfairdisplayregular,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp),
            lineHeight = 22.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

