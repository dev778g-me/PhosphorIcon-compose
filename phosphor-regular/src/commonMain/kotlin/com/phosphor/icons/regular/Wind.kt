package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Regular.Wind",
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
                moveTo(128f, 192f)
                curveToRelative(3.39f, 9.15f, 13.67f, 16f, 24f, 16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -48f)
                horizontalLineTo(40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 64f)
                curveToRelative(3.39f, -9.15f, 13.67f, -16f, 24f, -16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                horizontalLineTo(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 96f)
                curveToRelative(3.39f, -9.15f, 13.67f, -16f, 24f, -16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                horizontalLineTo(32f)
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
