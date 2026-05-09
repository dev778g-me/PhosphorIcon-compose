package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BehanceLogoFill: ImageVector
    get() {
        if (_BehanceLogoFill != null) {
            return _BehanceLogoFill!!
        }
        _BehanceLogoFill = ImageVector.Builder(
            name = "Filled.BehanceLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(92f, 120f)
                lineTo(64f, 120f)
                lineTo(64f, 96f)
                lineTo(92f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                close()
                moveTo(96f, 136f)
                lineTo(64f, 136f)
                verticalLineToRelative(32f)
                lineTo(96f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                close()
                moveTo(176f, 120f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 16f)
                horizontalLineToRelative(45.24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 120f)
                close()
                moveTo(240f, 56f)
                lineTo(240f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(32f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 40f)
                lineTo(224f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 56f)
                close()
                moveTo(144f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(152f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 88f)
                close()
                moveTo(128f, 152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.13f, -26.53f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 80f)
                lineTo(56f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(96f, 184f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 152f)
                close()
                moveTo(216f, 144f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.54f, 30f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.59f, -12f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.49f, -10f)
                lineTo(208f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 144f)
                close()
            }
        }.build()

        return _BehanceLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _BehanceLogoFill: ImageVector? = null
