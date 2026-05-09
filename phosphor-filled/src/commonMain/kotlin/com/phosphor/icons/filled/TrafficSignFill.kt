package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TrafficSignFill: ImageVector
    get() {
        if (_TrafficSignFill != null) {
            return _TrafficSignFill!!
        }
        _TrafficSignFill = ImageVector.Builder(
            name = "Filled.TrafficSignFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(243.15f, 116.29f)
                lineTo(139.71f, 12.85f)
                arcToRelative(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.42f, 0f)
                lineTo(12.85f, 116.29f)
                arcToRelative(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 23.42f)
                lineTo(116.29f, 243.15f)
                horizontalLineToRelative(0f)
                arcToRelative(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.42f, 0f)
                lineTo(243.15f, 139.71f)
                arcToRelative(16.56f, 16.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -23.42f)
                close()
                moveTo(173.66f, 125.66f)
                lineTo(149.66f, 149.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(148.69f, 128f)
                lineTo(112f, 128f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(36.69f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173.66f, 125.66f)
                close()
            }
        }.build()

        return _TrafficSignFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrafficSignFill: ImageVector? = null
