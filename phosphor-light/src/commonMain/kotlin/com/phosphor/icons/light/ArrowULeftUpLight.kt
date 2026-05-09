package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowULeftUpLight: ImageVector
    get() {
        if (_ArrowULeftUpLight != null) {
            return _ArrowULeftUpLight!!
        }
        _ArrowULeftUpLight = ImageVector.Builder(
            name = "Light.ArrowULeftUpLight",
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
                moveTo(136f, 80f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 80f)
                verticalLineToRelative(88f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                verticalLineTo(32f)
            }
        }.build()

        return _ArrowULeftUpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftUpLight: ImageVector? = null
