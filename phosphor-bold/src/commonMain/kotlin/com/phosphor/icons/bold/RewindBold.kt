package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RewindBold: ImageVector
    get() {
        if (_RewindBold != null) {
            return _RewindBold!!
        }
        _RewindBold = ImageVector.Builder(
            name = "Bold.RewindBold",
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
                moveTo(224f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.18f, 6.59f)
                lineToRelative(-88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -13.18f)
                lineToRelative(88.19f, -56.15f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 71.85f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.18f, 6.59f)
                lineTo(19.63f, 134.59f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -13.18f)
                lineToRelative(88.19f, -56.15f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 71.85f)
                close()
            }
        }.build()

        return _RewindBold!!
    }

@Suppress("ObjectPropertyName")
private var _RewindBold: ImageVector? = null
