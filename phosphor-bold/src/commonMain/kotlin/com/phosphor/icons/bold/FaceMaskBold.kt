package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FaceMaskBold: ImageVector
    get() {
        if (_FaceMaskBold != null) {
            return _FaceMaskBold!!
        }
        _FaceMaskBold = ImageVector.Builder(
            name = "Bold.FaceMaskBold",
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
                moveTo(92f, 100f)
                lineTo(164f, 100f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 140f)
                lineTo(164f, 140f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(209.41f, 152f)
                horizontalLineTo(220f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(104f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineToRelative(-8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(46.59f, 152f)
                horizontalLineTo(36f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineTo(104f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 80f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 76.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -7.43f)
                lineToRelative(72f, -28.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.94f, 0f)
                lineToRelative(72f, 28.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7.43f)
                verticalLineTo(136f)
                curveToRelative(0f, 56f, -80f, 72f, -80f, 72f)
                reflectiveCurveToRelative(-80f, -16f, -80f, -72f)
                close()
            }
        }.build()

        return _FaceMaskBold!!
    }

@Suppress("ObjectPropertyName")
private var _FaceMaskBold: ImageVector? = null
