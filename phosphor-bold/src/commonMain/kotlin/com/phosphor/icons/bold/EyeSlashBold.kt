package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.EyeSlashBold: ImageVector
    get() {
        if (_EyeSlashBold != null) {
            return _EyeSlashBold!!
        }
        _EyeSlashBold = ImageVector.Builder(
            name = "Bold.EyeSlashBold",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(74f, 68.6f)
                curveTo(33.23f, 89.24f, 16f, 128f, 16f, 128f)
                reflectiveCurveToRelative(32f, 72f, 112f, 72f)
                arcToRelative(118.05f, 118.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54f, -12.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(214.41f, 163.59f)
                curveTo(232.12f, 145.73f, 240f, 128f, 240f, 128f)
                reflectiveCurveTo(208f, 56f, 128f, 56f)
                curveToRelative(-3.76f, 0f, -7.42f, 0.16f, -11f, 0.46f)
            }
        }.build()

        return _EyeSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlashBold: ImageVector? = null
