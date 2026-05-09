package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BellSimpleSlashLight: ImageVector
    get() {
        if (_BellSimpleSlashLight != null) {
            return _BellSimpleSlashLight!!
        }
        _BellSimpleSlashLight = ImageVector.Builder(
            name = "Light.BellSimpleSlashLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 224f)
                lineTo(160f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(186.18f, 192f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.88f, -12f)
                curveTo(47.71f, 168.6f, 56f, 139.81f, 56f, 104f)
                arcTo(71.65f, 71.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.85f, 62.94f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.48f, 41.36f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 104f)
                curveToRelative(0f, 29.1f, 5.48f, 53.56f, 11.07f, 67.8f)
            }
        }.build()

        return _BellSimpleSlashLight!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleSlashLight: ImageVector? = null
