package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AndroidLogoFill: ImageVector
    get() {
        if (_AndroidLogoFill != null) {
            return _AndroidLogoFill!!
        }
        _AndroidLogoFill = ImageVector.Builder(
            name = "Filled.AndroidLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(207.06f, 80.67f)
                curveToRelative(-0.74f, -0.74f, -1.49f, -1.46f, -2.24f, -2.17f)
                lineToRelative(24.84f, -24.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineToRelative(-26f, 26f)
                arcToRelative(111.43f, 111.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -128.55f, 0.19f)
                lineTo(37.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.34f, 53.66f)
                lineTo(51.4f, 78.72f)
                arcTo(113.38f, 113.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 161.13f)
                lineTo(16f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(224f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 160f)
                arcTo(111.25f, 111.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207.06f, 80.67f)
                close()
                moveTo(92f, 160f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 160f)
                close()
                moveTo(164f, 160f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 160f)
                close()
            }
        }.build()

        return _AndroidLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _AndroidLogoFill: ImageVector? = null
