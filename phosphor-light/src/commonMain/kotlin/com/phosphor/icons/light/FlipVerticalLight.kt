package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FlipVerticalLight: ImageVector
    get() {
        if (_FlipVerticalLight != null) {
            return _FlipVerticalLight!!
        }
        _FlipVerticalLight = ImageVector.Builder(
            name = "Light.FlipVerticalLight",
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
                moveTo(59.12f, 32.64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 40f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(216f)
                curveToRelative(8.72f, 0f, 11.15f, -12f, 3.12f, -15.37f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(219.11f, 159.37f)
                curveToRelative(8f, -3.4f, 5.6f, -15.37f, -3.12f, -15.37f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.12f, 7.37f)
                close()
            }
        }.build()

        return _FlipVerticalLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlipVerticalLight: ImageVector? = null
