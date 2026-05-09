package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TextHThreeBold: ImageVector
    get() {
        if (_TextHThreeBold != null) {
            return _TextHThreeBold!!
        }
        _TextHThreeBold = ImageVector.Builder(
            name = "Bold.TextHThreeBold",
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
                moveTo(192f, 112f)
                horizontalLineToRelative(48f)
                lineToRelative(-28f, 40f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 47.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 56f)
                lineTo(40f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 116f)
                lineTo(40f, 116f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 56f)
                lineTo(144f, 176f)
            }
        }.build()

        return _TextHThreeBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextHThreeBold: ImageVector? = null
