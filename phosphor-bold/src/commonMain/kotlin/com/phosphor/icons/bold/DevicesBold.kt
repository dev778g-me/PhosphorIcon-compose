package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DevicesBold: ImageVector
    get() {
        if (_DevicesBold != null) {
            return _DevicesBold!!
        }
        _DevicesBold = ImageVector.Builder(
            name = "Bold.DevicesBold",
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
                moveTo(240f, 100f)
                lineTo(240f, 192f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 208f)
                lineTo(164f, 208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 192f)
                lineTo(148f, 100f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 84f)
                lineTo(224f, 84f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 100f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 208f)
                lineTo(88f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 168f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineTo(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(188f, 124f)
                lineTo(200f, 124f)
            }
        }.build()

        return _DevicesBold!!
    }

@Suppress("ObjectPropertyName")
private var _DevicesBold: ImageVector? = null
