package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SubwayFill: ImageVector
    get() {
        if (_SubwayFill != null) {
            return _SubwayFill!!
        }
        _SubwayFill = ImageVector.Builder(
            name = "Filled.SubwayFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 176f)
                lineTo(156f, 152f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                close()
                moveTo(140f, 176f)
                lineTo(140f, 152f)
                lineTo(116f, 152f)
                verticalLineToRelative(24f)
                close()
                moveTo(176f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(88f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(96f)
                close()
                moveTo(152f, 24f)
                lineTo(104f, 24f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
                lineTo(32f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(76.58f, 216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, -2.21f)
                lineTo(91.06f, 192f)
                lineTo(88f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(64f, 88f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 64f)
                horizontalLineToRelative(80f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                verticalLineToRelative(80f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                horizontalLineToRelative(-3.06f)
                lineToRelative(10.9f, 21.79f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 2.21f)
                lineTo(216f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(224f, 96f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                close()
                moveTo(147.06f, 192f)
                lineTo(108.94f, 192f)
                lineToRelative(-9.1f, 18.21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 5.79f)
                horizontalLineToRelative(49.16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, -5.79f)
                close()
                moveTo(80f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(12f)
                lineTo(100f, 152f)
                lineTo(80f, 152f)
                close()
            }
        }.build()

        return _SubwayFill!!
    }

@Suppress("ObjectPropertyName")
private var _SubwayFill: ImageVector? = null
