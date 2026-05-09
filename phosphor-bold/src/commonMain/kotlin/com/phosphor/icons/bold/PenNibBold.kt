package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PenNibBold: ImageVector
    get() {
        if (_PenNibBold != null) {
            return _PenNibBold!!
        }
        _PenNibBold = ImageVector.Builder(
            name = "Bold.PenNibBold",
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
                moveTo(122f, 134f)
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
                moveTo(40.01f, 216f)
                lineTo(106.44f, 149.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 216f)
                lineToRelative(139.45f, -23.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.17f, -5.08f)
                lineTo(208f, 128f)
                lineTo(128f, 48f)
                lineTo(68.32f, 70.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.08f, 6.17f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 128f)
                lineToRelative(29.66f, -29.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                lineTo(169f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 0f)
                lineTo(128f, 48f)
            }
        }.build()

        return _PenNibBold!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibBold: ImageVector? = null
