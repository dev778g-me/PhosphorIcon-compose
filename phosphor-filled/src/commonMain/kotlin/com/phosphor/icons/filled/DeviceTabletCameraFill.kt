package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DeviceTabletCameraFill: ImageVector
    get() {
        if (_DeviceTabletCameraFill != null) {
            return _DeviceTabletCameraFill!!
        }
        _DeviceTabletCameraFill = ImageVector.Builder(
            name = "Filled.DeviceTabletCameraFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 24f)
                horizontalLineTo(64f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                verticalLineTo(208f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineTo(192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 24f)
                close()
                moveTo(128f, 80f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 80f)
                close()
            }
        }.build()

        return _DeviceTabletCameraFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceTabletCameraFill: ImageVector? = null
