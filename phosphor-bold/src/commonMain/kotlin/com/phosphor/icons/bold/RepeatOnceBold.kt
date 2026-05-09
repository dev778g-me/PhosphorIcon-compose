package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RepeatOnceBold: ImageVector
    get() {
        if (_RepeatOnceBold != null) {
            return _RepeatOnceBold!!
        }
        _RepeatOnceBold = ImageVector.Builder(
            name = "Bold.RepeatOnceBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 88f)
                lineToRelative(24f, -24f)
                lineToRelative(-24f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
                horizontalLineTo(224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 168f)
                lineToRelative(-24f, 24f)
                lineToRelative(24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 128f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                horizontalLineTo(32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 111.99f)
                lineToRelative(16f, -7.99f)
                lineToRelative(0f, 48f)
            }
        }.build()

        return _RepeatOnceBold!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatOnceBold: ImageVector? = null
