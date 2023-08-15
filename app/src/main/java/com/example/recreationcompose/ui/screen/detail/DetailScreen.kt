package com.example.recreationcompose.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recreationcompose.R
import com.example.recreationcompose.model.FakeRecreationPlaceDataSource
import com.example.recreationcompose.ui.theme.RecreationComposeTheme
import com.example.recreationcompose.ui.theme.futuraFont

@Composable
fun DetailScreen(
    recreationId : Long
) {
}

@Composable
fun DetailContent(
    name: String,
    description: String,
    image: Int,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier
        .background(Color.Cyan)) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Box {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = stringResource(id = R.string.back),
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { onBackClick() }
                )
                Text(
                    text = name,
                    fontSize = 32.sp,
                    fontFamily = futuraFont,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                        .fillMaxWidth()
                )
            }
            Image(
                painter = painterResource(id = image),
                contentDescription = name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
            )
            Text(
                text = description,
                modifier = Modifier
                    .padding(12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailContentPreview() {
    RecreationComposeTheme {
        DetailContent(
            name = FakeRecreationPlaceDataSource.dummyRecreationPlaces[1].name,
            description = FakeRecreationPlaceDataSource.dummyRecreationPlaces[1].detail,
            image = FakeRecreationPlaceDataSource.dummyRecreationPlaces[1].image,
            onBackClick = {}
        )
    }
}