package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.NumberTwoBold: ImageVector
    get() {
        if (_NumberTwoBold != null) {
            return _NumberTwoBold!!
        }
        _NumberTwoBold = ImageVector.Builder(
            name = "Bold.NumberTwoBold",
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
                moveTo(91.33f, 72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68.61f, 40.07f)
                lineTo(88f, 208f)
                horizontalLineToRelative(80f)
            }
        }.build()

        return _NumberTwoBold!!
    }

@Suppress("ObjectPropertyName")
private var _NumberTwoBold: ImageVector? = null
