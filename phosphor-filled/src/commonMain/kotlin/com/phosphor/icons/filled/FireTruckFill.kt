package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FireTruckFill: ImageVector
    get() {
        if (_FireTruckFill != null) {
            return _FireTruckFill!!
        }
        _FireTruckFill = ImageVector.Builder(
            name = "Filled.FireTruckFill",
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
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(64f)
                lineTo(24f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
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
                moveTo(192f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 208f)
                close()
                moveTo(192f, 112f)
                lineTo(192f, 88f)
                horizontalLineToRelative(34.58f)
                lineToRelative(9.6f, 24f)
                close()
                moveTo(24f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(152f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(136f, 96f)
                lineTo(136f, 72f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(24f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(40f, 72f)
                lineTo(40f, 96f)
                close()
                moveTo(96f, 72f)
                horizontalLineToRelative(24f)
                lineTo(120f, 96f)
                lineTo(96f, 96f)
                close()
                moveTo(56f, 72f)
                lineTo(80f, 72f)
                lineTo(80f, 96f)
                lineTo(56f, 96f)
                close()
            }
        }.build()

        return _FireTruckFill!!
    }

@Suppress("ObjectPropertyName")
private var _FireTruckFill: ImageVector? = null
