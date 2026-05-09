package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.DropSlashLight: ImageVector
    get() {
        if (_DropSlashLight != null) {
            return _DropSlashLight!!
        }
        _DropSlashLight = ImageVector.Builder(
            name = "Light.DropSlashLight",
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
                moveTo(205.14f, 165.28f)
                arcTo(80.3f, 80.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                curveToRelative(0f, -72f, -80f, -128f, -80f, -128f)
                arcTo(242.3f, 242.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 95.54f, 44.72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74.9f, 69.59f)
                curveTo(60.11f, 90.4f, 48f, 116f, 48f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 141.29f, 51.42f)
            }
        }.build()

        return _DropSlashLight!!
    }

@Suppress("ObjectPropertyName")
private var _DropSlashLight: ImageVector? = null
