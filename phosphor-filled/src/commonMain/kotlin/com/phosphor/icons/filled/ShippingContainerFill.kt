package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ShippingContainerFill: ImageVector
    get() {
        if (_ShippingContainerFill != null) {
            return _ShippingContainerFill!!
        }
        _ShippingContainerFill = ImageVector.Builder(
            name = "Filled.ShippingContainerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236.4f, 70.65f)
                lineTo(130.2f, 40.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.33f, -0.23f)
                lineTo(21.74f, 55.1f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 70.94f)
                lineTo(8f, 185.06f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.74f, 200.9f)
                lineToRelative(105.13f, 15f)
                arcTo(8.47f, 8.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 216f)
                arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.2f, -0.31f)
                lineToRelative(106.2f, -30.34f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 170f)
                lineTo(248f, 86f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236.4f, 70.65f)
                close()
                moveTo(64f, 120f)
                lineTo(48f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(64f, 136f)
                verticalLineToRelative(54.78f)
                lineToRelative(-40f, -5.72f)
                lineTo(24f, 70.94f)
                lineToRelative(40f, -5.72f)
                close()
                moveTo(120f, 198.78f)
                lineTo(80f, 193.06f)
                lineTo(80f, 136f)
                lineTo(96f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(80f, 120f)
                lineTo(80f, 62.94f)
                lineToRelative(40f, -5.72f)
                close()
            }
        }.build()

        return _ShippingContainerFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShippingContainerFill: ImageVector? = null
