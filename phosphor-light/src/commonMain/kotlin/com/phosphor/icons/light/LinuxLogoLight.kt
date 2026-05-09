package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.LinuxLogoLight: ImageVector
    get() {
        if (_LinuxLogoLight != null) {
            return _LinuxLogoLight!!
        }
        _LinuxLogoLight = ImageVector.Builder(
            name = "Light.LinuxLogoLight",
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
                moveTo(32f, 208f)
                reflectiveCurveTo(64f, 168f, 64f, 88f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                curveToRelative(0f, 80f, 32f, 120f, 32f, 120f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 100f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 100f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 136f)
                lineToRelative(-32f, 16f)
                lineToRelative(-32f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 208f)
                curveToRelative(8f, -14.35f, 22.91f, -24f, 40f, -24f)
                reflectiveCurveToRelative(32f, 9.65f, 40f, 24f)
            }
        }.build()

        return _LinuxLogoLight!!
    }

@Suppress("ObjectPropertyName")
private var _LinuxLogoLight: ImageVector? = null
