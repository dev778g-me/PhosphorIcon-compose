package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.EjectBold: ImageVector
    get() {
        if (_EjectBold != null) {
            return _EjectBold!!
        }
        _EjectBold = ImageVector.Builder(
            name = "Bold.EjectBold",
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
                moveTo(40f, 192f)
                lineTo(40f, 172f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 164f)
                lineTo(208f, 164f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 172f)
                lineTo(216f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                lineTo(48f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(42.32f, 110f)
                lineToRelative(73.76f, -76.93f)
                arcToRelative(16.53f, 16.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.84f, 0f)
                lineTo(213.68f, 110f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 14f)
                horizontalLineTo(48.27f)
                arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.32f, 110f)
                close()
            }
        }.build()

        return _EjectBold!!
    }

@Suppress("ObjectPropertyName")
private var _EjectBold: ImageVector? = null
