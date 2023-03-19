package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewArticle(){
    ArticleCard(
        title = stringResource(R.string.title),
        shortDesc = stringResource(id = R.string.shortDesc),
        longDesc = stringResource(id = R.string.longDesc),
        imagePainter = painterResource(
            id = R.drawable.bg_compose_background
        )
    )
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        title = stringResource(R.string.title),
        shortDesc = stringResource(id = R.string.shortDesc),
        longDesc = stringResource(id = R.string.longDesc),
        imagePainter = painterResource(
            id = R.drawable.bg_compose_background
        )
    )
}

@Composable
fun ArticleCard(
    title: String,
    shortDesc: String,
    longDesc: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(
            text = shortDesc,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp, 16.dp)
        )
        Text(text = longDesc, fontSize = 16.sp, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))

    }
}