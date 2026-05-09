package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PottedPlantBold: ImageVector
    get() {
        if (_PottedPlantBold != null) {
            return _PottedPlantBold!!
        }
        _PottedPlantBold = ImageVector.Builder(
            name = "Bold.PottedPlantBold",
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
                moveTo(147.9f, 108.1f)
                curveToRelative(-23.94f, -39.91f, 8f, -79.81f, 75.82f, -75.82f)
                curveTo(227.71f, 100.11f, 187.81f, 132f, 147.9f, 108.1f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.35f, 110.35f)
                curveToRelative(17.11f, -28.5f, -5.7f, -57f, -54.15f, -54.15f)
                curveTo(37.35f, 104.65f, 65.85f, 127.46f, 94.35f, 110.35f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 156f)
                lineTo(200f, 156f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(183.11f, 156f)
                lineToRelative(-13.72f, 61.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, 6.26f)
                horizontalLineTo(94.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, -6.26f)
                lineTo(72.89f, 156f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.9f, 108.1f)
                lineTo(100f, 156f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.35f, 110.35f)
                lineTo(120f, 136f)
            }
        }.build()

        return _PottedPlantBold!!
    }

@Suppress("ObjectPropertyName")
private var _PottedPlantBold: ImageVector? = null
