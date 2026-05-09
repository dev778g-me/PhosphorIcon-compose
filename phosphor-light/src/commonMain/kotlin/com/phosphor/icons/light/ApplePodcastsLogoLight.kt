package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ApplePodcastsLogoLight: ImageVector
    get() {
        if (_ApplePodcastsLogoLight != null) {
            return _ApplePodcastsLogoLight!!
        }
        _ApplePodcastsLogoLight = ImageVector.Builder(
            name = "Light.ApplePodcastsLogoLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.56f, 224f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.76f, -12.12f)
                lineToRelative(-12.19f, -48f)
                arcTo(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112.25f, 144f)
                horizontalLineToRelative(31.5f)
                arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 19.88f)
                lineToRelative(-12.19f, 48f)
                arcTo(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.56f, 224f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(66.33f, 145.18f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 123.34f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74.63f, 207.81f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106.74f, 0f)
            }
        }.build()

        return _ApplePodcastsLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _ApplePodcastsLogoLight: ImageVector? = null
