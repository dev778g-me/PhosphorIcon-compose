package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ThermometerColdFill: ImageVector
    get() {
        if (_ThermometerColdFill != null) {
            return _ThermometerColdFill!!
        }
        _ThermometerColdFill = ImageVector.Builder(
            name = "Filled.ThermometerColdFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248.91f, 77.72f)
                lineToRelative(-20f, 6.49f)
                lineToRelative(12.34f, 17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.94f, 9.4f)
                lineTo(216f, 93.61f)
                lineToRelative(-12.34f, 17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.94f, -9.4f)
                lineToRelative(12.34f, -17f)
                lineToRelative(-20f, -6.49f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 62.5f)
                lineTo(208f, 69f)
                lineTo(208f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(224f, 69f)
                lineToRelative(20f, -6.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 15.22f)
                close()
                moveTo(176f, 192f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -88f, -46f)
                lineTo(88f, 40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                lineTo(152f, 146f)
                arcTo(56.23f, 56.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 192f)
                close()
                moveTo(80.82f, 184f)
                horizontalLineToRelative(78.36f)
                arcTo(40.16f, 40.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 157.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -6.93f)
                lineTo(136f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
                lineTo(104f, 150.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 6.93f)
                arcTo(40.16f, 40.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.82f, 184f)
                close()
            }
        }.build()

        return _ThermometerColdFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerColdFill: ImageVector? = null
