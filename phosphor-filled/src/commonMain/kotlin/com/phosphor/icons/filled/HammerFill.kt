package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HammerFill: ImageVector
    get() {
        if (_HammerFill != null) {
            return _HammerFill!!
        }
        _HammerFill = ImageVector.Builder(
            name = "Filled.HammerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(251.34f, 112f)
                lineTo(183.88f, 44.08f)
                arcToRelative(96.1f, 96.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -135.77f, 0f)
                lineToRelative(-0.09f, 0.09f)
                lineTo(34.25f, 58.4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.74f, 69.53f)
                lineTo(59.47f, 55.35f)
                arcToRelative(79.92f, 79.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.71f, -13.9f)
                lineTo(124.68f, 88f)
                lineToRelative(-96f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(20.69f, 20.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineToRelative(96f, -96f)
                lineToRelative(32f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineToRelative(28.69f, -28.69f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 251.34f, 112f)
                close()
                moveTo(162.34f, 114.33f)
                lineTo(140f, 136.67f)
                lineTo(119.31f, 116f)
                lineToRelative(22.35f, -22.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.32f)
                lineTo(94.32f, 35f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78.23f, 20.41f)
                lineToRelative(44.22f, 44.51f)
                lineTo(188f, 128.66f)
                lineToRelative(-14.34f, -14.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162.34f, 114.32f)
                close()
                moveTo(211.34f, 151.99f)
                lineTo(199.34f, 139.99f)
                lineTo(228f, 111.25f)
                lineToRelative(12f, 12f)
                close()
            }
        }.build()

        return _HammerFill!!
    }

@Suppress("ObjectPropertyName")
private var _HammerFill: ImageVector? = null
