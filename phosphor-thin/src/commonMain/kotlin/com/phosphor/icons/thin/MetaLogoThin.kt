package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.MetaLogoThin: ImageVector
    get() {
        if (_MetaLogoThin != null) {
            return _MetaLogoThin!!
        }
        _MetaLogoThin = ImageVector.Builder(
            name = "Thin.MetaLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.78f, 147.35f)
                curveTo(93.88f, 175.86f, 77.52f, 200f, 58.56f, 200f)
                curveTo(-3.16f, 200f, 27.7f, 56f, 74f, 56f)
                reflectiveCurveToRelative(77.15f, 144f, 123.45f, 144f)
                curveTo(259.16f, 200f, 228.3f, 56f, 182f, 56f)
                curveToRelative(-12.62f, 0f, -24.1f, 10.7f, -35f, 26.27f)
            }
        }.build()

        return _MetaLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _MetaLogoThin: ImageVector? = null
