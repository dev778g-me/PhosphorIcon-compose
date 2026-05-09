package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ListStarBold: ImageVector
    get() {
        if (_ListStarBold != null) {
            return _ListStarBold!!
        }
        _ListStarBold = ImageVector.Builder(
            name = "Bold.ListStarBold",
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
                moveTo(40f, 64f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                lineTo(88f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 192f)
                lineTo(104f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 174.54f)
                lineToRelative(29.67f, 17.46f)
                lineToRelative(-8.07f, -32.59f)
                lineToRelative(26.4f, -21.8f)
                lineToRelative(-34.65f, -2.67f)
                lineToRelative(-13.35f, -30.94f)
                lineToRelative(-13.35f, 30.94f)
                lineToRelative(-34.65f, 2.67f)
                lineToRelative(26.4f, 21.8f)
                lineToRelative(-8.07f, 32.59f)
                lineToRelative(29.67f, -17.46f)
                close()
            }
        }.build()

        return _ListStarBold!!
    }

@Suppress("ObjectPropertyName")
private var _ListStarBold: ImageVector? = null
