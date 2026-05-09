package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.RepeatLight: ImageVector
    get() {
        if (_RepeatLight != null) {
            return _RepeatLight!!
        }
        _RepeatLight = ImageVector.Builder(
            name = "Light.RepeatLight",
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
                moveTo(200f, 88f)
                lineToRelative(24f, -24f)
                lineToRelative(-24f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
                horizontalLineTo(224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 168f)
                lineToRelative(-24f, 24f)
                lineToRelative(24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 128f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                horizontalLineTo(32f)
            }
        }.build()

        return _RepeatLight!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatLight: ImageVector? = null
