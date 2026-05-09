package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AmbulanceFill: ImageVector
    get() {
        if (_AmbulanceFill != null) {
            return _AmbulanceFill!!
        }
        _AmbulanceFill = ImageVector.Builder(
            name = "Filled.AmbulanceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(255.43f, 117f)
                lineToRelative(-14f, -35f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 226.58f, 72f)
                lineTo(192f, 72f)
                lineTo(192f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(32f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 72f)
                lineTo(16f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(49f, 200f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(50f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 0f)
                horizontalLineToRelative(17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(256f, 120f)
                arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 255.43f, 117f)
                close()
                moveTo(80f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 208f)
                close()
                moveTo(136f, 128f)
                lineTo(120f, 128f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(104f, 128f)
                lineTo(88f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                lineTo(104f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(192f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                close()
                moveTo(192f, 112f)
                lineTo(192f, 88f)
                horizontalLineToRelative(34.58f)
                lineToRelative(9.6f, 24f)
                close()
            }
        }.build()

        return _AmbulanceFill!!
    }

@Suppress("ObjectPropertyName")
private var _AmbulanceFill: ImageVector? = null
