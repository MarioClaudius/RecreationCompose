package com.example.recreationcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recreationcompose.model.FakeRecreationPlaceDataSource
import com.example.recreationcompose.model.RecreationPlace
import com.example.recreationcompose.ui.theme.RecreationComposeTheme
import com.example.recreationcompose.ui.theme.futuraFont

@Composable
fun RecreationPlaceItem(
    name: String,
    image: Int,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { }
            .shadow(
                elevation = 3.dp,
                shape = RoundedCornerShape(8.dp)
            ),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Cyan
        ),
    ) {
        Row {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier.padding(8.dp).align(Alignment.CenterVertically)
            ) {
                Text(
                    text = name,
                    fontFamily = futuraFont,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = description,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 10.sp,
                    lineHeight = 15.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecreationItemPreview() {
    RecreationComposeTheme {
        RecreationPlaceItem(
            name = FakeRecreationPlaceDataSource.dummyRecreationPlaces[0].name,
            image = FakeRecreationPlaceDataSource.dummyRecreationPlaces[0].image,
            description = FakeRecreationPlaceDataSource.dummyRecreationPlaces[0].detail,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
        )
    }
}