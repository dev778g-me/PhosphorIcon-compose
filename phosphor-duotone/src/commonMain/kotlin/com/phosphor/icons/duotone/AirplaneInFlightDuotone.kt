package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.AirplaneInFlightDuotone: ImageVector
    get() {
        if (_AirplaneInFlightDuotone != null) {
            return _AirplaneInFlightDuotone!!
        }
        _AirplaneInFlightDuotone = ImageVector.Builder(
            name = "Duotone.AirplaneInFlightDuotone",
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
                moveTo(144f, 104f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(24f)
                horizontalLineTo(61.06f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.65f, -22.8f)
                lineTo(16.34f, 90.3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 80f)
                horizontalLineToRelative(8f)
                lineToRelative(24f, 24f)
                horizontalLineTo(92.91f)
                lineTo(80.42f, 66.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                horizontalLineToRelative(8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 216f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 104f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                verticalLineToRelative(24f)
                horizontalLineTo(61.06f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.65f, -22.8f)
                lineTo(16.34f, 90.3f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 80f)
                horizontalLineToRelative(8f)
                lineToRelative(24f, 24f)
                horizontalLineTo(92.91f)
                lineTo(80.42f, 66.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 56f)
                horizontalLineToRelative(8f)
                close()
            }
        }.build()

        return _AirplaneInFlightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneInFlightDuotone: ImageVector? = null
