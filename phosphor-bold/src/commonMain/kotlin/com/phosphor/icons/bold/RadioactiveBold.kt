package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RadioactiveBold: ImageVector
    get() {
        if (_RadioactiveBold != null) {
            return _RadioactiveBold!!
        }
        _RadioactiveBold = ImageVector.Builder(
            name = "Bold.RadioactiveBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(105.77f, 90f)
                lineToRelative(-22f, -38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.55f, -2.54f)
                arcTo(95.94f, 95.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 119.14f)
                arcTo(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 128f)
                horizontalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.23f, 90f)
                lineToRelative(22f, -38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.55f, -2.54f)
                arcTo(95.94f, 95.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 119.14f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.86f)
                horizontalLineTo(172f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150f, 166.11f)
                lineToRelative(21.83f, 37.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, 11.26f)
                arcToRelative(96.24f, 96.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80.54f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.56f, -11.26f)
                lineTo(106f, 166.11f)
            }
        }.build()

        return _RadioactiveBold!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveBold: ImageVector? = null
