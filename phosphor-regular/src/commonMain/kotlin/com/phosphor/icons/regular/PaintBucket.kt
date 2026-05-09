package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.PaintBucket: ImageVector
    get() {
        if (_PaintBucket != null) {
            return _PaintBucket!!
        }
        _PaintBucket = ImageVector.Builder(
            name = "Regular.PaintBucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 139.48f)
                lineToRelative(-79.83f, 79.83f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.63f, 0f)
                lineTo(20.69f, 134.46f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.63f)
                lineTo(116.52f, 16f)
                lineTo(232f, 131.48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(124f, 116f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.86f, 101.86f)
                lineTo(39.99f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(248f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
                curveToRelative(0f, -16f, 16f, -40f, 16f, -40f)
                reflectiveCurveTo(248f, 192f, 248f, 208f)
                close()
            }
        }.build()

        return _PaintBucket!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBucket: ImageVector? = null
