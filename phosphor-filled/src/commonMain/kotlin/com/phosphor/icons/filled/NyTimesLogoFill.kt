package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NyTimesLogoFill: ImageVector
    get() {
        if (_NyTimesLogoFill != null) {
            return _NyTimesLogoFill!!
        }
        _NyTimesLogoFill = ImageVector.Builder(
            name = "Filled.NyTimesLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 136f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 136f)
                close()
                moveTo(184.62f, 103.25f)
                lineTo(118.91f, 72.59f)
                arcTo(71.95f, 71.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.06f, 141.3f)
                lineToRelative(68.18f, -36.36f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 112f)
                lineTo(136f, 215.55f)
                arcToRelative(71.64f, 71.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60.71f, -50f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 212f, 170.4f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 51.74f, 100.1f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 32f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.38f, 0.75f)
                lineTo(189.63f, 87.93f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
                arcTo(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184.62f, 103.25f)
                close()
                moveTo(96f, 208.47f)
                lineTo(96f, 138.13f)
                lineTo(57.51f, 158.66f)
                arcTo(72.23f, 72.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 208.47f)
                close()
                moveTo(96.13f, 62f)
                lineTo(66.37f, 48.07f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.2f, 38.71f)
                curveToRelative(0.6f, -0.71f, 1.2f, -1.42f, 1.84f, -2.11f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.13f, 62f)
                close()
            }
        }.build()

        return _NyTimesLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _NyTimesLogoFill: ImageVector? = null
