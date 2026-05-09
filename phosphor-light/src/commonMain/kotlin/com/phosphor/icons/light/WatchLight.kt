package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.WatchLight: ImageVector
    get() {
        if (_WatchLight != null) {
            return _WatchLight!!
        }
        _WatchLight = ImageVector.Builder(
            name = "Light.WatchLight",
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
                moveTo(128f, 128f)
                moveToRelative(-72f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 144f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -144f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 68.13f)
                lineToRelative(6.81f, -37.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102.68f, 24f)
                horizontalLineToRelative(50.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.87f, 6.57f)
                lineTo(168f, 68.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 187.87f)
                lineToRelative(6.81f, 37.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 6.57f)
                horizontalLineToRelative(50.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, -6.57f)
                lineTo(168f, 187.87f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 88f)
                lineToRelative(0f, 40f)
                lineToRelative(40f, 0f)
            }
        }.build()

        return _WatchLight!!
    }

@Suppress("ObjectPropertyName")
private var _WatchLight: ImageVector? = null
