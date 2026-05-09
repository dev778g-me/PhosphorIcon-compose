package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.GameControllerDuotone: ImageVector
    get() {
        if (_GameControllerDuotone != null) {
            return _GameControllerDuotone!!
        }
        _GameControllerDuotone = ImageVector.Builder(
            name = "Duotone.GameControllerDuotone",
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
                moveTo(239.57f, 175.14f)
                lineTo(223.21f, 91f)
                horizontalLineToRelative(0f)
                arcTo(51.94f, 51.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 152f)
                horizontalLineTo(150.09f)
                lineToRelative(42.11f, 47.8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.37f, -24.66f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 104f)
                lineTo(176f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                lineTo(104f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                lineTo(88f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(105.91f, 152f)
                lineTo(63.8f, 199.8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -47.37f, -24.66f)
                lineTo(32.79f, 91f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.1f, -43f)
                horizontalLineTo(172f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.09f, 152f)
                lineToRelative(42.11f, 47.8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.37f, -24.66f)
                lineTo(223.21f, 91f)
            }
        }.build()

        return _GameControllerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GameControllerDuotone: ImageVector? = null
