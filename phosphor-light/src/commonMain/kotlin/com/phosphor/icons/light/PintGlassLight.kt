package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.PintGlassLight: ImageVector
    get() {
        if (_PintGlassLight != null) {
            return _PintGlassLight!!
        }
        _PintGlassLight = ImageVector.Builder(
            name = "Light.PintGlassLight",
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
                moveTo(56f, 32f)
                horizontalLineTo(200f)
                lineTo(176.85f, 225f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168.9f, 232f)
                horizontalLineTo(87.1f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.15f, 225f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(60.8f, 72f)
                lineTo(195.2f, 72f)
            }
        }.build()

        return _PintGlassLight!!
    }

@Suppress("ObjectPropertyName")
private var _PintGlassLight: ImageVector? = null
