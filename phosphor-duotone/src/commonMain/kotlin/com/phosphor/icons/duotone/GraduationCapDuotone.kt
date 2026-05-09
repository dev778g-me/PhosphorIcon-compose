package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.GraduationCapDuotone: ImageVector
    get() {
        if (_GraduationCapDuotone != null) {
            return _GraduationCapDuotone!!
        }
        _GraduationCapDuotone = ImageVector.Builder(
            name = "Duotone.GraduationCapDuotone",
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
                moveTo(128f, 160f)
                lineTo(40f, 113.07f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(53.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.31f)
                curveToRelative(11.3f, 12.59f, 38.9f, 36.4f, 86f, 36.4f)
                reflectiveCurveToRelative(74.68f, -23.81f, 86f, -36.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -5.31f)
                verticalLineTo(113.07f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineToRelative(56f, 29.87f)
                lineToRelative(0f, 114.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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

        return _GraduationCapDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCapDuotone: ImageVector? = null
