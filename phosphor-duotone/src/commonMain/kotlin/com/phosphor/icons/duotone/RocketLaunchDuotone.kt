package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.RocketLaunchDuotone: ImageVector
    get() {
        if (_RocketLaunchDuotone != null) {
            return _RocketLaunchDuotone!!
        }
        _RocketLaunchDuotone = ImageVector.Builder(
            name = "Duotone.RocketLaunchDuotone",
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
                moveTo(184f, 120f)
                verticalLineToRelative(61.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 5.65f)
                lineToRelative(-34.35f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.57f, -4.53f)
                lineTo(128f, 176f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(136f, 72f)
                horizontalLineTo(74.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.65f, 2.34f)
                lineTo(34.35f, 108.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.53f, 13.57f)
                lineTo(80f, 128f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(94.56f, 187.82f)
                curveTo(90.69f, 196.31f, 77.65f, 216f, 40f, 216f)
                curveToRelative(0f, -37.65f, 19.69f, -50.69f, 28.18f, -54.56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(191.11f, 112.89f)
                curveToRelative(24f, -24f, 25.5f, -52.55f, 24.75f, -65.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.47f, -7.47f)
                curveToRelative(-12.73f, -0.75f, -41.26f, 0.73f, -65.28f, 24.75f)
                lineTo(80f, 128f)
                lineToRelative(48f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 72f)
                horizontalLineTo(74.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.65f, 2.34f)
                lineTo(34.35f, 108.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.53f, 13.57f)
                lineTo(80f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 120f)
                verticalLineToRelative(61.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 5.65f)
                lineToRelative(-34.35f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.57f, -4.53f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.56f, 187.82f)
                curveTo(90.69f, 196.31f, 77.65f, 216f, 40f, 216f)
                curveToRelative(0f, -37.65f, 19.69f, -50.69f, 28.18f, -54.56f)
            }
        }.build()

        return _RocketLaunchDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RocketLaunchDuotone: ImageVector? = null
