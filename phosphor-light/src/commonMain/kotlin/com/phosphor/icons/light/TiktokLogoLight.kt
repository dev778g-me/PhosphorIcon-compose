package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.TiktokLogoLight: ImageVector
    get() {
        if (_TiktokLogoLight != null) {
            return _TiktokLogoLight!!
        }
        _TiktokLogoLight = ImageVector.Builder(
            name = "Light.TiktokLogoLight",
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
                moveTo(168f, 102f)
                arcToRelative(95.55f, 95.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 18f)
                verticalLineTo(80f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                horizontalLineTo(128f)
                verticalLineTo(156f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -25.31f)
                verticalLineTo(88f)
                curveToRelative(-31.83f, 5.67f, -56f, 34.54f, -56f, 68f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 0f)
                close()
            }
        }.build()

        return _TiktokLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _TiktokLogoLight: ImageVector? = null
