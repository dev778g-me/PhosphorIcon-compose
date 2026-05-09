package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.HeartStraight: ImageVector
    get() {
        if (_HeartStraight != null) {
            return _HeartStraight!!
        }
        _HeartStraight = ImageVector.Builder(
            name = "Regular.HeartStraight",
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
                moveTo(128f, 224f)
                lineToRelative(89.36f, -90.64f)
                arcToRelative(50f, 50f, 0f, isMoreThanHalf = true, isPositiveArc = false, -70.72f, -70.72f)
                lineTo(128f, 80f)
                lineTo(109.36f, 62.64f)
                arcToRelative(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, -70.72f, 70.72f)
                close()
            }
        }.build()

        return _HeartStraight!!
    }

@Suppress("ObjectPropertyName")
private var _HeartStraight: ImageVector? = null
