package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.TextAaLight: ImageVector
    get() {
        if (_TextAaLight != null) {
            return _TextAaLight!!
        }
        _TextAaLight = ImageVector.Builder(
            name = "Light.TextAaLight",
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
                moveTo(144f, 192f)
                lineToRelative(-64f, -136f)
                lineToRelative(-64f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 164f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                arcToRelative(32f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 192f)
                verticalLineTo(132f)
                curveToRelative(0f, -15.46f, -14.33f, -28f, -32f, -28f)
                curveToRelative(-9.56f, 0f, -18.14f, 2.18f, -24f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(125.18f, 152f)
                lineTo(34.82f, 152f)
            }
        }.build()

        return _TextAaLight!!
    }

@Suppress("ObjectPropertyName")
private var _TextAaLight: ImageVector? = null
