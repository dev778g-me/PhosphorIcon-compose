package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BinaryBold: ImageVector
    get() {
        if (_BinaryBold != null) {
            return _BinaryBold!!
        }
        _BinaryBold = ImageVector.Builder(
            name = "Bold.BinaryBold",
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
                moveTo(64f, 72f)
                arcToRelative(28f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56f, 0f)
                arcToRelative(28f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 108f)
                lineToRelative(0f, -72f)
                lineToRelative(-24f, 12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 184f)
                arcToRelative(28f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56f, 0f)
                arcToRelative(28f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 220f)
                lineToRelative(0f, -72f)
                lineToRelative(-24f, 12f)
            }
        }.build()

        return _BinaryBold!!
    }

@Suppress("ObjectPropertyName")
private var _BinaryBold: ImageVector? = null
