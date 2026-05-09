package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.GraduationCapLight: ImageVector
    get() {
        if (_GraduationCapLight != null) {
            return _GraduationCapLight!!
        }
        _GraduationCapLight = ImageVector.Builder(
            name = "Light.GraduationCapLight",
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
                moveTo(8f, 96f)
                lineToRelative(120f, -64f)
                lineToRelative(120f, 64f)
                lineToRelative(-120f, 64f)
                lineToRelative(-120f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineToRelative(56f, 29.87f)
                lineToRelative(0f, 114.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 113.07f)
                verticalLineToRelative(53.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 5.31f)
                curveToRelative(-11.3f, 12.59f, -38.9f, 36.4f, -86f, 36.4f)
                reflectiveCurveToRelative(-74.68f, -23.81f, -86f, -36.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -5.31f)
                verticalLineTo(113.07f)
            }
        }.build()

        return _GraduationCapLight!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCapLight: ImageVector? = null
