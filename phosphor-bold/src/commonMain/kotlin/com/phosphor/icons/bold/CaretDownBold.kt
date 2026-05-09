package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CaretDownBold: ImageVector
    get() {
        if (_CaretDownBold != null) {
            return _CaretDownBold!!
        }
        _CaretDownBold = ImageVector.Builder(
            name = "Bold.CaretDownBold",
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
                moveTo(208f, 96f)
                lineToRelative(-80f, 80f)
                lineToRelative(-80f, -80f)
            }
        }.build()

        return _CaretDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDownBold: ImageVector? = null
