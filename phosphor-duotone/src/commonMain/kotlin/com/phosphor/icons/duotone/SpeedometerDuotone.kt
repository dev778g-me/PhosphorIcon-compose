package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SpeedometerDuotone: ImageVector
    get() {
        if (_SpeedometerDuotone != null) {
            return _SpeedometerDuotone!!
        }
        _SpeedometerDuotone = ImageVector.Builder(
            name = "Duotone.SpeedometerDuotone",
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
                moveTo(29.89f, 186.59f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 151.19f)
                curveTo(24.44f, 94f, 71.73f, 47.49f, 129f, 48f)
                arcTo(104.09f, 104.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 226.1f, 186.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.57f, 5.37f)
                horizontalLineTo(37.46f)
                arcTo(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.89f, 186.59f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 160f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56.44f, 160f)
                arcToRelative(73f, 73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, -8f)
                arcToRelative(72.06f, 72.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95f, -68.25f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220.62f, 104.64f)
                arcToRelative(104.38f, 104.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.48f, 82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.57f, 5.37f)
                horizontalLineTo(37.46f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.57f, -5.41f)
                arcTo(104.06f, 104.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 151.19f)
                curveTo(24.44f, 94f, 71.73f, 47.49f, 129f, 48f)
                arcToRelative(103.68f, 103.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46.4f, 11.38f)
            }
        }.build()

        return _SpeedometerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SpeedometerDuotone: ImageVector? = null
