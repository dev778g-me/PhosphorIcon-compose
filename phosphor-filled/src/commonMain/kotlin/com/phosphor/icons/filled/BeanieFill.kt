package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BeanieFill: ImageVector
    get() {
        if (_BeanieFill != null) {
            return _BeanieFill!!
        }
        _BeanieFill = ImageVector.Builder(
            name = "Filled.BeanieFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 162.16f)
                lineTo(224f, 144f)
                arcToRelative(96.18f, 96.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -72.34f, -93f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -47.32f, 0f)
                arcTo(96.18f, 96.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 144f)
                verticalLineToRelative(18.16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 176f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 162.16f)
                close()
                moveTo(120f, 176f)
                verticalLineToRelative(32f)
                lineTo(80f, 208f)
                lineTo(80f, 176f)
                close()
                moveTo(136f, 176f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(32f)
                lineTo(136f, 208f)
                close()
                moveTo(116f, 36f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 36f)
                close()
                moveTo(40f, 176f)
                lineTo(64f, 176f)
                verticalLineToRelative(32f)
                lineTo(40f, 208f)
                close()
                moveTo(216f, 208f)
                lineTo(192f, 208f)
                lineTo(192f, 176f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(32f)
                close()
            }
        }.build()

        return _BeanieFill!!
    }

@Suppress("ObjectPropertyName")
private var _BeanieFill: ImageVector? = null
