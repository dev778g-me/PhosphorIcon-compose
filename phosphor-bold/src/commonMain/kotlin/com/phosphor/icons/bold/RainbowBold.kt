package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.RainbowBold: ImageVector
    get() {
        if (_RainbowBold != null) {
            return _RainbowBold!!
        }
        _RainbowBold = ImageVector.Builder(
            name = "Bold.RainbowBold",
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
                moveTo(12f, 180f)
                verticalLineToRelative(-8f)
                arcToRelative(116f, 116f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 0f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 180f)
                verticalLineToRelative(-4f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 0f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 180f)
                verticalLineToRelative(-4f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -144f, 0f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _RainbowBold!!
    }

@Suppress("ObjectPropertyName")
private var _RainbowBold: ImageVector? = null
