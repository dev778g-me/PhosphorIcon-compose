package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowBendLeftUpLight: ImageVector
    get() {
        if (_ArrowBendLeftUpLight != null) {
            return _ArrowBendLeftUpLight!!
        }
        _ArrowBendLeftUpLight = ImageVector.Builder(
            name = "Light.ArrowBendLeftUpLight",
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
                moveTo(152f, 80f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
                verticalLineTo(32f)
            }
        }.build()

        return _ArrowBendLeftUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftUpLight: ImageVector? = null
