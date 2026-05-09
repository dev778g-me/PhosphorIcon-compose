package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.MetronomeDuotone: ImageVector
    get() {
        if (_MetronomeDuotone != null) {
            return _MetronomeDuotone!!
        }
        _MetronomeDuotone = ImageVector.Builder(
            name = "Duotone.MetronomeDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(195.66f, 168f)
                horizontalLineTo(60.34f)
                lineToRelative(-12f, 37.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 216f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.63f, -10.43f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.34f, 168f)
                lineTo(195.66f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.63f, -10.43f)
                lineToRelative(50.91f, -160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.91f, 40f)
                horizontalLineToRelative(42.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.62f, 5.57f)
                lineToRelative(50.91f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(208f, 80f)
            }
        }.build()

        return _MetronomeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MetronomeDuotone: ImageVector? = null
