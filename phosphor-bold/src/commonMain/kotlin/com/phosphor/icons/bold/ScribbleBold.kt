package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ScribbleBold: ImageVector
    get() {
        if (_ScribbleBold != null) {
            return _ScribbleBold!!
        }
        _ScribbleBold = ImageVector.Builder(
            name = "Bold.ScribbleBold",
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

        return _ScribbleBold!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleBold: ImageVector? = null
