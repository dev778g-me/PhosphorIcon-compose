package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TildeFill: ImageVector
    get() {
        if (_TildeFill != null) {
            return _TildeFill!!
        }
        _TildeFill = ImageVector.Builder(
            name = "Filled.TildeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(198f, 131.66f)
                curveToRelative(-13.19f, 15f, -25.34f, 20.29f, -36.37f, 20.29f)
                curveToRelative(-14.94f, 0f, -27.81f, -9.61f, -38.43f, -17.54f)
                curveToRelative(-19.2f, -14.34f, -31.89f, -23.81f, -53.2f, 0.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -10.55f)
                curveToRelative(31.05f, -35.41f, 56.34f, -16.53f, 74.8f, -2.75f)
                curveToRelative(19.2f, 14.34f, 31.89f, 23.81f, 53.2f, -0.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 10.55f)
                close()
            }
        }.build()

        return _TildeFill!!
    }

@Suppress("ObjectPropertyName")
private var _TildeFill: ImageVector? = null
