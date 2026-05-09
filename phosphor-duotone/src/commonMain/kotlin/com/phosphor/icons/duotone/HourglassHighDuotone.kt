package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HourglassHighDuotone: ImageVector
    get() {
        if (_HourglassHighDuotone != null) {
            return _HourglassHighDuotone!!
        }
        _HourglassHighDuotone = ImageVector.Builder(
            name = "Duotone.HourglassHighDuotone",
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
                moveTo(128f, 128f)
                lineTo(67.2f, 82.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 76f)
                verticalLineTo(64f)
                horizontalLineTo(192f)
                verticalLineTo(75.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.82f, 82f)
                lineTo(128f, 128f)
                horizontalLineToRelative(0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 64f)
                lineTo(192f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineTo(67.2f, 82.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 76f)
                verticalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(75.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.82f, 82f)
                lineTo(128f, 128f)
                horizontalLineToRelative(0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                lineTo(67.2f, 173.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 180f)
                verticalLineToRelative(36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(180.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.18f, -6.38f)
                lineTo(128f, 128f)
                horizontalLineToRelative(0f)
            }
        }.build()

        return _HourglassHighDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassHighDuotone: ImageVector? = null
