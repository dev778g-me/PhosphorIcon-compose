package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TruckTrailerFill: ImageVector
    get() {
        if (_TruckTrailerFill != null) {
            return _TruckTrailerFill!!
        }
        _TruckTrailerFill = ImageVector.Builder(
            name = "Filled.TruckTrailerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 96.8f)
                lineTo(224f, 96f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                horizontalLineToRelative(-8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                lineTo(144f, 176f)
                lineTo(128f, 176f)
                lineTo(128f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(16f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 80f)
                lineTo(0f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 21.13f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 111f, 192f)
                horizontalLineToRelative(82f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63f, -8f)
                lineTo(256f, 136f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 96.8f)
                close()
                moveTo(32f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200f)
                close()
                moveTo(80f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 200f)
                close()
                moveTo(224f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 200f)
                close()
            }
        }.build()

        return _TruckTrailerFill!!
    }

@Suppress("ObjectPropertyName")
private var _TruckTrailerFill: ImageVector? = null
