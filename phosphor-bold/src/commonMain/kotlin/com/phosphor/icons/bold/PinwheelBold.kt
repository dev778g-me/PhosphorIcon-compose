package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PinwheelBold: ImageVector
    get() {
        if (_PinwheelBold != null) {
            return _PinwheelBold!!
        }
        _PinwheelBold = ImageVector.Builder(
            name = "Bold.PinwheelBold",
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
                moveTo(94.68f, 27.15f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.57f, 97.73f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(27.15f, 145.32f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.73f, -35.57f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(145.32f, 212.85f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -35.57f, -97.73f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(212.85f, 94.68f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -97.73f, 35.57f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164.48f, 164.48f)
                lineTo(224f, 224f)
            }
        }.build()

        return _PinwheelBold!!
    }

@Suppress("ObjectPropertyName")
private var _PinwheelBold: ImageVector? = null
