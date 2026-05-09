package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CheeseFill: ImageVector
    get() {
        if (_CheeseFill != null) {
            return _CheeseFill!!
        }
        _CheeseFill = ImageVector.Builder(
            name = "Filled.CheeseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 32f)
                arcToRelative(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.3f, 0.34f)
                lineToRelative(-160f, 48f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 88f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(7.46f)
                curveToRelative(13.45f, 0f, 24.79f, 11f, 24.54f, 24.46f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 160f)
                lineTo(24f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(224f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 88f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 32f)
                close()
                moveTo(80f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                close()
                moveTo(168f, 136f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31f, -40f)
                horizontalLineToRelative(62f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31f, 40f)
                close()
                moveTo(78.51f, 80f)
                lineTo(185.12f, 48f)
                arcToRelative(40.06f, 40.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.07f, 32f)
                close()
            }
        }.build()

        return _CheeseFill!!
    }

@Suppress("ObjectPropertyName")
private var _CheeseFill: ImageVector? = null
