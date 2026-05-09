package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CoatHangerLight: ImageVector
    get() {
        if (_CoatHangerLight != null) {
            return _CoatHangerLight!!
        }
        _CoatHangerLight = ImageVector.Builder(
            name = "Light.CoatHangerLight",
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
                moveTo(96f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                lineTo(19.22f, 177.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 192f)
                horizontalLineTo(232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -14.4f)
                lineTo(128f, 96f)
            }
        }.build()

        return _CoatHangerLight!!
    }

@Suppress("ObjectPropertyName")
private var _CoatHangerLight: ImageVector? = null
