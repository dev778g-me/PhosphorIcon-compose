package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowArcRightLight: ImageVector
    get() {
        if (_ArrowArcRightLight != null) {
            return _ArrowArcRightLight!!
        }
        _ArrowArcRightLight = ImageVector.Builder(
            name = "Light.ArrowArcRightLight",
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
                moveTo(168f, 152f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 184f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.88f, -67.88f)
                lineTo(232f, 152f)
            }
        }.build()

        return _ArrowArcRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowArcRightLight: ImageVector? = null
