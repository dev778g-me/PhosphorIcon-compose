package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.WineDuotone: ImageVector
    get() {
        if (_WineDuotone != null) {
            return _WineDuotone!!
        }
        _WineDuotone = ImageVector.Builder(
            name = "Duotone.WineDuotone",
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
                moveTo(59.86f, 100.62f)
                curveTo(72.49f, 95.21f, 95.2f, 91.4f, 128f, 108f)
                curveToRelative(35.86f, 18.16f, 59.67f, 11.89f, 71.42f, 5.84f)
                horizontalLineToRelative(0f)
                arcToRelative(55.69f, 55.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.94f, 48.65f)
                arcToRelative(79.76f, 79.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -109f, 0f)
                arcTo(55.86f, 55.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.3f, 105.93f)
                lineToRelative(1.57f, -5.31f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 184f)
                lineTo(128f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 240f)
                lineTo(168f, 240f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80.09f, 32f)
                horizontalLineToRelative(95.82f)
                lineToRelative(21.79f, 73.93f)
                arcToRelative(55.84f, 55.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.22f, 56.56f)
                arcToRelative(79.76f, 79.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -109f, 0f)
                arcTo(55.86f, 55.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.3f, 105.93f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(59.86f, 100.62f)
                curveTo(72.49f, 95.21f, 95.2f, 91.4f, 128f, 108f)
                curveToRelative(35.86f, 18.16f, 59.67f, 11.89f, 71.42f, 5.84f)
            }
        }.build()

        return _WineDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WineDuotone: ImageVector? = null
