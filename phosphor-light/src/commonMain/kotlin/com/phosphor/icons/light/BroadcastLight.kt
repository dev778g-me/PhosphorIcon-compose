package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BroadcastLight: ImageVector
    get() {
        if (_BroadcastLight != null) {
            return _BroadcastLight!!
        }
        _BroadcastLight = ImageVector.Builder(
            name = "Light.BroadcastLight",
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
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(181.67f, 80f)
                arcToRelative(71.94f, 71.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74.33f, 176f)
                arcToRelative(71.94f, 71.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 49.62f)
                arcToRelative(111.88f, 111.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 156.76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 206.38f)
                arcTo(111.88f, 111.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 49.62f)
            }
        }.build()

        return _BroadcastLight!!
    }

@Suppress("ObjectPropertyName")
private var _BroadcastLight: ImageVector? = null
