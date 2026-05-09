package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ClubLight: ImageVector
    get() {
        if (_ClubLight != null) {
            return _ClubLight!!
        }
        _ClubLight = ImageVector.Builder(
            name = "Light.ClubLight",
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
                moveTo(167.83f, 98.79f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -23.9f, 71.65f)
                lineTo(160f, 224f)
                horizontalLineTo(96f)
                lineToRelative(16.07f, -53.56f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -23.9f, -71.65f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 79.66f, 0f)
                close()
            }
        }.build()

        return _ClubLight!!
    }

@Suppress("ObjectPropertyName")
private var _ClubLight: ImageVector? = null
