package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.BackspaceLight: ImageVector
    get() {
        if (_BackspaceLight != null) {
            return _BackspaceLight!!
        }
        _BackspaceLight = ImageVector.Builder(
            name = "Light.BackspaceLight",
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
                moveTo(61.67f, 204.12f)
                lineTo(16f, 128f)
                lineTo(61.67f, 51.88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.53f, 48f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(68.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.67f, 204.12f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 104f)
                lineTo(112f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 152f)
                lineTo(112f, 104f)
            }
        }.build()

        return _BackspaceLight!!
    }

@Suppress("ObjectPropertyName")
private var _BackspaceLight: ImageVector? = null
