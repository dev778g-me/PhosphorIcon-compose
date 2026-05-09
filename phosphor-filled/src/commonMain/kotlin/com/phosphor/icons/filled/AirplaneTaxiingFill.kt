package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AirplaneTaxiingFill: ImageVector
    get() {
        if (_AirplaneTaxiingFill != null) {
            return _AirplaneTaxiingFill!!
        }
        _AirplaneTaxiingFill = ImageVector.Builder(
            name = "Filled.AirplaneTaxiingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 136f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(61.07f, 168f)
                arcToRelative(39.75f, 39.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.31f, -28.51f)
                lineTo(8.69f, 92.6f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 72f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                lineTo(59.32f, 96f)
                lineTo(81.81f, 96f)
                lineToRelative(-9f, -26.94f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 48f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineTo(147.32f, 96f)
                lineTo(208f, 96f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 136f)
                close()
                moveTo(208f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 184f)
                close()
                moveTo(112f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 184f)
                close()
            }
        }.build()

        return _AirplaneTaxiingFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneTaxiingFill: ImageVector? = null
