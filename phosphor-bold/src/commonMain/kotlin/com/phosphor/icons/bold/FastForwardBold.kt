package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FastForwardBold: ImageVector
    get() {
        if (_FastForwardBold != null) {
            return _FastForwardBold!!
        }
        _FastForwardBold = ImageVector.Builder(
            name = "Bold.FastForwardBold",
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
                moveTo(36f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(48.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 71.85f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(152.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 71.85f)
                close()
            }
        }.build()

        return _FastForwardBold!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardBold: ImageVector? = null
