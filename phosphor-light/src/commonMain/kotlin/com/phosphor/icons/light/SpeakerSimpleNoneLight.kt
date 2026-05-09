package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.SpeakerSimpleNoneLight: ImageVector
    get() {
        if (_SpeakerSimpleNoneLight != null) {
            return _SpeakerSimpleNoneLight!!
        }
        _SpeakerSimpleNoneLight = ImageVector.Builder(
            name = "Light.SpeakerSimpleNoneLight",
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
                moveTo(88f, 168f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(88f)
                lineToRelative(72f, -56f)
                verticalLineTo(224f)
                close()
            }
        }.build()

        return _SpeakerSimpleNoneLight!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleNoneLight: ImageVector? = null
