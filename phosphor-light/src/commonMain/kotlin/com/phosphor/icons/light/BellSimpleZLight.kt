package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BellSimpleZLight: ImageVector
    get() {
        if (_BellSimpleZLight != null) {
            return _BellSimpleZLight!!
        }
        _BellSimpleZLight = ImageVector.Builder(
            name = "Light.BellSimpleZLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 224f)
                lineTo(160f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 96f)
                lineToRelative(32f, 0f)
                lineToRelative(-32f, 48f)
                lineToRelative(32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 104f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                curveToRelative(0f, 35.82f, 8.3f, 64.6f, 14.9f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 192f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.88f, -12f)
                curveTo(47.71f, 168.6f, 56f, 139.81f, 56f, 104f)
                close()
            }
        }.build()

        return _BellSimpleZLight!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleZLight: ImageVector? = null
