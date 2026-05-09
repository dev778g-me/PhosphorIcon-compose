package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BasketThin: ImageVector
    get() {
        if (_BasketThin != null) {
            return _BasketThin!!
        }
        _BasketThin = ImageVector.Builder(
            name = "Thin.BasketThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 88f)
                lineToRelative(-56f, -64f)
                lineToRelative(-56f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180.8f, 120f)
                lineTo(175.2f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(75.2f, 120f)
                lineTo(80.8f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 88f)
                horizontalLineTo(232f)
                lineTo(216.93f, 201.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209f, 208f)
                horizontalLineTo(47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.93f, -6.94f)
                close()
            }
        }.build()

        return _BasketThin!!
    }

@Suppress("ObjectPropertyName")
private var _BasketThin: ImageVector? = null
