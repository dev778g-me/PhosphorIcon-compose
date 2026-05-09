package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.WatchBold: ImageVector
    get() {
        if (_WatchBold != null) {
            return _WatchBold!!
        }
        _WatchBold = ImageVector.Builder(
            name = "Bold.WatchBold",
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
                moveTo(128f, 128f)
                moveToRelative(-68f, 0f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = true, 136f, 0f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = true, -136f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 100f)
                lineToRelative(0f, 28f)
                lineToRelative(28f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87f, 73.76f)
                lineToRelative(7.83f, -43.19f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102.68f, 24f)
                horizontalLineToRelative(50.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.87f, 6.57f)
                lineTo(169f, 73.76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87f, 182.24f)
                lineToRelative(7.83f, 43.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 6.57f)
                horizontalLineToRelative(50.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, -6.57f)
                lineTo(169f, 182.24f)
            }
        }.build()

        return _WatchBold!!
    }

@Suppress("ObjectPropertyName")
private var _WatchBold: ImageVector? = null
