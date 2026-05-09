package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChargingStationFill: ImageVector
    get() {
        if (_ChargingStationFill != null) {
            return _ChargingStationFill!!
        }
        _ChargingStationFill = ImageVector.Builder(
            name = "Filled.ChargingStationFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(241f, 69.66f)
                lineTo(221.66f, 50.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(229.66f, 81f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 86.63f)
                verticalLineTo(168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(128f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(176f)
                verticalLineTo(56f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(72f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 56f)
                verticalLineTo(208f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(176f)
                verticalLineTo(120f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(40f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 0f)
                verticalLineTo(86.63f)
                arcTo(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 241f, 69.66f)
                close()
                moveTo(135.43f, 131f)
                lineToRelative(-16f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.57f, 165f)
                lineToRelative(11.61f, -29f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.43f, -11f)
                lineToRelative(16f, -40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 119.43f, 91f)
                lineToRelative(-11.61f, 29f)
                horizontalLineTo(128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.43f, 11f)
                close()
            }
        }.build()

        return _ChargingStationFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChargingStationFill: ImageVector? = null
