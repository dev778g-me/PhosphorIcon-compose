package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PenNibStraightBold: ImageVector
    get() {
        if (_PenNibStraightBold != null) {
            return _PenNibStraightBold!!
        }
        _PenNibStraightBold = ImageVector.Builder(
            name = "Bold.PenNibStraightBold",
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
                moveTo(128f, 134f)
                moveToRelative(-22f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 0f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 156f)
                lineTo(128f, 244f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 72f)
                lineTo(40.83f, 127.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, 8.29f)
                lineTo(128f, 244f)
                lineToRelative(86.43f, -108.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.73f, -8.29f)
                lineTo(184f, 72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 72f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(72f)
            }
        }.build()

        return _PenNibStraightBold!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibStraightBold: ImageVector? = null
