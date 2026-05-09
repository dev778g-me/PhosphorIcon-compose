package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ScribbleDuotone: ImageVector
    get() {
        if (_ScribbleDuotone != null) {
            return _ScribbleDuotone!!
        }
        _ScribbleDuotone = ImageVector.Builder(
            name = "Duotone.ScribbleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(200f, 40f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 40f)
                lineTo(46.63f, 81.37f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                horizontalLineToRelative(0f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
                lineToRelative(66.74f, -66.74f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                lineTo(78.63f, 177.37f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                horizontalLineToRelative(0f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
                lineToRelative(66.74f, -66.74f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
                lineTo(200f, 184f)
                arcToRelative(22.62f, 22.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
                horizontalLineToRelative(0f)
            }
        }.build()

        return _ScribbleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleDuotone: ImageVector? = null
