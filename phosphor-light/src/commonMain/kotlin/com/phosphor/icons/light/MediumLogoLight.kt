package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.MediumLogoLight: ImageVector
    get() {
        if (_MediumLogoLight != null) {
            return _MediumLogoLight!!
        }
        _MediumLogoLight = ImageVector.Builder(
            name = "Light.MediumLogoLight",
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
                moveTo(72f, 128f)
                moveToRelative(-56f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 128f)
                arcToRelative(24f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
                arcToRelative(24f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 72f)
                lineTo(240f, 184f)
            }
        }.build()

        return _MediumLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _MediumLogoLight: ImageVector? = null
