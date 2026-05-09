package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Regular.Key",
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
                moveTo(93.17f, 122.83f)
                arcTo(71.68f, 71.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 95.91f)
                curveToRelative(0f, -38.58f, 31.08f, -70.64f, 69.64f, -71.87f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 98.36f)
                curveTo(230.73f, 136.92f, 198.67f, 168f, 160.09f, 168f)
                arcToRelative(71.68f, 71.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -26.92f, -5.17f)
                horizontalLineToRelative(0f)
                lineTo(120f, 176f)
                horizontalLineTo(96f)
                verticalLineToRelative(24f)
                horizontalLineTo(72f)
                verticalLineToRelative(24f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(187.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -5.65f)
                lineToRelative(58.83f, -58.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(180f, 76f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
