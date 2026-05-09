package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SidebarSimpleFill: ImageVector
    get() {
        if (_SidebarSimpleFill != null) {
            return _SidebarSimpleFill!!
        }
        _SidebarSimpleFill = ImageVector.Builder(
            name = "Filled.SidebarSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(216f, 200f)
                lineTo(88f, 200f)
                lineTo(88f, 56f)
                lineTo(216f, 56f)
                lineTo(216f, 200f)
                close()
            }
        }.build()

        return _SidebarSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarSimpleFill: ImageVector? = null
